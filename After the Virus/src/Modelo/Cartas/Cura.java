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
public class Cura extends Carta {

    public Cura(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Cura", Escenario, 7, 1);
    }

    @Override
    public void action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void descripcion() {
        System.out.println("Se destruye para convertir una carta de 1 zombi en un sobreviviente preparado, cuando sea salvado, se regresa a la pila de zombis. ");

    }

}
