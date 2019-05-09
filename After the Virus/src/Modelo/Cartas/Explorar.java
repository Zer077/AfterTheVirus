/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;

/**
 *
 * @author Cristian
 * 
 * Solventacion de errores José
 */
public class Explorar extends Carta implements Serializable {

    public Explorar(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Explorar", Escenario, 12, 0);
    }

    @Override
    public void action() {

        escenario.compraCartas.explora(escenario.mazoEscenario.getMazo().get(0));
        escenario.compraCartas.explora(escenario.mazoEscenario.getMazo().get(0));

        escenario.areaJugable.DescartarCarta(this);
    }

    @Override
    public String descripcion() {
        return ("Se descarta para scoutear 2 cartas.");
    }

}
