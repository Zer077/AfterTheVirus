/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import java.util.ArrayList;
import Modelo.Escenario;

/**
 *
 * @author Abraham
 */
public class MazoEliminadas extends Mazo {

    Escenario escenario;
    ArrayList<Carta> MazoEliminadas = new ArrayList();

    //Al eliminar cartas pasarán a este array, simplemente quiero sacar alguna carta al mazoJugador de nuevo
    public MazoEliminadas(Escenario escenario) {
        super(escenario);
    }

    public void IntroducirCarta(Carta carta) {

        MazoEliminadas.add(carta);

    }

    public void SacarCarta(Carta carta) {

        String nomcarta = carta.getNombre();
        int cont = MazoEliminadas.size();
        for (int x = 0; x < cont; x++) {

            if (nomcarta == MazoEliminadas.get(x).getNombre()) {

                escenario.mazoJugador.getMazoJugador().add(MazoEliminadas.get(x));

            }

        }

    }

}
