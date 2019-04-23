/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Escenario;
import Modelo.Personaje.Personaje;
import Modelo.Cartas.*;
import Modelo.MazoEscenario;
import Modelo.Personaje.Adam;
import java.util.ArrayList;

/**
 *
 * @author Maria
 */
public class VistaEscenario {
    
    Escenario escenario;
    public VistaEscenario(Escenario escenario) {
        this.escenario=escenario;
        verEscenarioGeneral();
    }

    public void verEscenarioGeneral(){
        verJugador();
        verAreaJugador();
        verAreaExploracion();
        verAreaZombies();
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
        System.out.println("----------------------------------------");
    }

    public void verAreaJugador(){
        System.out.println("----------Tu área de juego----------");
        //bucle para ver todas las cartas.
        ArrayList <Carta> areajugador = escenario.areaJugable.getArrayJugables();
        for(Carta x : areajugador){
            System.out.println("**********");
            System.out.println("Nombre de la carta: "+x.getNombre());
            System.out.println("Descripción: ");
            x.descripcion();
            if(x.isActiva()){
                System.out.println("¿Preparada? --> SI");
            }else{
                System.out.println("¿Preparada? --> NO");
                System.out.println("Coste preparar: "+x.getActivacion());
            }
            System.out.println("**********");
        }
        System.out.println("----------------------------------------");
    }

    public void verJugador(){
        System.out.println("----------Tu personaje----------");
        System.out.println("Nombre: "+escenario.personaje.getNombre());
        System.out.println("Heridas: ");
        if(escenario.personaje.isBrazo()){
            System.out.println("*Brazo: X");
        }else{
            System.out.println("*Brazo: ");
        }
        if(escenario.personaje.isPierna()){
            System.out.println("*Pierna: X");
        }else{
            System.out.println("*Pierna: ");
        }
        System.out.println("Oleada: "+escenario.Ronda);
        System.out.println("Supervivientes rescatados: "+escenario.PersonasSalvadas);
        System.out.println("----------------------------------------");
    }

}
