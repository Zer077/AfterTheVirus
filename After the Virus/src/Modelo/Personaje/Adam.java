/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Personaje;

import Modelo.Cartas.Ametralladora;
import Modelo.Cartas.Antidoto;
import Modelo.Cartas.Perro;
import Modelo.Cartas.Pistola;
import Modelo.Cartas.Bar;
import Modelo.Cartas.BombaDeDemolición;
import Modelo.Cartas.ChaquetaDeCuero;
import Modelo.Cartas.Coche;
import Modelo.Cartas.Saquear;
import Modelo.Cartas.Correr;
import Modelo.Cartas.Cura;
import Modelo.Cartas.Escopeta;
import Modelo.Cartas.Explorar;
import Modelo.Cartas.Gasolina;
import Modelo.Cartas.Granada;
import Modelo.Cartas.Superviviente;
import Modelo.Cartas.HabilidadConArmas;
import Modelo.Cartas.HabilidadConTrampas;
import Modelo.Cartas.KitMedico;
import Modelo.Cartas.Laboratorio;
import Modelo.Cartas.Lanzallamas;
import Modelo.Cartas.MC;
import Modelo.Cartas.Machete;
import Modelo.Cartas.Motosierra;
import Modelo.Cartas.ObjetivoSeguro;
import Modelo.Cartas.Revista;
import Modelo.Cartas.TrampaPermetral;
import Modelo.Cartas.Trinchera;
import Modelo.Cartas.Tunel;
import Modelo.Cartas.VIP;
import Modelo.Escenario;
import java.io.Serializable;

/**
 *
 * @author Jose
 *
 * Solventacion de errores José
 */
public class Adam extends Personaje implements Serializable {

    public Adam(Escenario escenario) {
        super(escenario);
//        escenario.mazoJugador.IntroducirCarta(new Perro(0, nombre, escenario, 0, 0));
//        escenario.mazoJugador.IntroducirCarta(new Saquear(0, nombre, escenario, 0, 0));
//        for (int i = 0; i < 3; i++) {
//            escenario.mazoJugador.IntroducirCarta(new Superviviente(0, nombre, escenario, 0, 0));
//            escenario.mazoJugador.IntroducirCarta(new Correr(0, nombre, escenario, 0, 0));
//        }
//
//        escenario.mazoEscenario.IntroducirCarta(new Pistola(0, nombre, escenario, 0, 0, 0));
//        escenario.mazoEscenario.IntroducirCarta(new Granada(0, nombre, escenario, 0, 0));
//        escenario.mazoEscenario.IntroducirCarta(new Escopeta(0, nombre, escenario, 0, 0, 0));
//        escenario.mazoEscenario.IntroducirCarta(new Trinchera(0, nombre, escenario, 0, 0));
//        escenario.mazoEscenario.IntroducirCarta(new HabilidadConArmas(0, nombre, escenario, 0, 0));
//        escenario.mazoEscenario.IntroducirCarta(new Bar(0, nombre, escenario, 0, 0));

//PARA PROBAR
        escenario.mazoJugador.IntroducirCarta(new Pistola(0, nombre, escenario, 0, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Granada(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Escopeta(0, nombre, escenario, 0, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Trinchera(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new HabilidadConArmas(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Bar(0, nombre, escenario, 0, 0));

        escenario.mazoJugador.IntroducirCarta(new Antidoto(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new BombaDeDemolición(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Coche(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Motosierra(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Cura(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Lanzallamas(0, nombre, escenario, 0, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Gasolina(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Laboratorio(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new ChaquetaDeCuero(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new MC(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Machete(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new KitMedico(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Ametralladora(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new TrampaPermetral(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Explorar(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new ObjetivoSeguro(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new HabilidadConTrampas(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Tunel(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new VIP(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.IntroducirCarta(new Revista(0, nombre, escenario, 0, 0));

        super.nombre = "Adam";

    }

}
