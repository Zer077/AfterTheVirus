/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;

/**
 *
 * @author Zero
 */
public class KitMedico extends Carta {

    public KitMedico(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(1, "KitMedico", Escenario, 7, 0);
    }

   
     @Override
    public void action() {
       if(escenario.arrayZombies.isEmpty()){
           
           
           escenario.personaje.setBrazo(false);
           escenario.personaje.setPierna(false);
       }
       
       else{
            System.out.println("Lo sentimos, hay zombies cerca, no te puedes curar");
       }
       
       escenario.areaJugable.EliminarCarta(this);
    }


    @Override
    public void descripcion() {
        System.out.println("Si no hay zombis en juego, se destruye para curar 2 daños.");
    }
}
