
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
public class Superviviente extends Carta {

    public Superviviente(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Superviviente", Escenario, 12, 1);
    }

    @Override
    public void action() {

    }

    @Override
    public void descripcion() {
        System.out.println("-");
    }

}
