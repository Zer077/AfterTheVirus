

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
public class Coche extends Carta {

    public Coche(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(2, "Coche", Escenario, 14, 2);
    }

    @Override
    public void action() {
        Scanner sc = new Scanner(System.in);
        escenario.vista.verAreaZombies();
        System.out.println("Selecciona el zombie: ");
        int a = sc.nextInt();
        escenario.arrayZombies.get(a).muereZombie();
        
        //Falta descartar el resto
        for (int i = 0;i < escenario.arrayZombies.size();i++){
            
        }
        
        escenario.areaJugable.DescartarCarta(this);
    }

    @Override
    public void descripcion() {
        System.out.println("Se descarta para matar 1 carta de zombi y descartar el resto.");
    }

}
