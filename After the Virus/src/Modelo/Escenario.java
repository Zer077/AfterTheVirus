/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.CompraCartas;
import Modelo.Cartas.Carta;
import Modelo.Cartas.Zombie;
import Modelo.Personaje.*;
import java.util.ArrayList;

/**
 *
 * @author Zero
 */
public abstract class Escenario {
//contiene todo el escenario principal

    CompraCartas compraCartas = new CompraCartas(this);
    public MazoEscenario mazoEscenario = new MazoEscenario(this);
    public MazoDescartes mazoDescartes = new MazoDescartes(this);
    public MazoEliminadas mazoEliminadas = new MazoEliminadas(this);
    public MazoJugador mazoJugador = new MazoJugador(this);
    public MazoZombies mazoZombies = new MazoZombies(this);
    public Mano mano = new Mano(this);
    public ArrayList<Carta> arrayEscenario = new ArrayList<>();
    public AreaJugable areaJugable = new AreaJugable(this);
    public ArrayList<Zombie> arrayZombies = new ArrayList<>();
    public ArrayList<Carta> arrayMano = new ArrayList<>();
    public ArrayList<Carta> arrayEliminadas = new ArrayList<>();
    public ArrayList<Carta> arrayDescartadas = new ArrayList<>();
    public Jennie personaje = null;
    public int Ronda;
    public int PersonasSalvadas;

}
