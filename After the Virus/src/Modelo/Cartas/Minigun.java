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
public class Minigun extends CartaArma {

    public Minigun(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(precio, nombre, Escenario, tipo, activacion,0);
    }

    @Override
    public void action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void descripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
