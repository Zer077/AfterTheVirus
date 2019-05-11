package Modelo.Cartas;

import Controlador.EfectoDeSonido;
import Modelo.Escenario;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Pistola extends CartaArma implements Serializable {

    public Pistola(int precio, String nombre, Escenario Escenario, int tipo, int activacion, int municion) {

        super(2, "Pistola", Escenario, 3, 1, 1);
    }

    @Override
    public void action() {

        if (!escenario.arrayZombies.isEmpty()) {
            if (this.municion == 1) {
                Scanner sc = new Scanner(System.in);
                this.GastarMunicion();
                escenario.vista.verAreaZombies();
                System.out.println("Selecciona el zombie: ");
                int a = sc.nextInt();
                if (!escenario.arrayZombies.isEmpty()) {
                    escenario.arrayZombies.get(a - 1).muereZombie();
                } else {
                    System.out.println("no quedan mas zombis");
                }
            } else if (this.municion == 0 && this.isActiva()) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Descarta la pistola para atacar");
                escenario.mazoDescartes.IntroducirCarta(this);
                escenario.vista.verAreaZombies();
                System.out.println("Selecciona el zombie: ");
                int a = sc.nextInt();
                escenario.arrayZombies.get(a - 1).muereZombie();
                EfectoDeSonido efect = new EfectoDeSonido("bang.mp3");
                efect.start();
            }
        }
    }

    @Override
    public String descripcion() {

        return ("Una vez por turno:\nDescarta 1M o la pistola para matar 1 zombi.");
    }

}
