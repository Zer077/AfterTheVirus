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
public class Gasolina extends Carta {

    public Gasolina(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Gasolina",Escenario, 4, 1);
    }

    @Override
    public void action() {
        
        for (int i = 0; i < escenario.areaJugable.getArrayJugables().size(); i++) {
            
            if (escenario.areaJugable.getArrayJugables().get(i).getTipo() == 10) {
                escenario.areaJugable.getArrayJugables().get(i).setActiva(true);

            }
            
            if (escenario.areaJugable.getArrayJugables().get(i).getTipo() == 14) {
                escenario.areaJugable.getArrayJugables().get(i).setActiva(true);

            }
            
            
            if (escenario.areaJugable.getArrayJugables().get(i).getTipo() == 1 || escenario.areaJugable.getArrayJugables().get(i).getTipo() ==  2 || escenario.areaJugable.getArrayJugables().get(i).getTipo() == 3) {
                escenario.areaJugable.getArrayJugables().get(i).setActiva(true);

            }
            
            escenario.areaJugable.EliminarCarta(this);
        }
    }

    @Override
    public void descripcion() {
        System.out.println(" Se destruye para preparar cualquier número de trampas, vehículos y armas");
    }

}
