/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import Modelo.Cartas.Zombie;
import java.util.ArrayList;

/**
 *
 * @author Zero
 */
public class Mano {

    ArrayList<Carta> Mano = new ArrayList();
    Escenario escenario;

    //Esta mano debe usar la carta segun la opcion elegida en el menú
    public Mano(Escenario escenario) {
        this.escenario = escenario;
    }
    //al usar la carta es la que pondrá la carta en descartes, este metodo ejecutará el action de la carta tambien

    public void usarCartas(int[] cartas, int opcion) {

    }

    //busca una carta para sacarla, el action la usará para poderse activar, si no no hará nada y volverá al menú de eleccion
    public Carta sacarCarta(String nombreCarta) {
        for (int i = 0; i < Mano.size(); i++) {
            if (Mano.get(i).getNombre() == nombreCarta) {
                return Mano.get(i);

            }

        }

        return null;
    }

    public void EliminarCarta(int i) {
        Mano.remove(i);

    }

    public void AniadirCarta(Carta carta) {
        if (carta instanceof Zombie) {
            escenario.arrayZombies.add((Zombie) carta);
        }

        Mano.add(carta);

    }

}
