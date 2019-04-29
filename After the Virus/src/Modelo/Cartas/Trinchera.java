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
public class Trinchera extends Carta {

    public Trinchera(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Trinchera", Escenario, 10, 0);
    }

    @Override
    public void action() {
        Scanner sq = new Scanner(System.in);

        for (int cont = 0; cont < 2; cont++) {
            escenario.vista.verAreaZombies();
            System.out.println("¿Qué zombies quieres matar?");
            int x = sq.nextInt();
            escenario.arrayZombies.get(x).muereZombie();
        }

        escenario.areaJugable.EliminarCarta(this);
    }

    @Override
    public void descripcion() {
        System.out.println("Trinchera : Descarta esta carta para matar 2 zombies.");
    }

}
