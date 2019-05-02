/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;

/**
 *
 * @author Carlos
 */
public class HabilidadConTrampas extends Carta {

    public HabilidadConTrampas(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Habilidad Con Trampas", Escenario, 9, 1);
    }

    @Override
    public void action() {
         escenario.areaJugable.AniadirCarta(this);
         escenario.mano.getMano().remove(this);
    }

    @Override
    public void descripcion() {
        System.out.println("Cada vez que se prepara una trampa, se mata 1 zombie.");
    }

}
