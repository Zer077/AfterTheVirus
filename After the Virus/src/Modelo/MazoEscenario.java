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
public class MazoEscenario extends Mazo {

    private ArrayList<Carta> MazoEscenario = new ArrayList();
//Esta clase permitirá tener las cartas que podremos comprar para tenerlas en nuestro Array de juego

    public MazoEscenario(Escenario escenario) {
        super(escenario);
    }

    /**
     * @return the MazoEscenario
     */
    public ArrayList<Carta> getMazoEscenario() {
        return MazoEscenario;
      
    }

    /**
     * @param MazoEscenario the MazoEscenario to set
     */
    public void setMazoEscenario(ArrayList<Carta> MazoEscenario) {
        this.MazoEscenario = MazoEscenario;
    }
    
    
    

}
