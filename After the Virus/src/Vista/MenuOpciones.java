/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cartas.Carta;
import Modelo.Escenario;
import Modelo.Mano;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class MenuOpciones {

//me permite elegir las cartas que quiero usar y la opcion para estas
    Mano mano;
    Escenario escenario;

    public MenuOpciones(Mano mano, Escenario Escenario) {
        this.mano = mano;
        this.escenario = Escenario;
    }

    public void Menu() {
        System.out.println("MENU OPCIONES");
        System.out.println("1- Usar Carta de la mano");
        System.out.println("2- Ver Escenario");
        System.out.println("3- Usar Cartas del area");
        System.out.println("4- Salir");

        System.out.println("Elige una opción: ");

        Scanner sc = new Scanner(System.in);
        int opcionElegida = sc.nextInt();
        switch (opcionElegida) {
            case 1:
                mano.usarCartas(ElegirCartas(), ElegirOpcion());
                break;
            case 2:
                escenario.vista.verAreaExploracion();
                escenario.vista.verJugador();
                escenario.vista.verAreaJugador();
                escenario.vista.verAreaExploracion();
                escenario.vista.verAreaZombies();
                escenario.vista.verMano();
                break;
            case 3:
                escenario.vista.verAreaJugador();
                System.out.println("Que carta quieres usar.");
                break;
            case 4:
                System.out.println("Salimos de la mano");
                break;
            default:
                System.out.println("error");
                Menu();
                break;

        }
        if (opcionElegida == 4) {
            escenario.salir = true;
        }
    }

    //Elige una de las diversas opciones del juego
    public int ElegirOpcion() {
        System.out.println("Elige una opcion: ");
        System.out.println("1)Usar la carta");
        System.out.println("2)Colocar la carta");
        System.out.println("3)Usarlas para activar otras cartas del area");
        System.out.println("4)Usarlas para explorar");
        System.out.println("5)Usarlas para recuperar cartas del area explorada");
        //    System.out.println("6)Usar cartas del area");
        //   System.out.println("7)Ver Escenario");
        // System.out.println("8)Salir");

        Scanner sc = new Scanner(System.in);
        int opcionElegida = sc.nextInt();

        return opcionElegida;
    }

    //muestra las cartas y permite Elegir todas las cartas que deseas y devuelves el numero de estas 
    public ArrayList<Carta> ElegirCartas() {
        ArrayList<Carta> conjuntoCartas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        escenario.vista.verMano();
        try {
            System.out.println("Introduce las cartas a usar separadas por espacios");
            String carta = sc.next();
            String[] cards = carta.split(" ");
            for (int j = cards.length - 1; j >= 0; j--) {
                conjuntoCartas.add(mano.getMano().remove(Integer.parseInt(cards[j]) - 1));

            }
        } catch (Exception e) {
            System.out.println("No has introducido bien la carta que deseabas seleccionar, intentelo de nuevo por favor");
            Menu();

        }

        return conjuntoCartas;
    }

}
