/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cartas.Carta;
import Modelo.Escenario;

/**
 *
 * @author Zero
 */
public class CompraCartas {

    //Es una clase que va a necesitar mazoEscenario y el array de escenario ademas de arrayJugador, va a encargarse de explorar las cartas ademas de poder comprarlas, al comprar las lleva a juego
    Escenario escenario;

    public CompraCartas(Escenario escenario) {
        this.escenario = escenario;

    }

    
    //Este metodo le paso una carta que es el COSTO de explorar
    public void explora(Carta carta) {
    
    }
    
    
    //En este metodo le paso un array de cartas que es el costo de comprar X carta, esa X carta a comprar es el propio método el que contea cuanto vale y cual quiere comprar, si la cantidad de cartas pasadas es mayor las devuelve a la mano
    //En este caso es este método el encargado de eliminar las cartas de la mano
    public void compra(Carta[] carta) {

    }


}
