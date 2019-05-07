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
public class Laboratorio extends Carta implements Serializable{

    public Laboratorio(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Laboratorio", Escenario, 8, 12);
    }

    @Override
    public void action() {

        for (int i = 0; i < escenario.arrayEliminadas.size(); i++) {

            if (escenario.arrayEliminadas.get(i).getTipo() == 7) {

                escenario.arrayDescartadas.add(escenario.arrayEliminadas.get(i));
                escenario.arrayEliminadas.remove(escenario.arrayEliminadas.get(i));
            }
        }

        escenario.areaJugable.DescartarCarta(this);
    }

    @Override
    public void descripcion() {
        System.out.println("(Se prepara con safe house) Las medicinas destruidas pueden ponerse en el descarte en cualquier momento.");
    }

    @Override
    public void setActiva(boolean activa) {

        Scanner sc = new Scanner(System.in);
        //activacion de la carta Laboratorio

        int refugio = 0;

        //comprobar cuantos laboratorios y refugios hay en tu mano
        for (int i = 0; i < escenario.areaJugable.getArrayJugables().size(); i++) {

            if (escenario.areaJugable.getArrayJugables().get(i).getNombre() == "Refugio") {
                refugio++;
            }

        }

        //preguntar si quiere activar laboratorio
        //usa refugio para activar laboratorio (activo laboratorio) refugio la descarto 
        if (refugio > 0) {

            System.out.println("En tu mano hay al menos un refugio. ¿Quieres activar un laboratorio? S/N");
            String respuesta = sc.next();

            if (respuesta.toUpperCase() == "S") {
                setActiva(true);
                escenario.arrayDescartadas.add(escenario.areaJugable.BuscarCartaNombre("Refugio"));
            } else if (respuesta.toUpperCase() == "N") {
                escenario.menuOpciones.ElegirOpcion();
            } else {
                System.out.println("Esta opcion no es valida.");
                setActiva(true);
            }

        }

    }

}
