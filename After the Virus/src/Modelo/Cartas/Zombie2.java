/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jose
 *
 * Solventacion de errores José
 */
public class Zombie2 extends Zombie implements Serializable {

    public Zombie2(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(0, "Z2", Escenario, 0, 0);
        zombie = new ArrayList<>();
        zombie.add(new Zombi());
        zombie.add(new Zombi());
        super.setNumeroZombie(2);
    }

    //NO HACER
    @Override
    public void action() {

    }

    @Override
    public String descripcion() {
        return "-";
    }

}
