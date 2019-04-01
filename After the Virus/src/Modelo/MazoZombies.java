/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cartas.Carta;
import java.util.ArrayList;

/**
 *
 * @author Zero
 */
public class MazoZombies extends Mazo {

    ArrayList<Carta> MazoZombie = new ArrayList();

    //Se encarga de administrar los monstruos, debe poner Zombies en su array de escenario y en cada turno restaurar el mazo en el orden correcto
    public MazoZombies(Escenario escenario) {
        super(escenario);
    }

    public void Restaurar() {
    }

    public void Introducir() {
    }

}
