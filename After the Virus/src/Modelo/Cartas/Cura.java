/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;

/**
 *
 * @author Cristian
 */
public class Cura extends Carta implements Serializable{

    public Cura(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Cura", Escenario, 7, 1);
    }

    @Override
    public void action() {
        Superviviente superviviente = new Superviviente(1, "Superviviente", escenario, 12, 1);
        Zombie z = escenario.arrayZombies.remove(0);
        escenario.arrayEscenario.add(superviviente);

        if (superviviente.isActiva()) {
            escenario.PersonasSalvadas++;
            escenario.arrayEscenario.remove(superviviente);
            escenario.arrayZombies.add(z);
        }

        escenario.areaJugable.EliminarCarta(this);
    }

    @Override
    public void descripcion() {
        System.out.println("Se destruye para convertir una carta de 1 zombi en un sobreviviente preparado, cuando sea salvado, se regresa a la pila de zombis. ");

    }

}
