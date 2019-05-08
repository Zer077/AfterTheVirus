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
public class Ametralladora extends CartaArma implements Serializable {

    public Ametralladora(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Ametralladora", Escenario, 3, 0, 0);
    }

    @Override
    public void action() {
        if (this.municion <= 0) {
            System.out.println("No tienes municion");
        } else {
            for (int i = 0; i < 2; i++) {
                escenario.arrayZombies.get(0).muereZombie();
            }
            this.GastarMunicion();
        }
    }

    @Override
    public String descripcion() {
        return ("Descarta municion para matar 2 zombies");
    }

}
