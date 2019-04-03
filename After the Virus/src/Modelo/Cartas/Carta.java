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
    private String nombre = null;
    private boolean activa = false;
    int tipo = 0;
    //TIPO: 1-lanzar 2-pegar 3-disparar 4-equipo 6-armadura 7-medicina 
    //8-lugar 9-train 10-trampa 11-animal 12-persona 13-zona 14-vehiculo

    public Carta(int precio, String nombre, Escenario Escenario, int tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;

    }
//Lo que haga la carta

    abstract public void action();

    ///La descripcion de la carta para verla por pantalla.
    abstract public void descripcion();

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

}
