/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import java.util.ArrayList;

/**
 *
 * @author Zero
 */
public class AreaJugable {

    private ArrayList<Carta> ArrayJugables = new ArrayList();

    public AreaJugable(Escenario escenario) {
    }

    //A traves del numero de una carta este metodo la jugará
    public void jugarCarta(int numero) {

    }

    //Pregunta que carta deseas activar, llamas al menú para que te devuelva las cartas que quieres dar a cambio de la activacion y las eliminas    
    public boolean ActivarCarta(int[] carta) {

        return false;

    }

    public void BuscarCartaNombre(String n) {
    }

    public void BuscarCartaValor(int i) {
    }

    public void EliminarCarta(Carta carta) {
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
