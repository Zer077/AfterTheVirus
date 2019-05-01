/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;

/**
 *
 * @author Abraham
 */
public class BombaDeDemolición extends Carta {

    public BombaDeDemolición(int precio, String nombre, Escenario Escenario, int activacion, int tipo) {
        super(2, "Bomba de demolición", Escenario, 10, 0);
    }

    @Override
    public void action() {

        for (int x = 0; x < escenario.arrayZombies.size(); x++) {

            Carta zom = escenario.arrayZombies.get(x);

            if (zom instanceof Zombie) {

                escenario.mazoZombies.getDescarteZombies().add(zom);
                escenario.arrayZombies.remove(x);

            }

        }

        for (int y = 0; y < escenario.mazoDescartes.getMazoDescarte().size(); y++) {

            Carta zomb = escenario.mazoDescartes.getMazoDescarte().get(y);

            if (zomb instanceof Zombie) {

                escenario.mazoZombies.getDescarteZombies().add(zomb);
                escenario.mazoDescartes.getMazoDescarte().remove(y);

            }

        }

        escenario.areaJugable.EliminarCarta(this);

    }

    @Override
    public void descripcion() {
        System.out.println("Bomba de demolición: Destruye esta carta para matar todos los zombis en el área de juego y en la pila\n"
                + "\n" + "de descarte de algún jugador.");
    }

}
