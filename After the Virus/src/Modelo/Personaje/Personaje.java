/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Personaje;

import Modelo.Escenario;
import java.util.Scanner;

/**
 *
 * @author Zero
 */
public abstract class Personaje {

    Escenario escenario;
    String nombre = null;
    private boolean pierna = false;
    private boolean brazo = false;
    private boolean cabeza = false;

    public Personaje(Escenario escenario) {
        this.escenario = escenario;
    }

    //Este metodo me debe dejar elegir a que parte del cuerpo deseo que me golpee primero el Zombie
    public void parteCuerpoAtacar() {

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the pierna
     */
    public boolean isPierna() {
        return pierna;
    }

    /**
     * @param pierna the pierna to set
     */
    public void setPierna(boolean pierna) {
        this.pierna = pierna;
    }

    /**
     * @return the brazo
     */
    public boolean isBrazo() {
        return brazo;
    }

    /**
     * @param brazo the brazo to set
     */
    public void setBrazo(boolean brazo) {
        this.brazo = brazo;
    }

    /**
     * @return the cabeza
     */
    public boolean isCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(boolean cabeza) {
        this.cabeza = cabeza;
    }

}
