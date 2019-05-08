/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Maria
 */
public class MazoEscenario extends Mazo implements Serializable {

//Esta clase permitirá tener las cartas que podremos comprar para tenerlas en nuestro Array de juego
    public MazoEscenario(Escenario escenario) {
        super(escenario);
    }

}
