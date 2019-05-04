/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Zero
 */
public abstract class Mazo implements Serializable {

    Escenario escenario;
    private ArrayList<Carta> Mazo = new ArrayList();

    public Mazo(Escenario escenario) {
        this.escenario = escenario;

    }

    public void IntroducirCarta(Carta card) {

        Mazo.add(card);

    }

    /**
     * @return the Mazo
     */
    public ArrayList<Carta> getMazo() {
        return Mazo;
    }

    /**
     * @param Mazo the Mazo to set
     */
    public void setMazo(ArrayList<Carta> Mazo) {
        this.Mazo = Mazo;
    }

}
