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
 * @author Jose y Juan
 */
public class MiHilo extends Thread implements Serializable {

    Escenario c;
    boolean muerto = false;
    Player apl = null;

    public MiHilo(Escenario c) {
        this.c = c;

    }

    public void matar(MiHilo m) throws Throwable {
        apl.close();
        m.finalize();

    }

    @Override
    public void run() {

        c.m = this;

        try {

            int num = (int) (Math.random() * 4 + 1);
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
