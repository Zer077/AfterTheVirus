/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Zero
 */
public class Bar extends Carta implements Serializable {

    public Bar(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Bar", Escenario, 8, 12);
    }

    @Override
    public void action() {

        if (("Refugio".equals(escenario.areaJugable.BuscarCartaNombre("Refugio").getNombre())) && (escenario.areaJugable.BuscarCartaNombre("Refugio").isActiva()) && (escenario.PersonasSalvadas > 0)) {
            System.out.println("Elige la zona que quieres curarte");

            if ((escenario.personaje.isBrazo() == true) && (escenario.personaje.isPierna() == true)) {
                System.out.println("El brazo y la pierna estan dañadas");
            } else if (escenario.personaje.isBrazo() == true) {
                System.out.println("El brazo esta dañado ");

            } else if (escenario.personaje.isPierna() == true) {
                System.out.println("La pierna esta dañada");
            }

            System.out.println("1. Brazo 2.Pierna");
            Scanner sc = new Scanner(System.in);
            int parte = sc.nextInt();

            switch (parte) {
                case 1:
                    escenario.personaje.setBrazo(false);
                    break;

                case 2:
                    escenario.personaje.setPierna(false);
                    break;

                default:
                    System.out.println("No has elegido el numero correcto");
                    escenario.menuOpciones.ElegirOpcion();
                    break;

            }
        }

        escenario.areaJugable.DescartarCarta(this);

    }

    @Override
    public String descripcion() {
        return ("(Se prepara con 1 survivor) Cuando se juega safehouse, se cura 1 daño.");
    }

}
