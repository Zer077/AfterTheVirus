/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Controlador.EfectoDeSonido;
import Modelo.Escenario;
import java.io.Serializable;

/**
 *
 * @author Abraham
 */
public class BombaDeDemolición extends Carta implements Serializable {
    
    public BombaDeDemolición(int precio, String nombre, Escenario Escenario, int activacion, int tipo) {
        super(2, "Bomba de demolición", Escenario, 10, 0);
    }
    
    @Override
    public void action() {
        
        for (int x = 0; x < escenario.arrayZombies.size(); x++) {
            if (!escenario.arrayZombies.isEmpty()) {                
                
                escenario.arrayZombies.get(0).muereCartaZombie();
                
            } else {
                System.out.println("no quedan zombis");
            }
            
            for (int y = 0; y < escenario.mazoDescartes.getMazo().size(); y++) {
                
                if (escenario.mazoDescartes.getMazo().get(y) instanceof Zombie) {
                    
                    escenario.mazoZombies.getDescarteZombies().add((Zombie) escenario.mazoDescartes.getMazo().get(y));
                    
                }
                
            }
            EfectoDeSonido efect = new EfectoDeSonido("bomba.mp3");
            efect.start();
            
            escenario.areaJugable.EliminarCarta(this);
            
        }
    }
    
    @Override
    public String descripcion() {
        return ("Bomba de demolición: Destruye esta carta para matar todos los zombis en el área de juego y en la pila de descarte de algún jugador.");
    }
    
}
