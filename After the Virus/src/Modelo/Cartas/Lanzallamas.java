package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Lanzallamas extends CartaArma implements Serializable {

    public Lanzallamas(int precio, String nombre, Escenario Escenario, int tipo, int activacion, int municion) {

        super(3, "Lanzallamas", Escenario, 3, 1, 0);
    }

    @Override
    public void action() {
        //revision
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (!escenario.arrayZombies.isEmpty()) {
                System.out.println("Selecciona el zombie: ");
                int a = sc.nextInt();

                escenario.arrayZombies.get(a - 1).muereZombie();

            }
        }
        escenario.areaJugable.DescartarCarta(this);
    }

    @Override
    public String descripcion() {

        return ("Descarta para matar a 3 zombis.");
    }

}
