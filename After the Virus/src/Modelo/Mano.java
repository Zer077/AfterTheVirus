/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import Modelo.Cartas.Zombie;
import Vista.VistaEscenario;
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

    public void usarCartas(int cartas, int opcion) {

        switch (opcion) {

            //Usa la carta, es decir la pone en el AREA JUGABLE y si su costo es 0 la usa al instante
            case 1:
                for (int i = 0; i < cartas; i++) {

                    Carta carta = Mano.get(cartas);

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

                    Carta carta = Mano.get(cartas);
                    escenario.areaJugable.AniadirCarta(carta);
                }

                break;

            //Usa estas cartas para activar otras
            case 3:
                escenario.vista.verAreaJugador();
                Carta[] carta = null;
                for (int i = 0; i < cartas; i++) {

                    carta[i] = Mano.get(cartas);

                }
                if (escenario.areaJugable.ActivarCarta(carta) == true) {
                    for (int i = 0; i < cartas; i++) {

                        Mano.remove(cartas);
                    }
                } else //lanzar error
                {
                    break;
                }

            //Usa estas cartas para explorar
            case 4:
                Carta carta1 = null;
                for (int i = 0; i < cartas; i++) {

                    carta1 = Mano.get(cartas);

                    escenario.compraCartas.explora(carta1);

                }

                break;

            //Usa estas cartas para comprar
            case 5:
                Carta[] carta2 = null;
                for (int i = 0; i < cartas; i++) {

                    carta2[i] = Mano.get(cartas);
                }
                if (escenario.compraCartas.compra(carta2) == true) {
                    for (int i = 0; i < cartas; i++) {

                        Mano.remove(cartas);
                    }
                } else //lanzar error y volver al menu
                {
                    break;
                }

        }

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
    
    public void comprobarZombie(){
        for(Carta carta: Mano){
            if (carta instanceof Zombie) {
                escenario.arrayZombies.add((Zombie) carta);
                Mano.remove(carta);
            }  
        }
    }
    
    public int numeroCartas(){
        return Mano.size();
    }
}