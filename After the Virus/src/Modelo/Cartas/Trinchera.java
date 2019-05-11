/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abraham
 */
public class Trinchera extends Carta implements Serializable {

    public Trinchera(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Trinchera", Escenario, 10, 0);
    }

    @Override
    public void action() {

        if (!escenario.arrayZombies.isEmpty()) {
            Scanner sq = new Scanner(System.in);

            for (int cont = 0; cont < 2; cont++) {
                escenario.vista.verAreaZombies();
                System.out.println("¿Qué zombies quieres matar?");
                int x = sq.nextInt();
                escenario.arrayZombies.get(x - 1).muereZombie();
            }

            escenario.areaJugable.EliminarCarta(this);

        } else {
            escenario.mano.AniadirCarta(this);
        }
        System.out.println("No hay zombies");
        try {
            escenario.menuOpciones.Menu();
        } catch (Throwable ex) {
            Logger.getLogger(Perro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String descripcion() {
        return ("Trinchera : Descarta esta carta para matar 2 zombies.");
    }

}
