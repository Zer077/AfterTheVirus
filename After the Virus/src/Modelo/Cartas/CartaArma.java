/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public abstract class CartaArma extends Carta implements Serializable {

    ArrayList<Carta> cartas;
    int municion;

    public CartaArma(int precio, String nombre, Escenario Escenario, int tipo, int activacion, int municion) {
        super(precio, nombre, Escenario, tipo, activacion);
        cartas = new ArrayList<>();
        this.municion = municion;
    }

    public void AniadirMunicion(Carta carta) {

        cartas.add(carta);

    }

    public void GastarMunicion() {

        escenario.mazoDescartes.IntroducirCarta(cartas.remove(0));
    }

}
