/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Modelo.Personaje.Personaje;

/**
 *
 * @author Zero
 */
public class Controlador extends Escenario {

    int contador;

    //Debe encargarse de que funcione la aplicacion con las diversas mecánicas
    //NOTA IMPORTANTE, AL PRINCIPIO DEL JUEGO DEBEMOS DARLE ALEATORIAMENTE ENTRE 1 Y 3 CARTAS ZOMBIE AL MAZO JUGADOR
    //CREAR 3 CONTROLADORES  PARA LOS 3 MODOS DE JUEGO
    public Controlador(Personaje p) {
        personaje = p;
    }

    public void controlador1a() {
        //preparacion: comienza con 1 oleada (añadir 1-3 cartas zombi random)

        int coge = (int) Math.random() * 3 + 1;
        //mazoJugador.getMazoJugador().add(mazoZombies.introducirAleatorio(coge));

        do {
            mazoJugador.getMazoJugador();
            //demas mazos
            mazoJugador.barajarCartasPersonaje();
            mazoJugador.sacarCincoCartas();
            //menu uso de cartas
            //turno Zombies
            mazoZombies.introducir();
            mazoJugador.barajarCartasPersonaje();
            /*1- Se establece las cartas de Jugador
        2- Se establecen los demás mazos
        3-Se baraja las cartas del jugador
        4- La mano del jugador coje 5 cartas y la puede usar para varias cosas:
            1-Usar de las cartas inactivas (activar y usar),
            2-Usar para colocar (inactiva) (Si se coloca una carta de costo 0 de activacion activar automáticamente)
            3-Usar para comprar
            4-Usar para Explorar
        Al acabar las ronda comienzan los zombies, ronda 1 es 1 carta Zombie, ronda 2, 2 cartas Zombie…
        5-Se sacan cartas Zombie y meten en el mazo de jugador
        6-Se baraja las cartas del jugador
             */

            for (int i = 0; i < areaJugable.getArrayJugables().size(); i++) {
                if (areaJugable.getArrayJugables().get(i).isActiva() == true) {
                    contador++;
                }
            }

            if (personaje.isCabeza() == true) {
                System.out.println("HAS MUERTO");
            } else if (personaje.isCabeza() == false && contador >= 6) {
                System.out.println("HAS GANADO");
            }

            Ronda++;
            contador = 0;

        } while (personaje.isCabeza() == false);
    }

    public void controlador1b() {
        //objetivo: acaba el turno con 4 supervivientes rescatados
        //Preparacion:Comienza con 1 oleada. comienza con 5 cartas de zombi a cada mazo
    }

    public void controlador1c() {
        //objetivo: acaba el turno con 6 supervivientes rescatados y una instalacion preparada
        //preparacion: comienza con 1 oleada.
    }

}
