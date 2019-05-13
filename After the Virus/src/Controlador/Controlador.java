/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Modelo.Personaje.Personaje;
import Vista.MenuOpciones;
import Vista.MenuPrincipal;
import Vista.Ventana;
import Vista.VistaEscenario;
import after.the.virus.AfterTheVirus;
import java.io.Serializable;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;

/**
 *
 * @author Juan y Cristian
 *
 * Solventacion de errores Miguel, Juan y José
 */
public class Controlador extends Escenario implements Serializable {

    int contador;

    //Debe encargarse de que funcione la aplicacion con las diversas mecánicas
    //NOTA IMPORTANTE, AL PRINCIPIO DEL JUEGO DEBEMOS DARLE ALEATORIAMENTE ENTRE 1 Y 3 CARTAS ZOMBIE AL MAZO JUGADOR
    //CREAR 3 CONTROLADORES  PARA LOS 3 MODOS DE JUEGO
    public Controlador() {

        compraCartas = new Exploracion(this);
        mazoEscenario = new MazoEscenario(this);
        mazoDescartes = new MazoDescartes(this);
        mazoEliminadas = new MazoEliminadas(this);
        mazoJugador = new MazoJugador(this);
        mazoZombies = new MazoZombies(this);
        mano = new Mano(this);
        menuPrincipal = new MenuPrincipal();
        menuOpciones = new MenuOpciones(mano, this.escenario);
        vista = new VistaEscenario(this);
        areaJugable = new AreaJugable(this);
        Ronda = 1;
        PersonasSalvadas = 0;
        //v = new Ventana(vista);
        GYC = new GuardarYCargarPartida();
    }

    public void controlador1a() throws Throwable {
        //v.setVisible(true);
        //preparacion: comienza con 1 oleada (añadir 1-3 cartas zombi random)

        int coge = (int) (Math.random() * 3 + 1);
        mazoZombies.introducirAleatorio(coge);

        do {

            Principal();

            for (int i = 0; i < areaJugable.getArrayJugables().size(); i++) {
                if (areaJugable.getArrayJugables().get(i).isActiva() == true) {
                    contador++;
                }
            }

            if (personaje.isCabeza() == true) {
                Morir();

            } else if (personaje.isCabeza() == false && contador >= 6) {
                System.out.println("HAS GANADO");
                personaje.setCabeza(true);
                Enter();
                System.out.println("¿Deseas empezar una partida nueva?");
                Scanner sc = new Scanner(System.in);
                String reinicia = sc.next();
                if (reinicia.equals("si") || reinicia.equals("Si") || reinicia.equals("SI") || reinicia.equals("sI") || reinicia.equals("sí") || reinicia.equals("Sí") || reinicia.equals("SÍ") || reinicia.equals("sÍ")) {
                    menuPrincipal.Iniciar();
                } else {
                    Enter();
                    exit();
                }

            }

            contador = 0;
            Final();

        } while (personaje.isCabeza() == false);
    }

    public void controlador1b() throws Throwable {
        //objetivo: acaba el turno con 4 supervivientes rescatados
        //Preparacion:Comienza con 1 oleada. comienza con 5 cartas de zombi a cada mazo

        int coge = 5;
        mazoZombies.introducirAleatorio(coge);

        do {
            Principal();

            if (personaje.isCabeza() == true) {
                System.out.println("HAS MUERTO");

                Morir();
            } else if (personaje.isCabeza() == false && PersonasSalvadas == 4) {
                System.out.println("HAS GANADO");
                System.out.println("¿Deseas empezar una partida nueva?");
                Scanner sc = new Scanner(System.in);
                String reinicia = sc.next();
                if (reinicia.equals("si") || reinicia.equals("Si") || reinicia.equals("SI") || reinicia.equals("sI") || reinicia.equals("sí") || reinicia.equals("Sí") || reinicia.equals("SÍ") || reinicia.equals("sÍ")) {
                    menuPrincipal.Iniciar();
                } else {
                    Enter();
                    exit();
                }
            }

            Ronda++;
            Final();
        } while (personaje.isCabeza() == false);
    }

    public void controlador1c() throws Throwable {
        //objetivo: acaba el turno con 6 supervivientes rescatados y una instalacion preparada
        //preparacion: comienza con 1 oleada.

        boolean x = false;
        do {

            Principal();

            for (int i = 0; i < areaJugable.getArrayJugables().size(); i++) {
                if (areaJugable.getArrayJugables().get(i).getTipo() == 8
                        && areaJugable.getArrayJugables().get(i).isActiva()) {
                    x = true;
                }
            }

            if (personaje.isCabeza() == true) {
                System.out.println("HAS MUERTO");

                Morir();
            } else if (personaje.isCabeza() && x == true) {
                System.out.println("HAS GANADO");
                System.out.println("¿Deseas empezar una partida nueva?");
                Scanner sc = new Scanner(System.in);
                String reinicia = sc.next();
                if (reinicia.equals("si") || reinicia.equals("Si") || reinicia.equals("SI") || reinicia.equals("sI") || reinicia.equals("sí") || reinicia.equals("Sí") || reinicia.equals("SÍ") || reinicia.equals("sÍ")) {
                    menuPrincipal.Iniciar();
                } else {
                    Enter();
                    exit();
                }
            }

            Ronda++;
            Final();
        } while (personaje.isCabeza() == false);
    }

//Otros métodos
    public void AniadirPersonaje(Personaje p) {

        personaje = p;
    }

    public void Enter() {
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public void Machete() {

        for (int i = 0; i < areaJugable.getArrayJugables().size(); i++) {

            if ("Machete".equals(areaJugable.getArrayJugables().get(i).getNombre())
                    && areaJugable.getArrayJugables().get(i).isActiva()
                    && arrayZombies.size() > 0) {
                Scanner sc1 = new Scanner(System.in);
                Scanner sc2 = new Scanner(System.in);
                vista.verAreaJugador();
                System.out.println("Selecciona una carta para descartar:");
                int a = sc1.nextInt();
                areaJugable.DescartarCarta(areaJugable.getArrayJugables().get(a));
                vista.verAreaZombies();
                System.out.println("Selecciona el zombie que vas a matar:");
                int b = sc2.nextInt();
                arrayZombies.get(b).muereZombie();
            } else if ("Machete".equals(areaJugable.getArrayJugables().get(i).getNombre())
                    && areaJugable.getArrayJugables().get(i).isActiva()
                    && arrayZombies.isEmpty()) {
                System.out.println("No hay zombies.");
            }

        }

    }

    public void Menu() throws Throwable {
        do {
            salir = false;
            menuOpciones.Menu();  
        } while (salir == false || mano.numeroCartas() > 0);

    }

    public void Principal() throws Throwable {
        //3-Se baraja las cartas del jugador
        mazoJugador.barajar();
        //4- La mano del jugador coje 5 cartas
        mazoJugador.sacarCincoCartas();
        mazoEscenario.barajar();
        // Comprueba si Machete esta activo. Si lo está, descarta una carta y mata 1 zombie.
        Machete();
        //y elimina las de Zombie de la mano y las pone en juego
        mano.comprobarZombie();
        //mostrar escenario y todos los datos
        vista.verJugador();
        Enter();
        vista.verAreaZombies();
        Enter();
        vista.verAreaExploracion();
        Enter();
        vista.verAreaJugador();
        Enter();
        //muestra menu opciones acciones carta

        Menu();

        salir = false;
        System.out.println("-------------termina usar tus cartas--------------");
        //zombies restantes atacan

        int tamanioZombies = arrayZombies.size();
        for (int i = 0; i < tamanioZombies; i++) {
            arrayZombies.get(0).atacaHumano();
        }
        System.out.println("-------------termina ataque de los zombies----------------------");
        //Al acabar las ronda comienzan los zombies, ronda 1 es 1 carta Zombie, ronda 2, 2 cartas Zombie…
        //5-Se sacan cartas Zombie y meten en el mazo de jugador
        mazoZombies.Restaurar();
        mazoZombies.introducirPorRonda();

    }

    public void Final() {
        Ronda++;
        System.out.println("------------final de la ronda " + Ronda + "-------------");

        System.out.println("Quieres guardar partida hasta el punto actual?");
        Scanner sc = new Scanner(System.in);
        String SN = sc.next();
        if ("Si".equals(SN) || "s".equals(SN) || "S".equals(SN) || "SI".equals(SN) || "si".equals(SN)) {
            GYC.Guardar(this);
            System.out.println("Partida Guardada con éxito");
            Enter();
        } else {
            System.out.println("No se ha Guardado partida");
            Enter();
        }

    }

    public void Morir() throws Throwable {
        System.out.println("HAS MUERTO");
        m.matar(m);
        EfectoDeSonido efects = new EfectoDeSonido("Mario.mp3");
        System.currentTimeMillis();
        efects.start();

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                try {
                    SeleccionMusica s = new SeleccionMusica("rick.mp3", escenario);
                    s.start();
                    Enter();
                    System.out.println("¿Deseas empezar una partida nueva?");
                    Scanner sc = new Scanner(System.in);
                    String reinicia = sc.next();
                    if (reinicia.equals("si") || reinicia.equals("Si") || reinicia.equals("SI") || reinicia.equals("sI") || reinicia.equals("sí") || reinicia.equals("Sí") || reinicia.equals("SÍ") || reinicia.equals("sÍ")) {
                        menuPrincipal.Iniciar();
                    } else {
                        Enter();
                        exit();
                    }
                } catch (Throwable ex) {
                    Logger.getLogger(AfterTheVirus.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }, 3000);
    }
}
