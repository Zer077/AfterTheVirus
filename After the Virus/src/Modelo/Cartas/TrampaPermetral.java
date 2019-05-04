/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;

/**
 *
 * @author Zero
 */
public class TrampaPermetral extends Carta implements Serializable {

    public TrampaPermetral(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Trampa perimetral", Escenario, 10, 0);
    }

    @Override
    public void action() {

        for (int y = 0; y < 6; y++) {

            Carta zomb = escenario.mazoDescartes.getMazo().get(y);

            if (zomb instanceof Zombie) {

                escenario.mazoZombies.getDescarteZombies().add((Zombie) zomb);
                escenario.mazoDescartes.getMazo().remove(y);

            }

        }

        escenario.areaJugable.EliminarCarta(this);
    }

    @Override
    public void descripcion() {

        System.out.println("Trampa perimetral: Descarta esta carta para descartar 6 zombies de la pila de descartes.");
    }

}
