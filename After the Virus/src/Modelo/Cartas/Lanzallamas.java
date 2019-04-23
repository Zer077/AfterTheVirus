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
 * @author Maria
 */
public class Lanzallamas extends CartaArma {

    public Lanzallamas(int precio, String nombre, Escenario Escenario, int tipo, int activacion, int municion) {
        super(3, "Lanzallamas", Escenario, 3, 1, 0);
    }

    @Override
    public void action() {
        Scanner sc = new Scanner(System.in);
        escenario.vista.verAreaZombies();
        for(int i=0; i<3; i++){
            System.out.println("Selecciona el zombie: ");
            int a = sc.nextInt();
            escenario.arrayZombies.get(a).muereZombie();
        }
    }

    @Override
    public void descripcion() {
        System.out.println("Descarta para matar a 3 zombis.");
    }

}
