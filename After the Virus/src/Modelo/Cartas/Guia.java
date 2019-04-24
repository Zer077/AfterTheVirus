/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.util.Scanner;

/**
 *
 * @author Zero
 */
public class Guia extends Carta {

    public Guia(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(precio, nombre, Escenario, tipo, activacion);
    }

    @Override
    public void action() {
        
        if(escenario.mazoZombies.getDescarteZombies().size() == 1){
            escenario.mazoZombies.getDescarteZombies().remove(0);
        } else if (escenario.mazoZombies.getDescarteZombies().size() >= 2){
        escenario.mazoZombies.getDescarteZombies().remove(0);
        escenario.mazoZombies.getDescarteZombies().remove(0);
        } else {
            System.out.println("No hay zombies para descartar.");
        }
        
        escenario.areaJugable.DescartarCarta(this);
    }

    @Override
    public void descripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
