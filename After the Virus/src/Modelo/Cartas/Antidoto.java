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
 * @author Maria Perez
 */
public class Antidoto extends Carta implements Serializable {

    public Antidoto(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Antidoto", Escenario, 7, 0);
    }

    @Override
    public void action() {
        escenario.personaje.setDefensa(escenario.personaje.getDefensa() + 1);
        escenario.areaJugable.EliminarCarta(this);
    }

    @Override
    public String descripcion() {
        return ("Se destruye para prevenir el siguiente daño en ese turno.");
    }

}
