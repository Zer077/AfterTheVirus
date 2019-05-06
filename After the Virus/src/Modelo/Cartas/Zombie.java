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
 * @author Jose
 */
public abstract class Zombie extends Carta {

    public ArrayList<Zombi> zombie;
    private int numeroZombie;

    public Zombie(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(precio, nombre, Escenario, tipo, activacion);
    }

    abstract public void atacaHumano();

    //lleva al zombie a la pila de descartes de los zombies
    public void muereZombie() {

        for (int i = 0; i < zombie.size(); i++) {
            zombie.get(i).setVivo(true);

        }
        escenario.mazoZombies.getDescarteZombies().add(this);
        escenario.mazoZombies.eliminarZombieArray(this);
    }

    ;
    
    
    //lleva al zombie a la pila de descartes del mazo del jugador
     public void descartaZombie() {

        for (int i = 0; i < zombie.size(); i++) {
            zombie.get(i).setVivo(true);

        }
        escenario.mazoDescartes.IntroducirCarta(this);
        escenario.mazoZombies.eliminarZombieArray(this);

    }

    ;

    /**
     * @return the numeroZombie
     */
    public int getNumeroZombie() {
        return numeroZombie;
    }

    /**
     * @param numeroZombie the numeroZombie to set
     */
    public void setNumeroZombie(int numeroZombie) {
        this.numeroZombie = numeroZombie;
    }

    /**
     * @return the zombie
     */
}
