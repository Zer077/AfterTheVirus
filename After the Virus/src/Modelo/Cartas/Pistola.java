/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;

/**
 *
 * @author Maria
 */
public class Pistola extends CartaArma {

    public Pistola(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Pistola", Escenario, 3, activacion);
    }

    @Override
    public void action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void descripcion() {
        System.out.println("Una vez por turno:\nDescarta 1M o la pistola para matar 1 zombi.");
    }

}
