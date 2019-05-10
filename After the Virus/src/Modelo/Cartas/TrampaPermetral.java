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
 * @author Abraham
 *
 * Solucionado errores por Jose
 */
public class TrampaPermetral extends Carta implements Serializable {

    public TrampaPermetral(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Trampa perimetral", Escenario, 10, 0);
    }

    @Override
    public void action() {
        int cont = 0;
        for (int y = escenario.mazoDescartes.getMazo().size() - 1; y > 0; y--) {

            if (escenario.mazoDescartes.getMazo().get(y) instanceof Zombie && cont < 6) {
                cont++;
                escenario.mazoZombies.getDescarteZombies().add((Zombie) escenario.mazoDescartes.getMazo().remove(y));

            }

        }

        escenario.areaJugable.EliminarCarta(this);
    }

    @Override
    public String descripcion() {

        return ("Trampa perimetral: Descarta esta carta para llevar 6 zombies de la pila de descartes.");
    }

}
