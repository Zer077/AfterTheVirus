/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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

}
