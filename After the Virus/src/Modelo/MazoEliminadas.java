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
public class MazoEliminadas extends Mazo {

    ArrayList<Carta> MazoEliminadas = new ArrayList();

    //Al eliminar cartas pasarán a este array, simplemente quiero sacar alguna carta al mazoJugador de nuevo
    public MazoEliminadas(Escenario escenario) {
        super(escenario);
    }

    public void IntroducirCarta(Carta carta) {

    }

    public void SacarCarta(Carta carta) {

    }


}
