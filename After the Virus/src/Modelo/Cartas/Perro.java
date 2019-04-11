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
public class Perro extends Carta {
    
//Precio --> recuperar 
//Activacion --> preparar
    public Perro(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Perro", Escenario, 11, 0);
    }

    @Override
    public void action() {
        
        //Hacer acción para descartar la carta y matar 1 zombie.
        
        escenario.areaJugable.EliminarCarta(this);
    }

    @Override
    public void descripcion() {
        System.out.println("Se descarta para matar 1 zombi.");
    }

}
