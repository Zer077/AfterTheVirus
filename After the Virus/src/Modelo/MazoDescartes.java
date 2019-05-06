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
 * @author Abraham
 */
public class MazoDescartes extends Mazo {



    public MazoDescartes(Escenario escenario) {
        super(escenario);
    }



    //Todas las cartas de descartes las mete en el MazoJugador
    public void RestaurarMazo() {

        int ncartasd = super.getMazo().size();
        for (int cont = 0; cont < ncartasd; cont++) {

            escenario.mazoJugador.getMazo().add(super.getMazo().get(cont));

        }

        super.getMazo().clear();

    }


}
