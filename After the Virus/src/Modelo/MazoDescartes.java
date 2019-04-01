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
public class MazoDescartes extends Mazo {

    ArrayList<Carta> MazoDescarte = new ArrayList();

    public MazoDescartes(Escenario escenario) {
        super(escenario);
    }

    //Al usar una carta acaba aquí a no ser que se especifique lo contrario
    public void IntroducirCarta(Carta carta) {

    }

    //Todas las cartas de descartes las mete en el MazoJugador
    public void RestaurarMazo() {

    }

}
