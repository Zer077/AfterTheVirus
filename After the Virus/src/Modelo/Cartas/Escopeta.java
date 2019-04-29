package Modelo.Cartas;

import Modelo.Escenario;
import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Escopeta extends CartaArma {

    public Escopeta(int precio, String nombre, Escenario Escenario, int tipo, int activacion, int municion) {

        super(1, "Escopeta", Escenario, 3, 0, 0);
    }

    @Override
    public void action() {

        if (this.municion == 0) {
            Scanner sc = new Scanner(System.in);
            escenario.vista.verAreaZombies();
            System.out.println("Selecciona el zombie: ");
            int a = sc.nextInt();
            escenario.arrayZombies.get(a).muereZombie();
            escenario.mazoEliminadas.IntroducirCarta(this);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hay que descartar una munición para atacar");
            this.GastarMunicion();
            escenario.vista.verAreaZombies();
            System.out.println("Selecciona el zombie: ");
            int a = sc.nextInt();
            escenario.arrayZombies.get(a).muereZombie();
        }

    }

    @Override
    public void descripcion() {

        System.out.println("Se descarta 1M o se destruye la escopeta para matar 1 zombi.");
    }

}
