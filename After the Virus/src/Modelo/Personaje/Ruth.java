/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Personaje;

import Modelo.Cartas.Antidoto;
import Modelo.Cartas.BombaDeDemolición;
import Modelo.Cartas.Coche;
import Modelo.Cartas.Motosierra;
import Modelo.Cartas.Granada;
import Modelo.Cartas.FuegoCruzado;
import Modelo.Cartas.Palanca;
import Modelo.Cartas.Cura;
import Modelo.Cartas.Trinchera;
import Modelo.Cartas.Lanzallamas;
import Modelo.Cartas.Comida;
import Modelo.Cartas.Gasolina;
import Modelo.Cartas.Guia;
import Modelo.Cartas.Laboratorio;
import Modelo.Cartas.ChaquetaDeCuero;
import Modelo.Cartas.MC;
import Modelo.Cartas.Machete;
import Modelo.Cartas.Revista;
import Modelo.Cartas.KitMedico;
import Modelo.Cartas.Ametralladora;
import Modelo.Cartas.TrampaPermetral;
import Modelo.Cartas.Perro;
import Modelo.Cartas.Pistola;
import Modelo.Cartas.Bar;
import Modelo.Cartas.Saquear;
import Modelo.Cartas.Correr;
import Modelo.Cartas.Refugio;
import Modelo.Cartas.Explorar;
import Modelo.Cartas.Escopeta;
import Modelo.Cartas.ObjetivoSeguro;
import Modelo.Cartas.Superviviente;
import Modelo.Cartas.HabilidadConTrampas;
import Modelo.Cartas.Tunel;
import Modelo.Cartas.VIP;
import Modelo.Cartas.HabilidadConArmas;
import Modelo.Escenario;
import java.io.Serializable;

/**
 *
 * @author Zero
 */
public class Ruth extends Personaje implements Serializable {

    public Ruth(Escenario escenario) {
        super(escenario);
        escenario.mazoJugador.getMazo().add(new Refugio(0, nombre, escenario, 0, 0));
        for (int i = 0; i < 3; i++) {
            escenario.mazoJugador.getMazo().add(new Superviviente(0, nombre, escenario, 0, 0));
        }
        escenario.mazoJugador.getMazo().add(new Escopeta(0, nombre, escenario, 0, 0, 0));
        escenario.mazoJugador.getMazo().add(new Granada(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.getMazo().add(new Trinchera(0, nombre, escenario, 0, 0));
        escenario.mazoJugador.getMazo().add(new HabilidadConArmas(0, nombre, escenario, 0, 0));

        escenario.mazoEscenario.getMazo().add(new Palanca(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Antidoto(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new BombaDeDemolición(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Coche(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Motosierra(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new FuegoCruzado(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Cura(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Lanzallamas(0, nombre, escenario, 0, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Comida(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Gasolina(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Guia(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Laboratorio(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new ChaquetaDeCuero(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new MC(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Machete(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new KitMedico(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Ametralladora(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new TrampaPermetral(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Perro(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Bar(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Correr(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Explorar(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new ObjetivoSeguro(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new HabilidadConTrampas(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Tunel(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new VIP(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Revista(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Saquear(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazo().add(new Pistola(0, nombre, escenario, 0, 0, 0));

        super.nombre = "Ruth";

    }

}
