/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Controlador.EfectoDeSonido;
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
        if (!escenario.arrayZombies.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            escenario.vista.verAreaZombies();
            System.out.println("Selecciona el zombie: ");
            int a = sc.nextInt();

            EfectoDeSonido efect = new EfectoDeSonido("perro.mp3");
            efect.start();
            System.out.println("El Zombie ha huido del miedo");
            escenario.arrayZombies.get(a - 1).muereZombie();
            escenario.areaJugable.DescartarCarta(this);
        } else {
            System.out.println("No hay zombies");
            escenario.mano.AniadirCarta(this);
        }

        try {
            escenario.menuOpciones.Menu();
        } catch (Throwable ex) {
            Logger.getLogger(Perro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String descripcion() {
        return ("Se descarta para matar 1 zombi.");
    }

}
