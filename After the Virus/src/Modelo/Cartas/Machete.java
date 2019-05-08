/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Machete extends Carta implements Serializable {

    ArrayList<Integer> ronda;

    public Machete(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "Machete", Escenario, 2, 0);
        ronda = new ArrayList();
    }

    @Override
    public void action() {
        escenario.areaJugable.AniadirCarta(this);
        escenario.mano.getMano().remove(this);
        /*Scanner sc = new Scanner(System.in);
        if (ronda.contains(escenario.Ronda)) {
            System.out.println("Ya has usado el machete esta ronda");
        } else {
            try {
                System.out.println("Selecciona un a carta de tu mano a descartar:");
             //   System.out.println(vista.arrayMano);
                int eligecarta = sc.nextInt();
                escenario.mazoDescartes.IntroducirCarta(escenario.arrayMano.get(eligecarta));
                escenario.arrayMano.remove(eligecarta);
                System.out.println("Ahora selecciona un zombie a descartar:");
                escenario.vista.verAreaZombies();
                int elige = sc.nextInt();
                escenario.mazoZombies.getDescarteZombies().add(escenario.arrayZombies.get(elige));
                escenario.arrayZombies.remove(elige);
                ronda.add(escenario.Ronda);
            } catch (Exception e) {
                System.out.println("Seleccion no valida");
            }
        }
         */
    }

    @Override
    public String descripcion() {
        return ("Una vez por turo: Se descarta 1 carta de la mano para matar 1 zombi");
    }

}
