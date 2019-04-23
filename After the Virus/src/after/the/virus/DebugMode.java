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
    Escenario esc=new Escenario();
    public DebugMode() {
    
    }

    public void iniciar() {

        System.out.println("personaje a elegir");
        Scanner sr=new Scanner(System.in);
        int n = sr.nextInt();
        Personaje personaje = null;
        switch (n) {

            case 1:
                personaje = new Adam(esc);

                break;
            case 2:
                personaje = new Ruth(esc);

                break;
            case 3:
                personaje = new Jennie(esc);

                break;
            case 4:
                personaje = new Robert(esc);

                break;
        }
        System.out.println("ronda");
        int r = sr.nextInt();
        esc.Ronda = r;
        System.out.println("rescatados");
        int p = sr.nextInt();
        esc.PersonasSalvadas = p;
        System.out.println("cartas en juego");
        int cartasEnJuego = sr.nextInt();
        for (int i = 0; i < cartasEnJuego; i++) {
            //Carta a elegir por nombre
        System.out.println("elegir nombre carta");
            String name = sr.next();
            for (int j = 0; j < esc.mazoJugador.getMazoJugador().size(); j++) {

                if (esc.mazoJugador.getMazoJugador().get(i).getNombre() == name) {
                    esc.areaJugable.AniadirCarta(esc.mazoJugador.getMazoJugador().remove(i));
                    System.out.println("activar carta? Si/-");
                    
                    String siNo = sr.next();

                    if (siNo.equals("Si")) {
                        esc.areaJugable.BuscarCartaNombre(name).setActiva(true);

                    } else {
                        esc.areaJugable.BuscarCartaNombre(name).setActiva(false);
                    }

                }

            }
        }
        Controlador controlador = new Controlador(personaje);
        System.out.println("elegir controlador");
        int m = sr.nextInt();
        
        System.out.println("Zombie extra");
        int zext = sr.nextInt();

        for (int i = 0; i < zext; i++) {

            esc.arrayZombies.add((Zombie) esc.mazoZombies.getMazoZombie().remove(0));
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
