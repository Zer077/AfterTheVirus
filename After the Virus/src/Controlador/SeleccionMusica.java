/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Escenario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author jose
 */
public class SeleccionMusica extends Thread implements Serializable {

    Escenario c;
    String url;
    Player apl = null;

    public SeleccionMusica(String a, Escenario c) {
        this.c = c;
        url = a;

    }

    public void matar(SeleccionMusica m) throws Throwable {
        apl.close();
        m.finalize();

    }

    @Override
    public void run() {

        c.SM = this;
        try {

            apl = new Player(new FileInputStream(
                    url));
            apl.play();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SeleccionMusica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException ex) {
            Logger.getLogger(SeleccionMusica.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (apl.isComplete()) {
            SeleccionMusica m = new SeleccionMusica(url, c);
            m.start();
            try {
                m.matar(m);
            } catch (Throwable ex) {
                Logger.getLogger(SeleccionMusica.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                m.matar(this);
            } catch (Throwable ex) {
                Logger.getLogger(SeleccionMusica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
