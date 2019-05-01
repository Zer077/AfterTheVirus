/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import Modelo.Cartas.Zombie;
import Modelo.Cartas.Zombie1;
import Modelo.Cartas.Zombie2;
import Modelo.Cartas.Zombie3;
import Modelo.Cartas.Zombie4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Zero
 */
public class MazoZombies extends Mazo {

    ArrayList<Carta> MazoZombie;
    ArrayList<Carta> descarteZombies;
    Zombie zombie;
    //Se encarga de administrar los monstruos, debe poner Zombies en su array de escenario y en cada turno restaurar el mazo en el orden correcto

    public MazoZombies(Escenario escenario) {
        super(escenario);
        MazoZombie = new ArrayList<>();
        descarteZombies = new ArrayList<>();
        crearMazo();
    }

    public void crearMazo() {
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    for (int z1 = 0; z1 < 5; z1++) {
                        Zombie zombie1 = new Zombie1(0, "Z1", escenario, 1, 0);
                        MazoZombie.add(zombie1);
                    }
                    break;
                case 2:
                    for (int z1 = 0; z1 < 4; z1++) {
                        Zombie zombie2 = new Zombie2(0, "Z2", escenario, 2, 0);
                        MazoZombie.add(zombie);
                    }
                    break;
                case 3:
                    for (int z1 = 0; z1 < 3; z1++) {
                        Zombie zombie3 = new Zombie3(0, "Z3", escenario, 3, 0);
                        MazoZombie.add(zombie);
                    }
                    break;
                case 4:
                    for (int z1 = 0; z1 < 2; z1++) {
                        Zombie zombie4 = new Zombie4(0, "Z4", escenario, 4, 0);
                        MazoZombie.add(zombie);
                    }
                    break;
            }
        }
    }

    /*Metodo que se encargará de sacar 1,2 o 3 cartas del mazo de zombies*/
    public void cogerRandom() {

        int coge = (int) Math.random() * 3 + 1;
        for (int i = 0; i < coge; i++) {
            escenario.mazoJugador.getMazoJugador().add(MazoZombie.get(0));
        }
    }

    /*Restaura el mazo de descartes de forma ordenada*/
    public void Restaurar() {
        for (int i = 0; i < descarteZombies.size() - 1; i++) {
            for (int j = 0; j < descarteZombies.size() - 1; j++) {
                if (descarteZombies.get(j).getTipo() < descarteZombies.get(j + 1).getTipo()) {
                    Zombie tmp = (Zombie) descarteZombies.get(j + 1);
                    MazoZombie.add(j + 1, descarteZombies.get(j));
                    MazoZombie.add(j, tmp);
                }
            }
        }

    }

    /*introduce en el mazo de jugador tantas cartas zombie como numero de la ronda es*/
    public void introducir() {
        for (int i = 0; i < escenario.Ronda; i++) {
            escenario.mazoJugador.getMazoJugador().add(MazoZombie.get(0));
            MazoZombie.remove(0);
        }
    }

    /*introduce en el mazo de jugador tantas cartas zombie como numero de parametro*/
    public void introducirAleatorio(int n) {
        for (int i = 0; i < n; i++) {
            escenario.mazoJugador.getMazoJugador().add(MazoZombie.get(0));
            MazoZombie.remove(0);
        }
    }

    public void ZombieAMatar() {

        escenario.vista.verAreaZombies();
        System.out.println("que zombie descartar?");
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        escenario.arrayZombies.get(n).muereZombie();

    }

    public void ZombieADescartar() {

        escenario.vista.verAreaZombies();
        System.out.println("que zombie descartar?");
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        escenario.arrayZombies.get(n).descartaZombie();

    }

    public void eliminarZombieArray(Carta card) {

        for (int i = 0; i < escenario.arrayZombies.size(); i++) {
            if (escenario.arrayZombies.get(i) == card) {
                escenario.arrayZombies.remove(i);

            }

        }

    }

    public ArrayList<Carta> getMazoZombie() {
        return MazoZombie;
    }

    public void setMazoZombie(ArrayList<Carta> MazoZombie) {
        this.MazoZombie = MazoZombie;
    }

    public ArrayList<Carta> getDescarteZombies() {
        return descarteZombies;
    }

    public void setDescarteZombies(ArrayList<Carta> descarteZombies) {
        this.descarteZombies = descarteZombies;
    }

    public Zombie getZombie() {
        return zombie;
    }

    public void setZombie(Zombie zombie) {
        this.zombie = zombie;
    }

}
