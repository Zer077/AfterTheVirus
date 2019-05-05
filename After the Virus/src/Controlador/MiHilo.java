package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author jose_
 */
public class MiHilo extends Thread {

    Controlador c;
    boolean muerto = false;

    public MiHilo(Controlador c) {
        this.c = c;

    }

    public void matar(MiHilo m) throws Throwable {

        c.musicas.remove(m);
        m.finalize();

    }

    public void run() {

        Player apl = null;
        c.musicas.add(this);

        try {
            if (muerto == true) {
            apl = new Player(new FileInputStream(
                                "the night king.mp3"));
                        apl.play();
            
            
            
            }else{
                
                
                
                
                
                
                
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
                                "no one walks away from me .mp3"));
                        apl.play();

                        break;

                }
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
