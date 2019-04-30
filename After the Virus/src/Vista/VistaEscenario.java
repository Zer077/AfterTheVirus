/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Escenario;
import Modelo.Cartas.*;
import java.util.ArrayList;

/**
 *
 * @author Maria
 */
public class VistaEscenario {

    Escenario escenario;

    public VistaEscenario(Escenario escenario) {

        this.escenario = escenario;
        // verEscenarioGeneral();
    }

    public void verEscenarioGeneral() {

        verJugador();
        verAreaJugador();
        verAreaExploracion();
        verAreaZombies();
        verMano();
    }

    public void verMano() {
        int posicion = 1;
        System.out.println("----------Tu mano de cartas----------");
        //bucle para ver todas las cartas de la mano.
        ArrayList<Carta> mano = escenario.mano.getMano();
        for (Carta x : mano) {
            System.out.println("CARTA Nº: " + posicion);
            System.out.println("Nombre de la carta: " + x.getNombre());
            System.out.println("Descripción: ");
            x.descripcion();
            System.out.println("Coste preparar: " + x.getActivacion());
            System.out.println("---------------");
            posicion++;
        }
    }

    public void verAreaExploracion() {
        int posicion = 1;

        System.out.println("----------Área de exploración----------");
        //bucle para ver todas las cartas que están exploradas.
        ArrayList<Carta> explorar = escenario.arrayEscenario;
        for (Carta x : explorar) {
            System.out.println("CARTA Nº: " + posicion);
            System.out.println("Nombre de la carta: " + x.getNombre());
            System.out.println("Descripción: ");
            x.descripcion();
            System.out.println("Precio: " + x.getPrecio());
            System.out.println("Coste preparar: " + x.getActivacion());
            posicion++;
        }

    }

    public void verAreaZombies() {
        int contador = 1;
        System.out.println("----------Área de zombies----------");
        ArrayList<Zombie> zombis = escenario.arrayZombies;
        System.out.println("Hay " + zombis.size() + " cartas de zombies en la mesa.");
        //bucle para mostra todos los zombies de la mesa.
        System.out.println("----------");

        /*  
        
        
        //Hecho por josé, da fallo
        for (int i = 0; i < escenario.arrayZombies.size(); i++) {
            
            
            //El fallo surge de aquí, no se la razón
            System.out.println(escenario.arrayZombies.get(i).getNumeroZombie());
            
            
            for (int j = 0; j < escenario.arrayZombies.get(i).zombie.size(); j++) {
                
           System.out.println("Zombi nº "+j+1+"¿Vivo o muerto?");
             if(escenario.arrayZombies.get(i).zombie.get(j).isVivo()){
                    System.out.println("VIVO");
                }else{
                    System.out.println("MUERTO");
                }
            
            
            
            
            
            
            }
            
        }
        
        
        
//        for(Zombie z : zombis){
//            System.out.println("Carta numero: "+contador);
//          //  System.out.println("Carta con "+z.zombie.size()+" zombies");
//            ArrayList<Zombi> numerozombis = z.zombie;
//            System.out.println("**********");
//            for(Zombi zi : numerozombis){
//                System.out.println("Zombi nº "+numerozombis.indexOf(zi)+1+"¿Vivo o muerto?");
//                if(zi.isVivo()){
//                    System.out.println("VIVO");
//                }else{
//                    System.out.println("MUERTO");
//                }
//            System.out.println("**********");
//            }
//            contador++;
//        }
//        System.out.println("----------------------------------------");*/
    }

    public void verAreaJugador() {

        System.out.println("----------Tu área de juego----------");
        //bucle para ver todas las cartas.
        ArrayList<Carta> areajugador = escenario.areaJugable.getArrayJugables();
        for (Carta x : areajugador) {
            System.out.println("**********");
            System.out.println("Nombre de la carta: " + x.getNombre());
            System.out.println("Descripción: ");
            x.descripcion();
            if (x.isActiva()) {
                System.out.println("¿Preparada? --> SI");
            } else {
                System.out.println("¿Preparada? --> NO");
                System.out.println("Coste preparar: " + x.getActivacion());
            }
            System.out.println("**********");
        }
        System.out.println("----------------------------------------");
    }

    public void verJugador() {

        System.out.println("----------Tu personaje----------");
        System.out.println("Nombre: " + escenario.personaje.getNombre());
        System.out.println("Heridas: ");
        if (escenario.personaje.isBrazo()) {
            System.out.println("*Brazo: X");
        } else {
            System.out.println("*Brazo: ");
        }
        if (escenario.personaje.isPierna()) {
            System.out.println("*Pierna: X");
        } else {
            System.out.println("*Pierna: ");
        }
        System.out.println("Oleada: " + escenario.Ronda);
        System.out.println("Supervivientes rescatados: " + escenario.PersonasSalvadas);
        System.out.println("----------------------------------------");
    }

}
