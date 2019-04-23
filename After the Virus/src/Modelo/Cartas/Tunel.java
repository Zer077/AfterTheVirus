/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;

/**
 *
 * @author Zero
 */
public class Tunel extends Carta {

    public Tunel(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, nombre, Escenario, 8, 8);
    }

    @Override
    public void action() {
        
        for (int i = 0; i < escenario.areaJugable.getArrayJugables().size(); i++) {

            escenario.areaJugable.BuscarCartaTipo(12).setActiva(true);
            

            escenario.areaJugable.EliminarCarta(this);
        }
        
        }

    @Override
    public void descripcion() {
        System.out.println("Preparar personas es gratis.");
    }

}
