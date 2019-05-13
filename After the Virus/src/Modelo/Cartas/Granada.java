/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Controlador.EfectoDeSonido;
import Modelo.Escenario;
import java.io.Serializable;

/**
 *
 * @author Miguel
 */
public class Granada extends Carta implements Serializable {

    public Granada(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Granada", Escenario, 1, 1);
    }

    @Override
    public void action() {
        //revision
        for (int i = 0; i < 5; i++) {
            if (!escenario.arrayZombies.isEmpty()) {
                escenario.arrayZombies.get(0).descartaCartaZombie();
            } else {
                System.out.println("No hay mas zombis");
            }
        }
        EfectoDeSonido efect = new EfectoDeSonido("granada.mp3");
        efect.start();
        escenario.areaJugable.DescartarCarta(this);

    }

    @Override
    public String descripcion() {
        return ("Se descarta para descartar 5 zombies");
    }

}
