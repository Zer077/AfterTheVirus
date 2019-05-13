
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
 * @author Cristian
 *
 * Solventacion de errores José
 */
public class Superviviente extends Carta implements Serializable {

    public Superviviente(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Superviviente", Escenario, 12, 1);
    }

    @Override
    public void action() {
        if (this != escenario.areaJugable.BuscarCartaNombre("Superviviente")) {
            escenario.areaJugable.AniadirCarta(this);
            System.out.println("Añadido al area de juego");
            escenario.mano.getMano().remove(this);
        }
    }

    @Override
    public String descripcion() {
        return ("-");
    }

}
