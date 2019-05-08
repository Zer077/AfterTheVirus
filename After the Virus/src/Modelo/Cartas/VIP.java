/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;

/**
 *
 * @author Zero
 */
public class VIP extends Carta implements Serializable{

    public VIP(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(3, "VIP", Escenario, 12, 1);
    }

    @Override
    public void action() {
        escenario.areaJugable.AniadirCarta(this);
        escenario.mano.getMano().remove(this);
    }

    @Override
    public String descripcion() {
        return("Equivale a 3 supervivientes si se juega Refugio. Entonces se destruye.");
    }

}
