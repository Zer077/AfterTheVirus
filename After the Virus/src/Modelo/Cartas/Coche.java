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

/**
 *
 * @author cristian
 */
public class Coche extends Carta implements Serializable {

    public Coche(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Coche", Escenario, 14, 2);
    }

    @Override
    public void action() {
        Scanner sc = new Scanner(System.in);
        escenario.vista.verAreaZombies();
        System.out.println("Selecciona el zombie: ");
        int a = sc.nextInt();
        escenario.arrayZombies.get(a).muereZombie();

        //Falta descartar el resto
        for (int i = 0; i < escenario.arrayZombies.size(); i++) {
            escenario.arrayZombies.get(i).descartaZombie();
        }
        EfectoDeSonido efect = new EfectoDeSonido("coche.mp3");
        efect.start();

        escenario.areaJugable.DescartarCarta(this);
    }

    @Override
    public String descripcion() {
        return ("Se descarta para matar 1 carta de zombi y descartar el resto.");
    }

}
