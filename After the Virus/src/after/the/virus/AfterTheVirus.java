/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package after.the.virus;

import Controlador.EfectoDeSonido;
import Vista.MenuPrincipal;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class AfterTheVirus implements Serializable {

    /**
     * @param args the command line arguments
     * @throws java.lang.Throwable
     */
    public static void main(String[] args) throws Throwable {
        // TODO code application logic here
        EfectoDeSonido efects = new EfectoDeSonido("pacman.mp3");
        System.currentTimeMillis();
        efects.start();
        System.out.println("Cargando partida...");
        System.out.println("Esto podría tardar unos segundos...");
        System.out.println("Preparando Zombies...");
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                MenuPrincipal menu = new MenuPrincipal();
                try {
                    menu.Iniciar();
                } catch (Throwable ex) {
                    Logger.getLogger(AfterTheVirus.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }, 4000);

    }

}
