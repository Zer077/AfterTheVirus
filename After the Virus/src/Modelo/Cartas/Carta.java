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
public abstract class Carta {

    int precio = 0;
    int activacion = 0;
    String nombre = null;
    private boolean activa;
    int tipo = 0;
    //tipo 1-arma 2-trampa 3-otra

    public Carta(int precio, int activacion, String nombre, Escenario Escenario) {
        this.nombre = nombre;
        this.precio = precio;
        this.activacion = activacion;

    }
//Lo que haga la carta

    public void action() {
    }

    ///La descripcion de la carta para verla por pantalla.
    public void descripcion() {
    }

    /**
     * @return the activa
     */
    public boolean isActiva() {
        return activa;
    }

    /**
     * @param activa the activa to set
     */
    public void setActiva(boolean activa) {
        this.activa = activa;
    }

}
