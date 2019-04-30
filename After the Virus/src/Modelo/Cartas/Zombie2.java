/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.util.ArrayList;

/**
 *
 * @author Zero
 */
public class Zombie2 extends Zombie {

    public Zombie2(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(precio, nombre, Escenario, tipo, activacion);
        zombie = new ArrayList<>();
        zombie.add(new Zombi());
        zombie.add(new Zombi());
        super.setNumeroZombie(2);
    }

    @Override
    public void atacaHumano() {
        for (int i = 0; i < zombie.size(); i++) {
            if (zombie.get(i).isVivo() == true) {
                escenario.personaje.parteCuerpoAtacar();

            }
            escenario.mazoZombies.getDescarteZombies().add(this);
            escenario.mazoZombies.eliminarZombieArray(this);
        }
    }

    //NO HACER
    @Override
    public void action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void descripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
