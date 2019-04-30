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
public class ObjetivoSeguro extends Carta {

    public ObjetivoSeguro(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Objetivo Seguro", Escenario, 9, 3);
    }

    @Override
    public void action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void descripcion() {
        System.out.println("Cada vez que se usa un arma de disparar, se mata 1 zombie adicional.");
    }

}
