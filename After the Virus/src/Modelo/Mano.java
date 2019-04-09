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
    VistaEscenario vista=new VistaEscenario();

    //Esta mano debe usar la carta segun la opcion elegida en el menú
    public Mano(Escenario escenario) {
        this.escenario = escenario;
    }
    //al usar la carta es la que pondrá la carta en descartes, este metodo ejecutará el action de la carta tambien

    public void usarCartas(int[] cartas, int opcion) {

        switch (opcion) {

            //Usa la carta, es decir la pone en el AREA JUGABLE y si su costo es 0 la usa al instante
            case 1:
                for (int i = 0; i < cartas.length; i++) {

                    Carta carta = Mano.get(cartas[i]);

                    if (carta.getActivacion() == 0) {
                        escenario.areaJugable.AniadirCarta(carta);

                    } else {
                        System.out.println("El costo de esta carta no es 0, no se puede usar, por favor coja una opcion adecuada");
                    }
                    //ir al menu
                }

                break;

            //Igual que la anterior pero solo la coloca
            case 2:
                for (int i = 0; i < cartas.length; i++) {

                    Carta carta = Mano.get(cartas[i]);
                    escenario.areaJugable.AniadirCarta(carta);
                }

                break;

            //Usa estas cartas para activar otras
            case 3:
                vista.VerAreaJuego();
                Carta[] carta = null;
                for (int i = 0; i < cartas.length; i++) {

                    carta[i] = Mano.get(cartas[i]);

                    escenario.areaJugable.ActivarCarta(carta);

                }

                break;

            //Usa estas cartas para explorar
            case 4:
                Carta carta1=null;
                for (int i = 0; i < cartas.length; i++) {

                    carta1 = Mano.get(cartas[i]);

                    escenario.compraCartas.explora(carta1);

                }

                break;

            //Usa estas cartas para comprar
            case 5:
                Carta[] carta2 = null;
                for (int i = 0; i < cartas.length; i++) {

                    carta2[i] = Mano.get(cartas[i]);
                }

                escenario.compraCartas.compra(carta2);

                break;

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

}
