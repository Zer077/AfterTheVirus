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
public class VIP extends Carta {

    public VIP(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(3, "VIP", Escenario, 12, 1);
    }

    @Override
    public void action() {
        
//        if (escenario.areaJugable.getArrayJugables().contains(CasaSegura)){
//            escenario.PersonasSalvadas = 3;
//            escenario.areaJugable.EliminarCarta(this);
//        }
        
    }

    @Override
    public void descripcion() {
        System.out.println("Equivale a 3 survivors si se juega safe house. Entonces se destruye.");
    }

}