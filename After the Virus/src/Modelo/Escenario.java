/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Exploracion;
import Controlador.GuardarYCargarPartida;
import Controlador.MiHilo;
import Controlador.SeleccionMusica;
import Modelo.Cartas.Carta;
import Modelo.Cartas.Zombie;
import Modelo.Personaje.*;
import Vista.MenuOpciones;
import Vista.MenuPrincipal;
import Vista.Ventana;
import Vista.VistaEscenario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public abstract class Escenario implements Serializable {

//contiene todo el escenario principal
    public Exploracion compraCartas;
    public MazoEscenario mazoEscenario;
    public MazoDescartes mazoDescartes;
    public MazoEliminadas mazoEliminadas;
    public MazoJugador mazoJugador;
    public MazoZombies mazoZombies;
    public Mano mano;
    public MenuPrincipal menuPrincipal;
    public MenuOpciones menuOpciones;
    public VistaEscenario vista;
    public AreaJugable areaJugable;
    public ArrayList<Zombie> arrayZombies = new ArrayList<>();
    public ArrayList<Carta> arrayEliminadas = new ArrayList<>();
    public ArrayList<Carta> arrayDescartadas = new ArrayList<>();
    public ArrayList<Carta> arrayEscenario = new ArrayList<>();
    public MiHilo m;
    public SeleccionMusica SM;
    public Escenario escenario = this;
    public Personaje personaje;
    public int Ronda;
    public int PersonasSalvadas;
    public boolean salir = false;
    public Ventana v;
    public GuardarYCargarPartida GYC;

}
