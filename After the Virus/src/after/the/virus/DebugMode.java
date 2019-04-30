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
import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class DebugMode {

    Controlador controlador = new Controlador();

    public DebugMode() {

    }

    public void iniciar() {

        System.out.println("personaje a elegir");
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        Personaje personaje = null;
        switch (n) {

            case 1:
                personaje = new Adam(controlador);

                break;
            case 2:
                personaje = new Ruth(controlador);

                break;
            case 3:
                personaje = new Jennie(controlador);

                break;
            case 4:
                personaje = new Robert(controlador);

                break;
        }
        controlador.AniadirPersonaje(personaje);
        System.out.println("ronda");
        int r = sr.nextInt();
        controlador.Ronda = r;
        System.out.println("rescatados");
        int p = sr.nextInt();
        controlador.PersonasSalvadas = p;

        System.out.println("elegir controlador");
        int m = sr.nextInt();

        System.out.println("Zombie extra");
        int zext = sr.nextInt();

        for (int i = 0; i < zext; i++) {

            controlador.arrayZombies.add((Zombie) controlador.mazoZombies.getMazoZombie().remove(0));
        }

        System.out.println("cartas en juego");
        int cartasEnJuego = sr.nextInt();
        for (int i = 0; i < cartasEnJuego; i++) {
            //Carta a elegir por nombre
            System.out.println("elegir nombre carta");
            String name = sr.next();
            for (int j = 0; j < controlador.mazoJugador.getMazoJugador().size(); j++) {

                if (controlador.mazoJugador.getMazoJugador().get(j).getNombre().equals(name)) {
                    controlador.areaJugable.AniadirCarta(controlador.mazoJugador.getMazoJugador().remove(j));
                    System.out.println("activar carta? Si/-");

                    String siNo = sr.next();

                    if (siNo.equals("Si")) {

                        for (int k = 0; k < controlador.mazoJugador.getMazoJugador().size(); k++) {
                            if (controlador.mazoJugador.getMazoJugador().get(j).getNombre().equals(name)) {

                                controlador.areaJugable.BuscarCartaNombre(name).setActiva(true);

                            }

                        }

                    } else {
                       
                    }

                }

            }

            for (int j = 0; j < controlador.mazoEscenario.getMazoEscenario().size(); j++) {

                if (controlador.mazoEscenario.getMazoEscenario().get(j).getNombre().equals(name)) {
                    controlador.areaJugable.AniadirCarta(controlador.mazoEscenario.getMazoEscenario().remove(j));
                    System.out.println("activar carta? Si/-");

                    String siNo = sr.next();

                    if (siNo.equals("Si")) {

                        for (int k = 0; k < controlador.mazoEscenario.getMazoEscenario().size(); k++) {

                            if (controlador.mazoEscenario.getMazoEscenario().get(j).getNombre().equals(name)) {
                                controlador.areaJugable.BuscarCartaNombre(name).setActiva(true);

                            }
                        }

                    } else {
                        
                    }

                }

            }
        }

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

    }

}
