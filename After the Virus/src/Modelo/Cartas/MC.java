/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Cristan
 */
public class MC extends Carta implements Serializable {

    public MC(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Motocicleta", Escenario, 14, 1);
    }

    @Override
    public void action() {
        // Añade a descartadas el zombie elegido.
        Scanner sc = new Scanner(System.in);
        escenario.vista.verAreaZombies();
        System.out.println("Selecciona el zombie: ");
        int a = sc.nextInt();
        escenario.arrayZombies.get(a).descartaZombie();

        escenario.areaJugable.DescartarCarta(this);
    }

    @Override
    public String descripcion() {
        return ("Al prepararse se descarta 1 carta de zombi. Se descarta para descartar 1 carta de zombi.");
    }

    @Override
    public void setActiva(boolean activa) {
        Scanner sc = new Scanner(System.in);
        escenario.vista.verAreaZombies();
        System.out.println("Selecciona el zombie: ");
        int a = sc.nextInt();
        escenario.arrayZombies.get(a).descartaZombie();
    }

}
