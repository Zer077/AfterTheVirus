/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;

/**
 *
 * @author Jose
 */
public abstract class Carta implements Serializable{

    private int precio = 0;
    private int activacion = 0;
    private String nombre = null;
    private boolean activa = false;
    private int tipo = 0;
    Escenario escenario;

    //TIPO: 1-lanzar 2-pegar 3-disparar 4-equipo 5-otro 6-armadura 7-medicina 
    //8-lugar 9-train 10-trampa 11-animal 12-persona 13-zona 14-vehiculo
    public Carta(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.activacion = activacion;
        this.escenario = Escenario;

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

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the activacion
     */
    public int getActivacion() {
        return activacion;
    }

    /**
     * @param activacion the activacion to set
     */
    public void setActivacion(int activacion) {
        this.activacion = activacion;
    }

}
