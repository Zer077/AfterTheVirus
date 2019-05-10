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
 * @author Miguel
 */
public class Palanca extends Carta implements Serializable {

    public Palanca(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Palanca", Escenario, 2, 0);

    }

    @Override
    public void action() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Deseas descartar esta carta para descartar 1 zombie? 1)si 2)no");
        int sino = sc.nextInt();
        switch (sino) {
            case 1:
                System.out.println("Selecciona un zombie a descartar:");
                escenario.vista.verAreaZombies();
                int elige = sc.nextInt();
                escenario.mazoZombies.getDescarteZombies().add(escenario.arrayZombies.get(elige));
                escenario.arrayZombies.remove(elige);
                escenario.areaJugable.DescartarCarta(this);
                break;
            case 2:
                System.out.println("Has decidido no descartar esta carta");
                escenario.mano.AniadirCarta(this);
                break;

        }
    }

    @Override
    public String descripcion() {
        return ("Al prepararse se descarta 1 zombi, se descarta para descartar 1 zombi.");

    }

    @Override
    public void setActiva(boolean activa) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona un zombie a descartar:");
        escenario.vista.verAreaZombies();
        int elige = sc.nextInt();
        escenario.mazoZombies.getDescarteZombies().add(escenario.arrayZombies.get(elige));
        escenario.arrayZombies.remove(elige);

    }
}
