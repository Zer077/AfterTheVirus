/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.shuffle;

/**
 *
 * @author Jose
 * 
 * Solventacion de errores Miguel  y José
 */
public abstract class Mazo implements Serializable {

    Escenario escenario;
    private ArrayList<Carta> mazo = new ArrayList();

    public Mazo(Escenario escenario) {
        this.escenario = escenario;

    }

    public void barajar() {
        /*sencillamente se barajan las cartas del array*/
        shuffle(mazo);
    }

    //Al usar una carta acaba aquí a no ser que se especifique lo contrario
    public void IntroducirCarta(Carta carta) {

        mazo.add(carta);

    }

    /**
     * @return the mazo
     */
    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    /**
     * @param mazo the mazo to set
     */
    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

}
