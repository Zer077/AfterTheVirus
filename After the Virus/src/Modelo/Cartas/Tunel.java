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
 * @author maria perez
 */
public class Tunel extends Carta implements Serializable {

    public Tunel(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Tunel", Escenario, 8, 0);
    }

    @Override
    public void action() {

        for (int i = 0; i < escenario.areaJugable.getArrayJugables().size(); i++) {

            escenario.areaJugable.BuscarCartaTipo(12).setActiva(true);

            escenario.areaJugable.DescartarCarta(this);
        }

    }

    @Override
    public String descripcion() {
        return ("Preparar personas es gratis. Se activa con refugio");
    }

    @Override
    public void setActiva(boolean activa) {

        if (escenario.mano.sacarCartaPorNombre("Refugio") != null) {
            escenario.mazoDescartes.IntroducirCarta(escenario.mano.sacarCartaPorNombre("Refugio"));
            super.setActiva(activa);
        } else {
            System.out.println("No se puede activar la carta, no tienes la carta refugio en la mano");
        }
    }

}
