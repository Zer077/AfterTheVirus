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
public class Lanzallamas extends Carta {

    public Lanzallamas(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(3, "Lanzallamas", Escenario, 3, 1);
    }

    @Override
    public void action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void descripcion() {
        System.out.println("Descarta para matar a 3 zombis.");
    }

}
