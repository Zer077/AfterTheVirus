/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import java.util.ArrayList;
import static java.util.Collections.shuffle;

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
    public void sacarCincoCartas() {

        /*
         con un array auxiliar que luego vamos a devolver a otra clase,
         lo rellenamos con las cartas del personaje que nos pasan desde la clase
         */
     

        for (int i = 4; i >= 0; i--) {
            escenario.mano.AniadirCarta(MazoJugador.remove(0));
          
        }

           
        

    }//fin del metodo
    
    
    public void aniadir(Carta card){
    
    
    MazoJugador.add(card);
    
    }
    

    public void barajarCartasPersonaje() {
        /*sencillamente se barajan las cartas del array*/
        shuffle(MazoJugador);
    }

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
