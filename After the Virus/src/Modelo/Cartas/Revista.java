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
public class Revista extends Carta {

    public Revista(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Revista", Escenario, 0, 0);
    }

    @Override
    public void action() {
    System.out.println("No puedes hacer esto, pero esta Revista te llena de determinación");
    escenario.mano.usarCartas(escenario.menuOpciones.ElegirCartas(), escenario.menuOpciones.ElegirOpcion());
    }

    @Override
    public void descripcion() {
        System.out.println("Municion para tu arma");
    }

}
