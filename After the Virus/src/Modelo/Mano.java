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
public class Mano {

    ArrayList<Carta> Mano = new ArrayList();
    Escenario escenario;

    //Esta mano debe usar la carta segun la opcion elegida en el menú
    public Mano(Escenario escenario) {

    }
    //al usar la carta es la que pondrá la carta en descartes, este metodo ejecutará el action de la carta tambien

    public void usarCartas(int[] cartas, int opcion) {

    }
    
    //busca una carta para sacarla, el action la usará para poderse activar, si no no hará nada y volverá al menú de eleccion
    public Carta sacarCarta(){
        
        
        
        
        return null;
    }

}
