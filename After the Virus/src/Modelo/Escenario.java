/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.CompraCartas;
import Controlador.MiHilo;
import Modelo.Cartas.Carta;
import Modelo.Cartas.Zombie;
import Modelo.Personaje.*;
import Vista.MenuOpciones;
import Vista.MenuPrincipal;
import Vista.VistaEscenario;
import java.util.ArrayList;

/**
 *
 * @author Zero
 */
public abstract class Escenario {

//contiene todo el escenario principal
    public CompraCartas compraCartas;
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
    // public ArrayList<Carta> arrayMano = new ArrayList<>();
    public ArrayList<Carta> arrayEliminadas = new ArrayList<>();
    public ArrayList<Carta> arrayDescartadas = new ArrayList<>();
    public ArrayList<Carta> arrayEscenario = new ArrayList<>();
    public ArrayList<MiHilo> musicas = new ArrayList<>();
    public Escenario escenario = this;
    public Personaje personaje;
    public int Ronda;
    public int PersonasSalvadas;
    public boolean salir = false;

}
