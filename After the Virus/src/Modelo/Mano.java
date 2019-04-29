/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import Modelo.Cartas.Zombie;
import Modelo.Cartas.Zombie1;
import Modelo.Cartas.Zombie2;
import Modelo.Cartas.Zombie3;
import Modelo.Cartas.Zombie4;
import Vista.VistaEscenario;
import java.util.ArrayList;

/**
 *
 * @author Zero
 */
public class Mano {

    private ArrayList<Carta> Mano = new ArrayList();
    Escenario escenario;

    //Esta mano debe usar la carta segun la opcion elegida en el menú
    public Mano(Escenario escenario) {
        this.escenario = escenario;

    }
    //al usar la carta es la que pondrá la carta en descartes, este metodo ejecutará el action de la carta tambien

    public void usarCartas(int cartas, int opcion) {

        switch (opcion) {

            //Usa la carta, es decir la pone en el AREA JUGABLE y si su costo es 0 la usa al instante
            case 1:
                for (int i = 0; i < cartas; i++) {

                    Carta carta = getMano().get(cartas);

                    if (carta.getActivacion() == 0) {
                        escenario.areaJugable.AniadirCarta(carta);

                    } else {
                        System.out.println("El costo de esta carta no es 0, no se puede usar, por favor coja una opcion adecuada");
                    }
                    escenario.menuOpciones.Menu();

                }

                break;

            //Igual que la anterior pero solo la coloca
            case 2:
                for (int i = 0; i < cartas; i++) {

                    Carta carta = getMano().get(cartas);
                    escenario.areaJugable.AniadirCarta(carta);
                }

                break;

            //Usa estas cartas para activar otras
            case 3:
                escenario.vista.verAreaJugador();
                Carta[] carta = null;
                for (int i = 0; i < cartas; i++) {

                    carta[i] = getMano().get(cartas);

                }
                if (escenario.areaJugable.ActivarCarta(carta) == true) {
                    for (int i = 0; i < cartas; i++) {

                        getMano().remove(cartas);
                    }
                } else //lanzar error
                {
                    break;
                }

            //Usa estas cartas para explorar
            case 4:
                Carta carta1 = null;
                for (int i = 0; i < cartas; i++) {

                    carta1 = getMano().get(cartas);

                    escenario.compraCartas.explora(carta1);

                }

                break;

            //Usa estas cartas para comprar
            case 5:
                Carta[] carta2 = null;
                for (int i = 0; i < cartas; i++) {

                    carta2[i] = getMano().get(cartas);
                }
                if (escenario.compraCartas.compra(carta2) == true) {
                    for (int i = 0; i < cartas; i++) {

                        getMano().remove(cartas);
                    }
                } else //lanzar error y volver al menu
                {
                    break;
                }

        }

    }

    //busca una carta para sacarla, el action la usará para poderse activar, si no no hará nada y volverá al menú de eleccion
    public Carta sacarCarta(String nombreCarta) {
        for (int i = 0; i < getMano().size(); i++) {
            if (getMano().get(i).getNombre() == nombreCarta) {
                return getMano().get(i);

            }

        }

        return null;
    }

    public void EliminarCarta(int i) {
        getMano().remove(i);

    }

    public void AniadirCarta(Carta carta) {
        if (carta instanceof Zombie1 || carta instanceof Zombie2 || carta instanceof Zombie3 || carta instanceof Zombie4) {
            escenario.arrayZombies.add((Zombie) carta);
        }

        getMano().add(carta);

    }

    public void comprobarZombie() {

        //ERROR
        for (int i = 0; i < Mano.size(); i++) {
            if (Mano.get(i) instanceof Zombie) {
                escenario.arrayZombies.add((Zombie) Mano.remove(i));

            }

        }

    }

    public int numeroCartas() {
        return getMano().size();

    }

    public void aniadirCartaMano(Carta e) {
        getMano().add(e);
    }

    /**
     * @return the Mano
     */
    public ArrayList<Carta> getMano() {
        return Mano;
    }

    /**
     * @param Mano the Mano to set
     */
    public void setMano(ArrayList<Carta> Mano) {
        this.Mano = Mano;
    }
}
