/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Escenario;
import Modelo.Mano;
import Vista.*;
import java.util.Scanner;

/**
 *
 * @author Zero
 */
public class MenuOpciones {

//me permite elegir las cartas que quiero usar y la opcion para estas
    Mano mano;
    Escenario escenario;

    public MenuOpciones(Mano mano) {
        this.mano = mano;
    }

    public void Menu() {
        System.out.println("MENU OPCIONES");
        System.out.println("1- Usar cart coste 0");
        System.out.println("2- Colocar carta");
        System.out.println("3- Usar cartas seleccionadas para activar");
        System.out.println("4- Usar cartas para explorar");
        System.out.println("5- Usar cartas para comprar");
        System.out.println("6- Salir");
        System.out.println("Elige una opción: ");
        ElegirOpcion();
    }

    //Elige una de las diversas opciones del juego
    public int ElegirOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcionElegida = sc.nextInt();
        return opcionElegida;
    }

    //muestra las cartas y permite Elegir todas las cartas que deseas y devuelves el numero de estas 
    public int[] ElegirCartas() {
        Scanner sc = new Scanner(System.in);
        escenario.vista.verMano();
        System.out.println("Selecciona el numero de cartas que quieras usar: ");
        int numeroCartas = sc.nextInt();
        if (mano.numeroCartas() < numeroCartas) {
            System.out.println("El numero de cartas en tu mano es menor que el numero de cartas que quieres seleccionar.");
            ElegirCartas();
        } else {
            String conjuntoCartas = null;
            for (int i = 0; i < numeroCartas; i++) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Introduce las cartas separadas por coma");
                conjuntoCartas = sc1.nextLine();
            }
            String[] array = conjuntoCartas.split(",");
        }

        return null;
    }

}
