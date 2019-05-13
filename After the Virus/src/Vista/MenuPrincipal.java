/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.MiHilo;
import Controlador.Controlador;
import Controlador.GuardarYCargarPartida;
import Modelo.Personaje.Adam;
import Modelo.Personaje.Jennie;
import Modelo.Personaje.Personaje;
import Modelo.Personaje.Robert;
import Modelo.Personaje.Ruth;
import Controlador.DebugMode;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class MenuPrincipal implements Serializable {

//Me muestra reglas, me muestra las campañas y el personaje que quiero seleccionar, tu debes crear el personaje y crear el controlador antes de empezar la campaña
    Controlador control;

    public MenuPrincipal() {

    }

    public void Iniciar() throws Throwable {
        try {
            
        
        control = new Controlador();
        MiHilo m = new MiHilo(control);
        m.start();

        GuardarYCargarPartida GYC = new GuardarYCargarPartida();

        System.out.println("Deseas cargar partida?");
        System.out.println("Si o No...");
        Scanner sc1 = new Scanner(System.in);
        String SN = sc1.next();
        if ("Si".equals(SN) || "s".equals(SN) || "S".equals(SN) || "SI".equals(SN) || "si".equals(SN)) {
            control = (Controlador) GYC.Cargar();
            System.out.println("Partida cargada correctamente");

        } else {
            System.out.println("No se ha Cargado la partida");

        }

        if ("Si".equals(SN) || "s".equals(SN) || "S".equals(SN) || "SI".equals(SN) || "si".equals(SN)) {
            Controlador();

        } else {

            Personaje p = null;
            System.out.println("Seleccione personaje 1. ADAM 2.JENNIE 3.ROBERT 4.RUTH");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();

            switch (c) {
                case 1:
                    p = new Adam(control);
                    control.AniadirPersonaje(p);
                    break;
                case 2:
                    p = new Jennie(control);
                    control.AniadirPersonaje(p);
                    break;
                case 3:
                    p = new Robert(control);
                    control.AniadirPersonaje(p);
                    break;
                case 4:
                    p = new Ruth(control);
                    control.AniadirPersonaje(p);
                    break;
                default:
                    System.out.println("error");
                    Iniciar();

                    break;

            }
            Controlador();

        }} catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Controlador() throws Throwable {
        
        
        
        try {
        System.out.println("1) CAOS (corto)\n" +
"El virus zombie está aquí y la sociedad se está desmoronando, rápido.\n" +
"Necesitas crear un orden y juntar las cosas, o moriras\n" +
"Objetivo: terminar el turno con 6 cartas preparadas en juego.");
        
        System.out.println("------------------------");

        System.out.println("2) Multitud de muertos (corto)\n" +
"Al estar paralizado por el terrible brote, te has mantenido escondido durante días.\n" +
"Mientras tanto, muchos zombies se han reunido en tu vecindario. Debes ahora " +
"¡Escápate entre la multitud de Zombies y encontrar a otros sobrevivientes!\n" +
"Objetivo: terminar el turno con 4 sobrevivientes salvados.");
        
        System.out.println("------------------------");
        
        System.out.println("3) Mantente Seguro (largo)\n" +
"Al controlar la situación, te das cuenta de que necesitas organizar " +
"una resistencia de algún tipo. Primero necesitas reunir algunas personas " +
"y prepara un lugar seguro.\n" +
"Objetivo: terminar el turno con 6 sobrevivientes salvados y una instalación preparada.");
        
        System.out.println("------------------------");
        
             Scanner sc = new Scanner(System.in);
        System.out.println("Elige Modo de Juego 1 2 o 3");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                control.controlador1a();
                break;
            case 2:
                control.controlador1b();
                break;
            case 3:
                control.controlador1c();
                break;
            case 1985:
                DebugMode();
                break;
            default:
                System.out.println("error");
                Iniciar();
                break;
        }} catch (Exception e) {
        }
        
        
       

        

    }

    public void DebugMode() throws Throwable {

        DebugMode DBM = new DebugMode();
        DBM.iniciar();

    }

}
