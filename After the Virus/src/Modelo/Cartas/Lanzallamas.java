
package Modelo.Cartas;

import Modelo.Escenario;
import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Lanzallamas extends CartaArma {

    public Lanzallamas(int precio, String nombre, Escenario Escenario, int tipo, int activacion, int municion){
        
        super(3, "Lanzallamas", Escenario, 3, 1, 0);
    }

    @Override
    public void action(){
        
        Scanner sc = new Scanner(System.in);
        escenario.vista.verAreaZombies();
        for(int i=0; i<3; i++){
            System.out.println("Selecciona el zombie: ");
            int a = sc.nextInt();
            escenario.arrayZombies.get(a).muereZombie();
        }
        escenario.mazoDescartes.IntroducirCarta(this);
    }

    @Override
    public void descripcion(){
        
        System.out.println("Descarta para matar a 3 zombis.");
    }

}
