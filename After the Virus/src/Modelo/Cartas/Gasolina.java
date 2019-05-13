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
 * @author Maria Perez Solucion de errores Jose
 */
public class Gasolina extends Carta implements Serializable {

    public Gasolina(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Gasolina", Escenario, 4, 1);
    }

    @Override
    public void action() {

        for (int i = 0; i < escenario.areaJugable.getArrayJugables().size(); i++) {
            if (escenario.areaJugable.BuscarCartaTipo(10) != null) {
                escenario.areaJugable.BuscarCartaTipo(10).setActiva(true);
            }
            if (escenario.areaJugable.BuscarCartaTipo(14) != null) {
                escenario.areaJugable.BuscarCartaTipo(14).setActiva(true);
            }
            if (escenario.areaJugable.BuscarCartaTipo(1) != null) {
                escenario.areaJugable.BuscarCartaTipo(1).setActiva(true);
            }
            if (escenario.areaJugable.BuscarCartaTipo(2) != null) {
                escenario.areaJugable.BuscarCartaTipo(2).setActiva(true);
            }
            if (escenario.areaJugable.BuscarCartaTipo(3) != null) {
                escenario.areaJugable.BuscarCartaTipo(3).setActiva(true);
            }

            escenario.areaJugable.EliminarCarta(this);
        }
    }

    @Override
    public String descripcion() {
        return (" Se destruye para preparar cualquier número de trampas, vehículos y armas");
    }

}
