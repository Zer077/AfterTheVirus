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
 */
public class Zombie3 extends Zombie implements Serializable{

    public Zombie3(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(0, "Z3", Escenario, 0, 0);
        zombie = new ArrayList<>();
        zombie.add(new Zombi());
        zombie.add(new Zombi());
        zombie.add(new Zombi());
        super.setNumeroZombie(3);
    }

    @Override
    public void atacaHumano() {
        for (int i = 0; i < zombie.size(); i++) {
            if (zombie.get(i).isVivo() == true) {
                escenario.personaje.parteCuerpoAtacar();

            }
        }
        escenario.mazoZombies.getDescarteZombies().add(this);
        escenario.mazoZombies.eliminarZombieArray(this);

    }

    //NO HACER
    @Override
    public void action() {
    }

    @Override
    public String descripcion() {
  return null;    }

}
