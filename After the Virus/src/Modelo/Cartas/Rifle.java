
package Modelo.Cartas;

import Modelo.Escenario;
import java.util.ArrayList;

public class Rifle extends CartaArma {

    public Rifle(int precio, String nombre, Escenario Escenario, int tipo, int activacion, int municion) {
        super(2, "Rifle", Escenario, 3, 1, 0);
    }

    @Override
    public void action() {
        if(this.municion==0){
            System.out.println("¡Debes añadir munición para poder usarla!");
        }else{
            
        }    
    }

    @Override
    public void descripcion() {
        System.out.println("Puedes añadir cartas de tu mano como munición.\nUna vez por turno:\nDescarta munición para matar 1 zombi en juego o en la pila de descartes.");
    }

}
