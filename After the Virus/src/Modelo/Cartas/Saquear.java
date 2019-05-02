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
public class Saquear extends Carta {

    public Saquear(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Saquear", Escenario, 5, 0);
    }

    @Override
    public void action() {
        escenario.vista.verAreaExploracion();
        System.out.println("Elige la carta que quieres recuperar: ");
        Scanner sc = new Scanner(System.in);
        int opcionZombie = sc.nextInt();
        if (escenario.arrayEscenario.size()>0){
        try {
            escenario.mano.aniadirCartaMano(escenario.arrayEscenario.get(opcionZombie - 1));        
            escenario.areaJugable.DescartarCarta(this);

        } catch (Exception e) {
            System.out.println("No existen elementos");
           escenario.mano.usarCartas(escenario.menuOpciones.ElegirCartas(), escenario.menuOpciones.ElegirOpcion());
        }}
        
    }

    @Override
    public void descripcion() {
        System.out.println("Recupera 1 carta");
    }

}
