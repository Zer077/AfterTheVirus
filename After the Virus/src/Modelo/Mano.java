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
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jose
 * Solventacion de errores Miguel, Juan y José
 */
public class Mano implements Serializable {

    private ArrayList<Carta> Mano = new ArrayList();
    Escenario escenario;

    //Esta mano debe usar la carta segun la opcion elegida en el menú
    public Mano(Escenario escenario) {
        this.escenario = escenario;

    }
    //al usar la carta es la que pondrá la carta en descartes, este metodo ejecutará el action de la carta tambien

    public void usarCartas(ArrayList<Carta> cartas, int opcion) throws Throwable {

        switch (opcion) {

            //Usa la carta, es decir la pone en el AREA JUGABLE y si su costo es 0 la usa al instante
            case 1:

                for (int i = cartas.size() - 1; i >= 0; i--) {
                    System.out.println("-----------------------------------------------");

                    escenario.areaJugable.AniadirCarta(cartas.remove(0));
                }

                break;

            //Igual que la anterior pero solo la coloca
            case 2:
                for (int i = cartas.size() - 1; i >= 0; i--) {
                    System.out.println("-----------------------------------------------");

                    escenario.areaJugable.AniadirCarta(cartas.remove(0));
                }

                break;

            //Usa estas cartas para activar otras
            case 3:
                int conteo = 0;

                //Mira si hay cartas para activar
                for (int i = 0; i < escenario.areaJugable.getArrayJugables().size(); i++) {
                    if (escenario.areaJugable.getArrayJugables().get(i).isActiva() == false) {
                        conteo++;
                    }

                }
                //si hay cartas  y cartas para activar funciona
                if (escenario.areaJugable.getArrayJugables().size() > 0 && conteo > 0) {
                    //si activar cartas devulve true, las cartas de llevan al mazo de descartes
                    if (escenario.areaJugable.ActivarCarta(cartas) == true) {
                        int tamanio = cartas.size();
                        for (int i = 0; i < tamanio; i++) {

                            escenario.mazoDescartes.IntroducirCarta(cartas.remove(0));
                        }

                        //Si no da un error y te las devuelve
                    } else {
                        System.out.println("error no eran las cartas adecuadas para activar");
                        int tamanio = cartas.size();
                        for (int i = 0; i < tamanio; i++) {
                            AniadirCarta(cartas.remove(0));

                        }
                        escenario.menuOpciones.Menu();

                    }
//Si no  hay cartas para activar te las devuelve
                } else {
                    System.out.println("No hay cartas para activar");
                    for (int i = 0; i <= cartas.size() - 1; i++) {
                        AniadirCarta(cartas.get(0));
                        escenario.menuOpciones.Menu();
                    }

                }

                break;
            //Usa estas cartas para explorar
            case 4:
                Carta carta1 = null;
                for (int i = 0; i < cartas.size(); i++) {

                    carta1 = cartas.get(i);

                    escenario.compraCartas.explora(carta1);

                }

                break;

            //Usa estas cartas para comprar
            case 5:
                ArrayList<Carta> carta2 = new ArrayList<>();
                for (int i = 0; i < cartas.size(); i++) {

                    carta2.add(cartas.get(i));
                }
                if (escenario.compraCartas.recuperar(carta2) == true) {
                    for (int i = 0; i < cartas.size(); i++) {

                        getMano().remove(cartas.get(i));

                    }
                }

                break;

            case 6:
                escenario.vista.verAreaJugador();
                System.out.println("Que carta quieres usar.");
                break;

            case 7:
                escenario.vista.verAreaExploracion();
                escenario.vista.verJugador();
                escenario.vista.verAreaJugador();
                escenario.vista.verAreaExploracion();
                escenario.vista.verAreaZombies();
                escenario.vista.verMano();
                break;

            case 8:
                System.out.println("Salimos de la mano");
                break;

            default:
                System.out.println("Errorcito en menu de mano");
                break;

        }

    }

    //busca una carta para sacarla, el action la usará para poderse activar, si no no hará nada y volverá al menú de eleccion
    public Carta sacarCarta(String nombreCarta) {
        for (int i = 0; i < getMano().size(); i++) {
            if (getMano().get(i).getNombre().equals(nombreCarta)) {
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

        for (int i = 0; i < Mano.size(); i++) {
            if (Mano.get(i) instanceof Zombie) {
                escenario.arrayZombies.add((Zombie) Mano.remove(i));

            }

        }

//        for(Carta carta: Mano){
//            if (carta instanceof Zombie ) {
//                escenario.arrayZombies.add((Zombie) carta);
//                getMano().remove(carta);
//            }  
//        }
    }

    public int numeroCartas() {
        return getMano().size();

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
