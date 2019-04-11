/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Escenario;
import Modelo.Personaje.Personaje;
import Modelo.Personaje.Jennie;

/**
 *
 * @author Zero
 */
public class Controlador extends Escenario {

    //Debe encargarse de que funcione la aplicacion con las diversas mecánicas
    //NOTA IMPORTANTE, AL PRINCIPIO DEL JUEGO DEBEMOS DARLE ALEATORIAMENTE ENTRE 1 Y 3 CARTAS ZOMBIE AL MAZO JUGADOR
    //CREAR 3 CONTROLADORES  PARA LOS 3 MODOS DE JUEGO
    
    //importante crear el personaje deseado antes de comenzar la partida, si no está creado el personaje dar error y comenzar juego de nuevo
    public Controlador(Personaje personaje) {
        this.personaje=personaje;
    }

    public void controlador1a() {
    }

    public void controlador1b() {
    }

    public void controlador1c() {
    }
}
