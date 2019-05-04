/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Zombi implements Serializable {

    private boolean vivo = true;

    public Zombi() {
    }

    /**
     * @return the vivo
     */
    public boolean isVivo() {
        return vivo;
    }

    /**
     * @param vivo the vivo to set
     */
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

}
