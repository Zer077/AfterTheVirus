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
public class ChaquetaDeCuero extends Carta {

    public ChaquetaDeCuero(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "ChaquetaDeCuero", Escenario, 7, 0);
    }

    @Override
    public void action() {
        escenario.personaje.setDefensa(escenario.personaje.getDefensa()+2);
    }

    @Override
    public void descripcion() {
        System.out.println("Se destruye para prevenir los siguientes 2 daños en ese turno.");    
    }

}
