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
        try {
       
        System.out.print("C");
            System.out.print("a");Thread.sleep(5*50);
            System.out.print("r");Thread.sleep(5*50);
            System.out.print("g");Thread.sleep(5*50);
            System.out.print("a");Thread.sleep(5*50);
            System.out.print("n");Thread.sleep(5*50);
            System.out.print("d");Thread.sleep(5*50);
            System.out.print("o");Thread.sleep(5*50);
            System.out.print(" ");Thread.sleep(5*50);
            System.out.print("p");Thread.sleep(5*50);
            System.out.print("a");Thread.sleep(5*50);
            System.out.print("r");Thread.sleep(5*50);
            System.out.print("t");Thread.sleep(5*50);
            System.out.print("i");Thread.sleep(5*50);
            System.out.print("d");Thread.sleep(5*50);
            System.out.println("a");Thread.sleep(5*50);
        System.out.println("Esto podría tardar unos segundos...");
        System.out.println("Preparando Zombies...");
              
        } catch (Exception e) {
        }
       
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
        }, 1500);

    }

}
