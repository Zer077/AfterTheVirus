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
 * @author Cristian
 */
public class Perro extends Carta implements Serializable {

//Precio --> recuperar 
//Activacion --> preparar
    public Perro(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Perro", Escenario, 11, 0);
    }

    @Override
    public void action() {

        if (escenario.arrayZombies.isEmpty()) {
            System.out.println("No hay ningun zombie. No puedes usar la carta.");
            escenario.mano.getMano().add(this);
            try {
                escenario.menuOpciones.Menu();
            } catch (Throwable ex) {
                Logger.getLogger(Perro.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            Scanner sc = new Scanner(System.in);
            escenario.vista.verAreaZombies();
            System.out.println("Selecciona el zombie: ");
            int a = sc.nextInt();
            escenario.arrayZombies.get(a - 1).muereZombie();
            escenario.areaJugable.DescartarCarta(this);

        }
    }

    @Override
    public String descripcion() {
        return ("Se descarta para matar 1 zombi.");
    }

}
