/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Mano;

/**
 *
 * @author Zero
 */
public class MenuOpciones {

//me permite elegir las cartas que quiero usar y la opcion para estas
    Mano mano;

    public MenuOpciones(Mano mano) {
        this.mano = mano;
    }

    public void Menu() {
        //1-Usar de las cartas inactivas (activar y usar),

        System.out.println("activar cartas");
        //2-Usar para colocar (inactiva) (Si se coloca una carta de costo 0 de activacion activar automáticamente)
        System.out.println("Colocar cartas");
        //3-Usar para comprar
        System.out.println("Usar cartas seleccionadas para comprar");
        //4-Usar para Explorar
        System.out.println("Usar cartas para explorar");
    }

    //Elige una de las diversas opciones del juego
    public int ElegirOpcion() {
        return 0;
    }

    //muestra las cartas y permite Elegir todas las cartas que deseas y devuelves el numero de estas 
    public int[] ElegirCartas() {
        return null;
    }

}
