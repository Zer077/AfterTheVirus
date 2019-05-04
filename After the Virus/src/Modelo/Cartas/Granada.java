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
public class Granada extends Carta implements Serializable {

    public Granada(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Granada", Escenario, 1, 1);
    }

    @Override
    public void action() {
        System.out.println("Usas la granada");
        for (int i = 0; i < 5; i++) {
            escenario.mazoZombies.getDescarteZombies().add(escenario.arrayZombies.get(0));
            escenario.arrayZombies.remove(0);
        }
        escenario.areaJugable.DescartarCarta(this);
    }

    @Override
    public void descripcion() {
        System.out.println("Se descarta para descartar 5 zombies");
    }

}
