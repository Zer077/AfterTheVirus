package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Modelo.Escenario;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Jose y Juan Solventacion de errores José
 */
public class MiHilo extends Thread implements Serializable {

    public transient Escenario c;
    public transient boolean muerto = false;
    public transient Player apl = null;

    public MiHilo(Escenario c) {
        this.c = c;

    }
    
    
    

    public void matar(MiHilo m) throws Throwable {

        if (apl != null) {

            apl.close();
        }
        m.finalize();

    }

    @Override
    public void run() {

        c.m = this;

        try {

            int num = (int) (Math.random() * 10 + 1);
            switch (num) {

                case 1:
                    apl = new Player(new FileInputStream(
                            "a lions legacy.mp3"));
                    apl.play();

                    break;
                case 2:
                    apl = new Player(new FileInputStream(
                            "light of the seven.mp3"));
                    apl.play();

                    break;
                case 3:
                    apl = new Player(new FileInputStream(
                            "no one walks away from me .mp3"));
                    apl.play();

                    break;
                case 4:
                    apl = new Player(new FileInputStream(
                            "the night king.mp3"));
                    apl.play();

                    break;
                case 5:
                    apl = new Player(new FileInputStream(
                            "ff71.mp3"));
                    apl.play();

                    break;
                case 6:
                    apl = new Player(new FileInputStream(
                            "ff72.mp3"));
                    apl.play();

                    break;
                case 7:
                    apl = new Player(new FileInputStream(
                            "xb1.mp3"));
                    apl.play();

                    break;
                case 8:
                    apl = new Player(new FileInputStream(
                            "xb2.mp3"));
                    apl.play();

                    break;
                case 9:
                    apl = new Player(new FileInputStream(
                            "zelda.mp3"));
                    apl.play();

                    break;
                case 10:
                    apl = new Player(new FileInputStream(
                            "ridley.mp3"));
                    apl.play();

                    break;

            }

            if (apl.isComplete()) {
                MiHilo m = new MiHilo(c);
                m.start();
                m.matar(this);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MiHilo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException ex) {
            Logger.getLogger(MiHilo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Throwable ex) {
            Logger.getLogger(MiHilo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
