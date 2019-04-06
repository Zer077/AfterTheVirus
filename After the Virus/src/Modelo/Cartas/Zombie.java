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
public abstract class Zombie extends Carta{

    private ArrayList zombie;

    public Zombie(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(precio, nombre, Escenario, tipo, activacion);
    }

    

    abstract public void atacaHumano();

    abstract public void muereZombie();

    /**
     * @return the zombie
     */
    public ArrayList getZombie() {
        return zombie;
    }

    /**
     * @param zombie the zombie to set
     */
    public void setZombie(ArrayList zombie) {
        this.zombie = zombie;
    }

}
