/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import Modelo.Personaje.*;
import java.util.ArrayList;

/**
 *
 * @author Zero
 */
public abstract class Escenario {
//contiene todo el escenario principal

    public MazoEscenario mazoEscenario = new MazoEscenario(this);
    public MazoDescartes mazoDescartes = new MazoDescartes(this);
    public MazoEliminadas mazoEliminadas = new MazoEliminadas(this);
    public MazoJugador mazoJugador = new MazoJugador(this);
    public MazoZombies mazoZombies = new MazoZombies(this);
    public Mano mano = new Mano(this);
    public ArrayList<Carta> arrayEscenario = new ArrayList<>();
    public ArrayList<Carta> arrayJugador = new ArrayList<>();
    public ArrayList<Carta> arrayZombies = new ArrayList<>();
    public ArrayList<Carta> arrayMano = new ArrayList<>();
    public ArrayList<Carta> arrayEliminadas = new ArrayList<>();
    public ArrayList<Carta> arrayDescartadas = new ArrayList<>();
    public Personaje1 personaje = null;
    public int Ronda;
    public int PersonasSalvadas;
 
}
