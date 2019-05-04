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
 * @author Abraham
 */
public class MazoEliminadas extends Mazo implements Serializable {

    //Al eliminar cartas pasarán a este array, simplemente quiero sacar alguna carta al mazoJugador de nuevo
    public MazoEliminadas(Escenario escenario) {
        super(escenario);
    }

    public void SacarCarta(Carta carta) {

        String nomcarta = carta.getNombre();
        int cont = getMazo().size();
        for (int x = 0; x < cont; x++) {

            if (getMazo().get(x).getNombre().equals(nomcarta)) {

                escenario.mazoJugador.getMazo().add(getMazo().get(x));

            }

        }

    }

}
