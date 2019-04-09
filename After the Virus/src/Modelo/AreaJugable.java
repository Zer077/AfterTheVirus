/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import Modelo.Cartas.ObjetivoSeguro;
import Modelo.Cartas.HabilidadConArmas;
import Vista.MenuOpciones;
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

    //A traves del numero de una carta este metodo la jugará
    public void jugarCarta() {
        VistaEscenario vista = new VistaEscenario();
        for (int i = 0; i < ArrayJugables.size(); i++) {

            System.out.println(ArrayJugables.get(i).getNombre());
        }
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for (int i = 0; i < ArrayJugables.size(); i++) {

            if (ArrayJugables.get(i) instanceof ObjetivoSeguro) {

                vista.VerZombie();
                System.out.println("A que Zombie quieres atacar?");

                int numero2 = sc.nextInt();
                escenario.arrayZombies.get(numero2).muereZombie();

            }
        }

        ArrayJugables.get(numero).action();

    }

    //Pregunta que carta deseas activar, llamas al menú para que te devuelva las cartas que quieres dar a cambio de la activacion y las eliminas    
    public void ActivarCarta() {
        VistaEscenario vista = new VistaEscenario();
        Carta WeaponSkillAuxiliar = null;
        
        //Va a buscar la carta WeaponSkill
        for (int i = 0; i < ArrayJugables.size(); i++) {

            if (ArrayJugables.get(i) instanceof HabilidadConArmas) {
                WeaponSkillAuxiliar = ArrayJugables.get(i);

            }
        }
        
        //Si WeaponSkill está activa y señecciona una carta que jugar tipo arma matas a un zombie y activa la carta
        if (WeaponSkillAuxiliar.isActiva()) {
            for (int j = 0; j < ArrayJugables.size(); j++) {

                System.out.println(ArrayJugables.get(j).getNombre());
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Seleccione carta que jugar");
            int numeroActivar = sc.nextInt();
            if (ArrayJugables.get(numeroActivar).getTipo() == 3) {

                vista.VerZombie();
                System.out.println("A que Zombie quieres atacar?");

                int numero2 = sc.nextInt();
                escenario.arrayZombies.get(numero2).muereZombie();

                ArrayJugables.get(numeroActivar).setActiva(true);
            }
            
            //Si WeaponSkill no está activa solo te deja activar una carta
        } else {
            for (int j = 0; j < ArrayJugables.size(); j++) {

                System.out.println(ArrayJugables.get(j).getNombre());
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Seleccione carta que jugar");
            int numero = sc.nextInt();

            ArrayJugables.get(numero).setActiva(true);
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

}
