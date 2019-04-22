/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package after.the.virus;

import Controlador.Controlador;
import Modelo.Cartas.Zombie;
import Modelo.Escenario;
import Modelo.Personaje.Adam;
import Modelo.Personaje.Jennie;
import Modelo.Personaje.Personaje;
import Modelo.Personaje.Robert;
import Modelo.Personaje.Ruth;

/**
 *
 * @author jose_
 */
public class DebugMode extends Escenario {

    public DebugMode() {

    }

    public void iniciar() {

        System.out.println("personaje a elegir");
        int n = 0;
        Personaje personaje = null;
        switch (n) {

            case 1:
                personaje = new Adam(this);

                break;
            case 2:
                personaje = new Ruth(this);

                break;
            case 3:
                personaje = new Jennie(this);

                break;
            case 4:
                personaje = new Robert(this);

                break;
        }

        int r = 0;
        Ronda = r;

        int p = 0;
        PersonasSalvadas = p;

        int cartasEnJuego = 0;
        for (int i = 0; i < cartasEnJuego; i++) {
            //Carta a elegir por nombre

            String name = "";
            for (int j = 0; j < mazoJugador.getMazoJugador().size(); j++) {

                if (mazoJugador.getMazoJugador().get(i).getNombre() == name) {
                    areaJugable.AniadirCarta(mazoJugador.getMazoJugador().remove(i));
                    //activar?
                    String siNo = null;

                    if (siNo.equals("Si")) {
                        areaJugable.BuscarCartaNombre(name).setActiva(true);

                    } else {
                        areaJugable.BuscarCartaNombre(name).setActiva(false);
                    }

                }

            }
        }
        Controlador controlador = new Controlador(personaje);
        int m = 0;
        switch (m) {
            case 1:
                controlador.controlador1a();
                break;
            case 2:
                controlador.controlador1b();
                break;
            case 3:
                controlador.controlador1c();
                break;
        }

        int zext = 0;

        for (int i = 0; i < zext; i++) {

            arrayZombies.add((Zombie) mazoZombies.getMazoZombie().remove(0));
        }

    }

}
