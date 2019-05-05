/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Personaje;

import Modelo.Cartas.Ametralladora;
import Modelo.Cartas.Antidoto;
import Modelo.Cartas.BombaDeDemolición;
import Modelo.Cartas.ChaquetaDeCuero;
import Modelo.Cartas.Coche;
import Modelo.Cartas.Cura;
import Modelo.Cartas.Explorar;
import Modelo.Cartas.Gasolina;
import Modelo.Cartas.HabilidadConTrampas;
import Modelo.Cartas.KitMedico;
import Modelo.Cartas.Laboratorio;
import Modelo.Cartas.Lanzallamas;
import Modelo.Cartas.MC;
import Modelo.Cartas.Machete;
import Modelo.Cartas.Motosierra;
import Modelo.Cartas.ObjetivoSeguro;
import Modelo.Cartas.Refugio;
import Modelo.Cartas.Revista;
import Modelo.Cartas.TrampaPermetral;
import Modelo.Cartas.Tunel;
import Modelo.Cartas.VIP;
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
        
        escenario.mazoJugador.aniadir(new Refugio(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Antidoto(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new BombaDeDemolición(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Coche(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Motosierra(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Cura(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Lanzallamas(0, nombre, escenario, 0, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Gasolina(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Laboratorio(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new ChaquetaDeCuero(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new MC(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Machete(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new KitMedico(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Ametralladora(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new TrampaPermetral(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Explorar(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new ObjetivoSeguro(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new HabilidadConTrampas(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Tunel(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new VIP(0, nombre, escenario, 0, 0));
        escenario.mazoEscenario.getMazoEscenario().add(new Revista(0, nombre, escenario, 0, 0));
        
        
        
    }

    //Este metodo me debe dejar elegir a que parte del cuerpo deseo que me golpee primero el Zombie
    public void parteCuerpoAtacar() {

        if (getDefensa() == 0) {

            if (brazo == true && pierna == true) {
                cabeza = true;   

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
                        System.out.println("Has esquivado magicamente el ataque,los dioses te han concedido una segunda oportunidad, gracias CCC");
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
