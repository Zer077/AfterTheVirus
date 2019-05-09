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
 * @author Cristan
 */
public class Guia extends Carta implements Serializable {

    public Guia(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Guía", Escenario, 12, 0);
    }

    @Override
    public void action() {

        if (escenario.mazoZombies.getDescarteZombies().size() == 1) {
            escenario.mazoZombies.getDescarteZombies().remove(0);
        } else if (escenario.mazoZombies.getDescarteZombies().size() >= 2) {
            escenario.mazoZombies.getDescarteZombies().remove(0);
            escenario.mazoZombies.getDescarteZombies().remove(0);
        } else {
            System.out.println("No hay zombies para descartar.");
        }

        escenario.areaJugable.DescartarCarta(this);
    }

    @Override
    public String descripcion() {
        return ("Se descarta para remover 2 zombis de una pila de descarte.");
    }

}
