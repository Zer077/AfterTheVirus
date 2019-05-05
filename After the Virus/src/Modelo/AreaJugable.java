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
import Vista.VistaEscenario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zero
 */
public class AreaJugable {

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
        VistaEscenario vista = new VistaEscenario(escenario);
        escenario.vista.verAreaJugador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Que carta quieres jugar?");
        int numero = sc.nextInt();

        if (ArrayJugables.get(numero).getTipo() == 3) {

            for (int i = 0; i < ArrayJugables.size(); i++) {

                if (ArrayJugables.get(i) instanceof ObjetivoSeguro) {

                    vista.verAreaZombies();
                    System.out.println("A que Zombie quieres atacar?");

                    int numero2 = sc.nextInt();
                    escenario.arrayZombies.get(numero2).muereZombie();

                }
            }
        } else if (ArrayJugables.get(numero).isActiva() == true) {

            ArrayJugables.get(numero).action();
        }

    }

    public void jugarCartaGratuita(Carta card) {
        card.action();
    }

    //Pregunta que carta deseas activar, llamas al menú para que te devuelva las cartas que quieres dar a cambio de la activacion y las eliminas    
    public boolean ActivarCarta(ArrayList<Carta> cartas) {
        VistaEscenario vista = new VistaEscenario(escenario);
        Carta WeaponSkillAuxiliar = null;
        Carta HabilidadConTrampa = null;

        //Va a buscar la carta habilidad con trampa
        for (int l = 0; l < ArrayJugables.size(); l++) {

            if (ArrayJugables.get(l) instanceof HabilidadConTrampas) {
                HabilidadConTrampa = ArrayJugables.get(l);

            }

            //Va a buscar la carta WeaponSkill
            for (int i = 0; i < ArrayJugables.size(); i++) {

                if (ArrayJugables.get(i) instanceof HabilidadConArmas) {
                    WeaponSkillAuxiliar = ArrayJugables.get(i);

                }

            }
            if (HabilidadConTrampa.isActiva()) {
                escenario.vista.verAreaJugador();
                Scanner sc = new Scanner(System.in);
                System.out.println("Seleccione carta que jugar");
                int numeroActivar = sc.nextInt();

                //si la carta elegida es un arma
                if (ArrayJugables.get(numeroActivar).getTipo() == 10) {

                    vista.verAreaZombies();
                    System.out.println("A que Zombie quieres atacar?");

                    int numero2 = sc.nextInt();
                    escenario.arrayZombies.get(numero2).muereZombie();

                    Carta aux = ArrayJugables.get(numeroActivar);

                    if (aux.getActivacion() == cartas.size()) {

                        ArrayJugables.get(numeroActivar).setActiva(true);
                        return true;
                    } else {
                        System.out.println("Vuelve a intentarlo");
                    }

                    escenario.menuOpciones.ElegirOpcion();
                } else {
                    ArrayJugables.get(numeroActivar).setActiva(true);
                }

                //Si WeaponSkill no está activa solo te deja activar una carta
            }

            //Si WeaponSkill está activa y señecciona una carta que jugar tipo arma matas a un zombie y activa la carta
            if (WeaponSkillAuxiliar.isActiva()) {
                escenario.vista.verAreaJugador();
                Scanner sc = new Scanner(System.in);
                System.out.println("Seleccione carta que jugar");
                int numeroActivar = sc.nextInt();

                //si la carta elegida es un arma
                if (ArrayJugables.get(numeroActivar).getTipo() == 3) {

                    vista.verAreaZombies();
                    System.out.println("A que Zombie quieres atacar?");

                    int numero2 = sc.nextInt();
                    escenario.arrayZombies.get(numero2).muereZombie();

                    Carta aux = ArrayJugables.get(numeroActivar);

                    if (aux.getActivacion() == cartas.size()) {

                        ArrayJugables.get(numeroActivar).setActiva(true);
                        return true;
                    } else {
                        System.out.println("Vuelve a intentarlo");
                    }

                    escenario.menuOpciones.ElegirOpcion();
                } else {
                    ArrayJugables.get(numeroActivar).setActiva(true);
                }

                //Si WeaponSkill no está activa solo te deja activar una carta
            }
            escenario.vista.verAreaJugador();

            Scanner sc = new Scanner(System.in);
            System.out.println("Seleccione carta que jugar");
            int numero = sc.nextInt();
            Carta aux = ArrayJugables.get(numero);

            //REVISION
            if (aux.getActivacion() == cartas.size()) {

                ArrayJugables.get(numero).setActiva(true);
                return true;
            } else {
                System.out.println("Vuelve a intentarlo");
            }

            escenario.menuOpciones.ElegirOpcion();

            return false;
        }
        return false;
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
        int contador = 0;
        for (int i = 0; i < ArrayJugables.size(); i++) {
            if (ArrayJugables.get(i).getTipo() == 8) {
                contador++;
            }
        }
        if (contador >= 2 || contador >= 1 && escenario.personaje.isBrazo() == false) {

            return false;

        } else {
            return true;
        }

    }

}
