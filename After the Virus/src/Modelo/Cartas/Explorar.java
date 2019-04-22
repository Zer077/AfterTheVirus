/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.util.Scanner;

/**
 *
 * @author Zero
 */
public class Explorar extends Carta {

    public Explorar(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Explorar", Escenario, 12, 0);
    }

    @Override
    public void action() {
        //Accion de scoutear 2 cartas
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Elige 2 cartas para explorarlas: ");
        escenario.vista.verAreaExploracion();
        System.out.println("Primera carta: ");
        int a = sc1.nextInt();
        System.out.println("Segunda carta: ");
        int b = sc2.nextInt();
        
        // Donde añado esas cartas y de donde las cojo?
        
        escenario.areaJugable.EliminarCarta(this);
    }

    @Override
    public void descripcion() {
        System.out.println("Se descarta para scoutear 2 cartas.");
    }

}