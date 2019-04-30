/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import java.util.ArrayList;
import java.util.Scanner;
import Modelo.Escenario;

/**
 *
 * @author Abraham
 */
public class MazoDescartes extends Mazo {

    Escenario escenario;
    private ArrayList<Carta> MazoDescarte = new ArrayList();

    public MazoDescartes(Escenario escenario) {
        super(escenario);
    }

    //Al usar una carta acaba aquí a no ser que se especifique lo contrario
    public void IntroducirCarta(Carta carta) {

        MazoDescarte.add(carta);

    }

    //Todas las cartas de descartes las mete en el MazoJugador
    public void RestaurarMazo() {

        int ncartasd = MazoDescarte.size();
        for (int cont = 0; cont < ncartasd; cont++) {

            escenario.mazoJugador.getMazoJugador().add(MazoDescarte.get(cont));

        }

        MazoDescarte.clear();

    }

    public ArrayList<Carta> getMazoDescarte() {
        return MazoDescarte;
    }

    public void setMazoDescarte(ArrayList<Carta> MazoDescarte) {
        this.MazoDescarte = MazoDescarte;
    }

    
    
    
    
}
