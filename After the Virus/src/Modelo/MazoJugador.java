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
public class MazoJugador extends Mazo {

    private ArrayList<Carta> MazoJugador = new ArrayList();

    public MazoJugador(Escenario escenario) {
        super(escenario);
    }
    //Cada turno sin cartas en la mano me sacará 5 cartas
    //metodo para ver si el mazo está vacio y devuelva true o false
    //mezclar cartas de descartes y sacar 5

    /**
     * @return the MazoJugador
     */
    public ArrayList<Carta> getMazoJugador() {
        return MazoJugador;
    }

    /**
     * @param MazoJugador the MazoJugador to set
     */
    public void setMazoJugador(ArrayList<Carta> MazoJugador) {
        this.MazoJugador = MazoJugador;
    }

}
