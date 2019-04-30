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
    private int defensa = 0;

    public Personaje(Escenario escenario) {
        this.escenario = escenario;
    }

    //Este metodo me debe dejar elegir a que parte del cuerpo deseo que me golpee primero el Zombie
    public void parteCuerpoAtacar() {

        if (getDefensa() == 0) {

            if (brazo == true && pierna == true) {
                cabeza = true;
                System.out.println("HAS MUERTO");

            } else {

                System.out.println("Que parte del cuerpo te golpea el Zombie?...");
                System.out.println("1. Brazo 2.Pierna");
                Scanner sc = new Scanner(System.in);
                int parte = sc.nextInt();

                switch (parte) {
                    case 1:
                        if (brazo == false) {
                            brazo = true;
                            System.out.println("AHHH. EL ZOMBIE ME ROMPIÓ UN BRAZO");

                        } else {
                            pierna = true;

                            System.out.println("AHHH. EL ZOMBIE ME ROMPIÓ LA PIERNA");
                        }
                        break;
                    case 2:
                        if (pierna == false) {
                            pierna = true;
                            System.out.println("AHHH. EL ZOMBIE ME ROMPIÓ LA PIERNA");

                        } else {
                            brazo = true;

                            System.out.println("AHHH. EL ZOMBIE ME ROMPIÓ UN BRAZO");
                        }
                        break;
                    case 202122:
                        System.out.println("EasterEgg");
                        break;
                    default:
                        System.out.println("parte equivocada");
                        parteCuerpoAtacar();
                        break;

                }
            }
        } else {
            setDefensa(getDefensa() - 1);
        }
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

    /**
     * @return the defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa the defensa to set
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

}
