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
 * @author maria perez
 */
public class ChaquetaDeCuero extends Carta implements Serializable {

    public ChaquetaDeCuero(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "ChaquetaDeCuero", Escenario, 7, 0);
    }

    @Override
    public void action() {
        escenario.personaje.setDefensa(escenario.personaje.getDefensa() + 2);
        escenario.areaJugable.EliminarCarta(this);
    }

    @Override
    public String descripcion() {
        return ("Se destruye para prevenir los siguientes 2 daños en ese turno.");
    }

}
