/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Machete extends Carta implements Serializable {
    
    public Machete(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Machete", Escenario, 2, 0);
        
    }
    
    @Override
    public void action() {
        if (this != escenario.areaJugable.BuscarCartaNombre("Machete")) {
            
            escenario.mano.getMano().remove(this);
            escenario.areaJugable.AniadirCarta(this);
        }
    }
    
    @Override
    public String descripcion() {
        return ("Una vez por turo: Se descarta 1 carta de la mano para matar 1 zombi");
    }
    
}
