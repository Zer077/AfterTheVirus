/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Zombie;
import java.io.Serializable;
import java.util.Collections;

/**
 *
 * @author Maria Perez
 * 
 * Solventacion de errores Miguel  y José
 */
public class MazoJugador extends Mazo implements Serializable {

    public MazoJugador(Escenario escenario) {
        super(escenario);

    }
    //Cada turno sin cartas en la mano me sacará 5 cartas
    //metodo para ver si el mazo está vacio y devuelva true o false
    //mezclar cartas de descartes y sacar 5

    public void sacarCincoCartas() {

        /*
         con un array auxiliar que luego vamos a devolver a otra clase,
         lo rellenamos con las cartas del personaje que nos pasan desde la clase
         */
        try {
            if (super.getMazo().size() >= 5) {
                for (int i = 0; i < 5; i++) {
                    if (super.getMazo().get(0) instanceof Zombie) {
                        escenario.arrayZombies.add((Zombie) super.getMazo().remove(0));
                    } else {
                        escenario.mano.AniadirCarta(super.getMazo().remove(0));
                    }
                }
            } else {
                System.out.println("No quedan suficientes cartas, restaurando mazo del jugador");

                escenario.mazoDescartes.barajar();

                System.out.println("Mazo de descartes barajado correctamente");

                for (int d = 0; d < escenario.mazoDescartes.getMazo().size(); d++) {
                    super.getMazo().add(escenario.mazoDescartes.getMazo().remove(0));
                }
                System.out.println("Mazo de jugador restaurado correctamente");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//fin del metodo

}
