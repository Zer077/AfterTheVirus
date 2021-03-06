package Modelo.Cartas;

import Controlador.EfectoDeSonido;
import Modelo.Escenario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Rifle extends CartaArma implements Serializable {

    public Rifle(int precio, String nombre, Escenario Escenario, int tipo, int activacion, int municion) {
        super(2, "Rifle", Escenario, 3, 1, 0);
    }

    @Override
    public void action() {
        if (this.municion == 0) {
            System.out.println("¡Debes añadir munición para poder usarla!");
        } else {
            System.out.println("Elige una opción:\n1. Matar un zombi de la mesa.\n2. Matar un zombi de la pila de descartes.");
            Scanner numero = new Scanner(System.in);
            int x = numero.nextInt();
            switch (x) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    escenario.vista.verAreaZombies();
                    System.out.println("Elige al zombi que quieres matar:");
                    int a = sc.nextInt();
                    if (!escenario.arrayZombies.isEmpty()) {
                        escenario.arrayZombies.get(a - 1).muereZombie();
                        EfectoDeSonido efect = new EfectoDeSonido("bang.mp3");
                        efect.start();
                    } else {
                        System.out.println("no quedan mas zombis");
                    }
                    break;
                case 2:
                    ArrayList<Carta> descartes = escenario.arrayDescartadas;
                    int contador = 0;
                    for (Carta c : descartes) {
                        if ((c instanceof Zombie) && (contador == 0)) {
                            escenario.arrayDescartadas.remove(c);
                            escenario.mazoZombies.getDescarteZombies().add((Zombie) c);
                            contador++;
                            EfectoDeSonido efect = new EfectoDeSonido("bang.mp3");
                            efect.start();
                        } else {
                            System.out.println("¡No hay zombies para matar!");
                        }
                    }
                    break;
            }
        }
    }

    @Override
    public String descripcion() {
        return ("Puedes añadir cartas de tu mano como munición.\nUna vez por turno:\nDescarta munición para matar 1 zombi en juego o en la pila de descartes.");
    }

}
