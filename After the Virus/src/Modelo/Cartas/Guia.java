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
public class Guia extends Carta {

    public Guia(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Guía", Escenario, 12, 0);
    }

    @Override
    public void action() {
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        escenario.vista.verAreaZombies();
        System.out.println("Selecciona uno para remover de la pila de descartes: ");
        int a = sc.nextInt();
        System.out.println("Selecciona otro para remover de la pila de descartes: ");
        int b = sc2.nextInt();
        escenario.arrayZombies.remove(a);
        escenario.arrayZombies.remove(b);
        escenario.areaJugable.EliminarCarta(this);
    }

    @Override
    public void descripcion() {
        System.out.println("Se descarta para remover 2 zombis de una pila de descarte.");
    }

}
