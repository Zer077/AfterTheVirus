/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose
 */
public class Revista extends Carta implements Serializable {

    public Revista(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Revista", Escenario, 0, 0);
    }

    @Override
    public void action() {
        System.out.println("No puedes hacer esto, pero leer esta Revista te llena de determinación");
        escenario.mano.getMano().add(this);

        try {
            escenario.menuOpciones.Menu();
        } catch (Throwable ex) {
            Logger.getLogger(Revista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String descripcion() {
        return ("Municion para tu arma");
    }

}
