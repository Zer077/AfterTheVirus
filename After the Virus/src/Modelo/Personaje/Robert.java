/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Personaje;

import Modelo.Cartas.Granada;
import Modelo.Cartas.FuegoCruzado;
import Modelo.Cartas.Palanca;
import Modelo.Cartas.Trinchera;
import Modelo.Cartas.Comida;
import Modelo.Cartas.Guia;
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
 * @author Zero
 */
public class Robert extends Personaje {

    public Robert(Escenario escenario) {
        super(escenario);
        for (int i = 0; i < 2; i++) {
            escenario.mazoJugador.IntroducirCarta(new Superviviente(0, nombre, escenario, 0, 0));
            escenario.mazoJugador.IntroducirCarta(new Correr(0, nombre, escenario, 0, 0));
        }
        escenario.mazoJugador.IntroducirCarta(new Palanca(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Comida(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Guia(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new FuegoCruzado(0, nombre, escenario, 0, 0));

        escenario.mazoEscenario.IntroducirCarta(new Superviviente(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Correr(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Pistola(0, nombre, escenario, 0, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Granada(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Escopeta(0, nombre, escenario, 0, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Trinchera(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new HabilidadConArmas(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Perro(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Bar(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.IntroducirCarta(new Saquear(0, nombre, escenario, 0, 0));

        super.nombre = "Robert";
    }

}
