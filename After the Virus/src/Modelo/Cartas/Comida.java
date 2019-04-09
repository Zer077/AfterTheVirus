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
public class Comida extends Carta {
    
    public Comida(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Comida", Escenario, 4, 0);
    }
    
    @Override
    public void action() {
        if (escenario.arrayZombies.isEmpty()) {
            if (escenario.personaje.isBrazo() == true) {
                escenario.personaje.setBrazo(false);
            }
            if (escenario.personaje.isPierna() == true) {
                escenario.personaje.setPierna(false);
            }
            escenario.areaJugable.EliminarCarta(this);
            
        }
        
    }
    
    @Override
    public void descripcion() {
        System.out.println("Si no hay zombis en el área de juego, se pone la carta sobre o bajo el deck de área para sanar 1 daño.");
        
    }
    
}