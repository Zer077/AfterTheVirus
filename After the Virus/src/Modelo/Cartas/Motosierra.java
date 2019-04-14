/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;

/**
 *
 * @author Zero
 */
public class Motosierra extends Carta {

    public Motosierra(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Motosierra", Escenario, 2, 2);
    }

    @Override
    public void action() {
        System.out.println("Usas la motosierra");
        for (int i = 0; i < 5; i++) {
            escenario.arrayZombies.get(0).muereZombie();
            escenario.arrayZombies.remove(0);
        }
        escenario.areaJugable.EliminarCarta(this);
    }

    @Override
    public void descripcion() {
        System.out.println("Se descarta para matar 6 zombis");
    }

}
