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

        control = new Controlador();
        MiHilo m = new MiHilo(control);
        m.start();

        GuardarYCargarPartida GYC = new GuardarYCargarPartida();

        System.out.println("Deseas cargar partida?");
        System.out.println("Si o No...");
        Scanner sc1 = new Scanner(System.in);
        String SN = sc1.next();
        if ("Si".equals(SN) || "s".equals(SN) || "S".equals(SN) || "SI".equals(SN)) {
            control = (Controlador) GYC.Cargar();
            System.out.println("Partida cargada correctamente");

        } else {
            System.out.println("No se ha Cargado la partida");

        }

        if ("Si".equals(SN) || "s".equals(SN) || "S".equals(SN) || "SI".equals(SN)) {
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

        }
    }

    public void Controlador() throws Throwable {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige Controlador 1 2 o 3");
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
            case 4:
                DebugMode();
                break;
            case 5:
                control.controladorBeta();
                break;
            default:
                System.out.println("error");
                Iniciar();
                break;

        }

    }

    public void DebugMode() throws Throwable {

        DebugMode DBM = new DebugMode();
        DBM.iniciar();

    }

}
