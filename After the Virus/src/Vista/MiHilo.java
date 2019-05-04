/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author jose_
 */
public class MiHilo extends Thread implements Serializable {

    public void matar(MiHilo m) throws Throwable {
        m.finalize();

    }

    @Override
    public void run() {

        Player apl;
        try {
            apl = new Player(new FileInputStream(
                    "Batalla.mp3"));
            apl.play();

            if (apl.isComplete()) {
                MiHilo m = new MiHilo();
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
