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
 * @author Juan
 * Solventacion de errores  Juan y José
 */
public class Refugio extends Carta implements Serializable {

    public Refugio(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Refugio", Escenario, 5, 0);
    }

    @Override
    public void action() {
        for (int i = 0; i < escenario.areaJugable.getArrayJugables().size(); i++) {
            Carta carta = escenario.areaJugable.BuscarCartaTipo(12);
            if (carta instanceof Superviviente && carta.isActiva() == true) {
                escenario.PersonasSalvadas++;
                escenario.areaJugable.DescartarCarta(carta);
            } else if (carta instanceof VIP && carta.isActiva() == true) {
                escenario.PersonasSalvadas = escenario.PersonasSalvadas + 3;
                escenario.areaJugable.DescartarCarta(carta);
            }
        }
        System.out.println("HAS RESCATADO A SUPERVIVIENTES, ENHORABUENA");
        escenario.areaJugable.DescartarCarta(this);

    }

    @Override
    public String descripcion() {
        return ("Rescata 1 o más de tus supervivientes preparados");
    }

}
