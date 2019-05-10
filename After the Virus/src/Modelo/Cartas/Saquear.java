/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Solventacion de errores Juan y José
 *
 */
public class Saquear extends Carta implements Serializable {

    public Saquear(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Saquear", Escenario, 5, 0);
    }

    @Override
    public void action() {

        if (!escenario.arrayEscenario.isEmpty()) {
            escenario.vista.verAreaExploracion();
            System.out.println("Elige la carta que quieres recuperar: ");
            Scanner sc = new Scanner(System.in);
            int cartaElegir = sc.nextInt();
            try {
                escenario.mano.AniadirCarta(escenario.arrayEscenario.remove(cartaElegir - 1));
                escenario.areaJugable.DescartarCarta(this);

            } catch (Exception e) {
                System.out.println("No existen elementos");
                escenario.mano.getMano().add(this);

                try {
                    escenario.menuOpciones.Menu();
                } catch (Throwable ex) {
                    Logger.getLogger(Saquear.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            escenario.mano.AniadirCarta(this);
        }

    }

    @Override
    public String descripcion() {
        return ("Recupera 1 carta");
    }

}
