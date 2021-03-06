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
 * @author Jose
 */
public class HabilidadConArmas extends Carta implements Serializable {

    public HabilidadConArmas(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Habilidad Con Armas", Escenario, 9, 2);
    }

    @Override
    public void action() {
         if (this != escenario.areaJugable.BuscarCartaNombre("Habilidad Con Armas")) {
        escenario.areaJugable.AniadirCarta(this);
        escenario.mano.getMano().remove(this);}

    }

    @Override
    public String descripcion() {
        return ("Cada vez que se prepare un arma, se mata 1 zombie. ");
    }

}
