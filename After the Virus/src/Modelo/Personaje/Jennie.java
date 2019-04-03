/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Personaje;

import Modelo.Cartas.Pistol;
import Modelo.Cartas.Run;
import Modelo.Cartas.SafeHouse;
import Modelo.Cartas.Survivor;
import Modelo.Cartas.Zombie1;
import Modelo.Escenario;

/**
 *
 * @author Zero
 */
public class Jennie extends Personaje {

    public Jennie(Escenario escenario) {
        super(escenario);
        escenario.mazoJugador.getMazoJugador().add(new SafeHouse(0, nombre, escenario, 0));
        for (int i = 0; i < 3; i++) {
            escenario.mazoJugador.getMazoJugador().add(new Survivor(0, nombre, escenario, 0));
            escenario.mazoJugador.getMazoJugador().add(new Run(0, nombre, escenario, 0));
        }
        int numero = (int) (Math.random() * 2);
        for (int i = 0; i < numero; i++) {
            escenario.mazoJugador.getMazoJugador().add(new Zombie1(i, nombre, escenario, i));
        }

        super.nombre = "Jennie";

    }

}
