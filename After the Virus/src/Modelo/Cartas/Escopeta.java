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
public class Escopeta extends CartaArma {

    public Escopeta(int precio, String nombre, Escenario Escenario, int tipo, int activacion, int municion) {
//La escopeta se prepara añadiendo x cartas en la munición.
        super(1, "Escopeta", Escenario, 3, 0, 0);

    }

    @Override
    public void action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void descripcion() {
        System.out.println("Se descarta 1M o se destruye la escopeta para matar 1 zombi.");
    }

}
