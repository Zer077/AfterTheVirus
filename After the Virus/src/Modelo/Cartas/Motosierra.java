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
public class Motosierra extends Carta implements Serializable {

    public Motosierra(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Motosierra", Escenario, 2, 2);
    }

    @Override
    public void action() {

        for (int i = 0; i <= 5; i++) {
            if (!escenario.arrayZombies.isEmpty()) {
                escenario.arrayZombies.get(0).muereZombie();
                if (i == 0) {
                    EfectoDeSonido efect = new EfectoDeSonido("motosierra.mp3");
                    efect.start();

                }
            } else {
                System.out.println("no quedan mas zombis");
            }

        }
        escenario.areaJugable.DescartarCarta(this);
    }

    @Override
    public String descripcion() {
        return ("Se descarta para matar 6 zombis");
    }

}
