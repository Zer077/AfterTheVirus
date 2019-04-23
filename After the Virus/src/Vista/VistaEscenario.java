/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Escenario;
import Modelo.Personaje.Personaje;
import Modelo.Cartas.*;

/**
 *
 * @author Zero
 */
public class VistaEscenario {

    //Debe enseñarme de una forma bonita todo lo que hay en el escenario
    Escenario escenario;
    public VistaEscenario(Escenario escenario) {
        this.escenario=escenario;
    }

    public void verEscenarioGeneral(){
        verJugador();
        verAreaJugador();
        verAreaExploracion();
        verMano();       
    }

    public void verMano(){
        System.out.println("----------Tu mano de cartas----------");
        //bucle para ver todas las cartas de la mano.
        System.out.println("Nombre de la carta: ");
        System.out.println("Descripción: ");
        System.out.println("Coste preparar: ");

    }
    
    public void verAreaExploracion(){
        System.out.println("----------Área de exploración----------");
        //bucle para ver todas las cartas que están exploradas.
        System.out.println("Nombre de la carta: ");
        System.out.println("Descripción: ");
        System.out.println("Precio: ");
        System.out.println("Coste preparar: ");
    }

    public void verAreaZombies(){
        System.out.println("----------Área de zombies----------");
        System.out.println("Hay x cartas en la mesa.");
        //bucle para mostrar todos los zombies.
        System.out.println("Número de zombies en la carta:");
    }

    public void verAreaJugador(){
        System.out.println("----------Tu área de juego----------");
        //bucle para ver todas las cartas.
        System.out.println("Nombre de la carta: ");
        System.out.println("Descripción: ");
        System.out.println("¿Preparada?: ");
        //según si está o no preparada:
        //preparada no:
        System.out.println("Coste preparar: ");
    }

    public void verJugador(){
        System.out.println("----------Tu personaje----------");
        System.out.println("Nombre: ");
        System.out.println("Heridas: ");
        System.out.println("Oleada: ");
        System.out.println("Supervivientes rescatados: ");
    }

}
