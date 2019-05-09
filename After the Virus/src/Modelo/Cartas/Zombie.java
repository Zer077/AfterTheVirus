/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public abstract class Zombie extends Carta implements Serializable {

    public ArrayList<Zombi> zombie;
    private int numeroZombie;

    public Zombie(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(precio, nombre, Escenario, tipo, activacion);
    }

    abstract public void atacaHumano();

    //lleva al zombie a la pila de descartes de los zombies
    public void muereZombie() {

        if (Contador() == numeroZombie) {

            for (int i = 0; i < zombie.size(); i++) {
                zombie.get(i).setVivo(true);

            }
            escenario.mazoZombies.getDescarteZombies().add(this);
            escenario.mazoZombies.eliminarZombieArray(this);
        }
    }

    public void muereCartaZombie() {

        for (int i = 0; i < zombie.size(); i++) {
            zombie.get(i).setVivo(true);

        }
        escenario.mazoZombies.getDescarteZombies().add(this);
        escenario.mazoZombies.eliminarZombieArray(this);

    }

    //lleva al zombie a la pila de descartes del mazo del jugador
    public void descartaZombie() {

        if (Contador() == numeroZombie) {
            for (int i = 0; i < zombie.size(); i++) {
                zombie.get(i).setVivo(true);

            }
            escenario.mazoDescartes.IntroducirCarta(this);
            escenario.mazoZombies.eliminarZombieArray(this);

        }
    }

    public void descartaCartaZombie() {

        for (int i = 0; i < zombie.size(); i++) {
            zombie.get(i).setVivo(true);

        }
        escenario.mazoDescartes.IntroducirCarta(this);
        escenario.mazoZombies.eliminarZombieArray(this);

    }

    public int Contador() {

        int contador = 0;
        int contador2 = 0;
        for (int i = 0; i < zombie.size(); i++) {
            System.out.println("------------------");
            contador2++;
            System.out.println("Zombie numero: " + contador2);
            if (zombie.get(i).isVivo() == true) {
                System.out.println("Estado: Vivo");
            } else {
                System.out.println("Estado: Muerto");
            }

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("A que zombie quieres matar:");
        int zombieMatar = sc.nextInt();

        zombie.get(zombieMatar - 1).setVivo(false);

        for (int i = 0; i < zombie.size(); i++) {
            if (zombie.get(i).isVivo() == false) {
                contador++;
            }

        }

        return contador;

    }

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
