/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import Modelo.Cartas.ObjetivoSeguro;
import Modelo.Cartas.HabilidadConArmas;
import Modelo.Cartas.HabilidadConTrampas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose
 * Solventacion de errores Miguel  y José
 */
public class AreaJugable implements Serializable {

    private ArrayList<Carta> ArrayJugables = new ArrayList();
    Escenario escenario;

    public AreaJugable(Escenario escenario) {
        this.escenario = escenario;
    }

    public void AniadirCarta(Carta carta) {

        if (carta.getActivacion() == 0) {

            jugarCartaGratuita(carta);
        } else {
            ArrayJugables.add(carta);

        }

    }

    //A traves del numero de una carta este metodo la jugará
    public void jugarCarta() {

        escenario.vista.verAreaJugador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Que carta quieres jugar?");
        int numero = sc.nextInt();

        if (ArrayJugables.get(numero - 1).getTipo() <= 3) {

            for (int i = 0; i < ArrayJugables.size(); i++) {

                if (ArrayJugables.get(i) instanceof ObjetivoSeguro) {

                    escenario.vista.verAreaZombies();
                    System.out.println("A que Zombie quieres atacar?");

                    int numero2 = sc.nextInt();
                    escenario.arrayZombies.get(numero2 - 1).muereZombie();

                }
            }
        } else if (ArrayJugables.get(numero - 1).isActiva() == true) {

            ArrayJugables.get(numero - 1).action();
        } else {
            System.out.println("La carta no está activa");
        }

    }

    public void jugarCartaGratuita(Carta card) {
        card.action();
    }

    //Pregunta que carta deseas activar, llamas al menú para que te devuelva las cartas que quieres dar a cambio de la activacion y las eliminas    
    public boolean ActivarCarta(ArrayList<Carta> cartas) {

        //Va a buscar la carta habilidad con trampa //Va a buscar la carta WeaponSkill tambien
        for (int l = 0; l < ArrayJugables.size(); l++) {

            if (ArrayJugables.get(l) instanceof HabilidadConTrampas && ArrayJugables.get(l).isActiva()) {

                if (TrampSkillCard(cartas) == true) {
                    return true;
                }

                //Si WeaponSkill no está activa solo te deja activar una carta
            }

            //Si WeaponSkill está activa y selecciona una carta que jugar tipo arma matas a un zombie y activa la carta
            if (ArrayJugables.get(l) instanceof HabilidadConArmas && ArrayJugables.get(l).isActiva()) {
                if (WeaponSkillCard(cartas) == true) {
                    return true;
                }

                //Si WeaponSkill no está activa solo te deja activar una carta
            }

        }
        escenario.vista.verAreaJugador();

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione carta que activar");
        int numero = sc.nextInt();

        //REVISION
        if (ArrayJugables.get(numero - 1).getActivacion() == cartas.size()) {

            ArrayJugables.get(numero - 1).setActiva(true);
            return true;
        } else {
            System.out.println("Vuelve a intentarlo");

            return false;
        }

    }

    public Carta BuscarCartaNombre(String n) {
        for (int i = 0; i < ArrayJugables.size(); i++) {

            if (ArrayJugables.get(i).getNombre().equals(n)) {

                return ArrayJugables.get(i);
            }
        }
        return null;
    }

    public Carta BuscarCartaTipo(int j) {
        for (int i = 0; i < ArrayJugables.size(); i++) {
            if (ArrayJugables.get(i).getTipo() == j) {

                return ArrayJugables.get(i);
            }

        }
        return null;
    }

    public void EliminarCarta(Carta card) {

        escenario.mazoEliminadas.IntroducirCarta(card);

        ArrayJugables.remove(card);

    }

    public void DescartarCarta(Carta card) {

        escenario.mazoDescartes.IntroducirCarta(card);

        ArrayJugables.remove(card);

    }

    /**
     * @return the ArrayJugables
     */
    public ArrayList<Carta> getArrayJugables() {
        return ArrayJugables;
    }

    /**
     * @param ArrayJugables the ArrayJugables to set
     */
    public void setArrayJugables(ArrayList<Carta> ArrayJugables) {
        this.ArrayJugables = ArrayJugables;
    }

    public boolean comprobarArma() {

        //si tienes 2 o mas armas activas o 1 arma y te falta un brazo devuelve false
        int contador = 0;
        for (int i = 0; i < ArrayJugables.size(); i++) {
            if (ArrayJugables.get(i).getTipo() == 8 && ArrayJugables.get(i).isActiva()) {
                contador++;
            }
        }
        return !((contador >= 1 && escenario.personaje.isBrazo() == true) || contador >= 2);

    }

    public boolean WeaponSkillCard(ArrayList cartas) {
        escenario.vista.verAreaJugador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione carta que jugar");
        int numeroActivar = sc.nextInt();

        //si la carta elegida es un arma
        if (ArrayJugables.get(numeroActivar - 1).getTipo() == 10) {

            escenario.vista.verAreaZombies();
            System.out.println("A que Zombie quieres atacar?");

            int numero2 = sc.nextInt();
            escenario.arrayZombies.get(numero2 - 1).muereZombie();

            Carta aux = ArrayJugables.get(numeroActivar - 1);

            if (aux.getActivacion() == cartas.size()) {

                ArrayJugables.get(numeroActivar - 1).setActiva(true);
                return true;

            } else {
                ArrayJugables.get(numeroActivar - 1).setActiva(true);
                return false;

            }

        }
        return false;
    }

    public boolean TrampSkillCard(ArrayList cartas) {
        escenario.vista.verAreaJugador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione carta que jugar");
        int numeroActivar = sc.nextInt();

        //si la carta elegida es un arma
        if (ArrayJugables.get(numeroActivar - 1).getTipo() == 10) {

            escenario.vista.verAreaZombies();
            System.out.println("A que Zombie quieres atacar?");

            int numero2 = sc.nextInt();
            escenario.arrayZombies.get(numero2 - 1).muereZombie();

            Carta aux = ArrayJugables.get(numeroActivar);

            if (aux.getActivacion() == cartas.size()) {

                ArrayJugables.get(numeroActivar - 1).setActiva(true);
                return true;
            } else {
                System.out.println("Vuelve a intentarlo");
            }

            escenario.menuOpciones.ElegirOpcion();
        } else {
            ArrayJugables.get(numeroActivar - 1).setActiva(true);
            return false;

        }
        return false;

    }

}
