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
 * @author Zero
 */
public class Correr extends Carta implements Serializable{

    public Correr(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Corre", Escenario, 5, 0);
    }

    @Override
    public void action() {
        if (escenario.personaje.isPierna() == false) {
            if (escenario.arrayZombies.size() == 0) {
                escenario.mano.getMano().add(this);
                escenario.menuOpciones.Menu();
            } else {
                escenario.vista.verAreaZombies();
                System.out.println("Elige al zombie que quieres descartar: ");
                Scanner sc = new Scanner(System.in);
                int opcionZombie = sc.nextInt();
                escenario.arrayZombies.remove(opcionZombie - 1).descartaZombie();
                escenario.areaJugable.DescartarCarta(this);
            }
        } else {
            System.out.println("Tu pierna está rota, no puedes correr");
            escenario.mano.getMano().add(this);
            escenario.menuOpciones.Menu();
        }
    }

    @Override
    public String descripcion() {
        return("Descarta 1 carta de Zombie");
    }

}
