/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Personaje;

import Modelo.Cartas.Granada;
import Modelo.Cartas.Trinchera;
import Modelo.Cartas.Perro;
import Modelo.Cartas.Pistola;
import Modelo.Cartas.Bar;
import Modelo.Cartas.Saquear;
import Modelo.Cartas.Correr;
import Modelo.Cartas.Escopeta;
import Modelo.Cartas.Superviviente;
import Modelo.Cartas.HabilidadConArmas;
import Modelo.Escenario;

/**
 *
 * @author Jose
 */
public class Ruth extends Personaje {

    public Ruth(Escenario escenario) {
        super(escenario);
        for (int i = 0; i < 3; i++) {
            escenario.mazoJugador.IntroducirCarta(new Superviviente(0, nombre, escenario, 0, 0));
        }
        escenario.mazoJugador.IntroducirCarta(new Escopeta(0, nombre, escenario, 0, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Granada(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Trinchera(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new HabilidadConArmas(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Bar(0, nombre, escenario, 0, 0));

        escenario.mazoEscenario.IntroducirCarta(new Correr(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Correr(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Correr(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Pistola(0, nombre, escenario, 0, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Perro(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Saquear(0, nombre, escenario, 0, 0));

        super.nombre = "Ruth";

    }

}
