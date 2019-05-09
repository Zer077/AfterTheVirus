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
public class EfectoDeSonido extends Thread implements Serializable {

    String url;
    Player apl = null;

    public EfectoDeSonido(String a) {

        url = a;

    }

    public void matar(EfectoDeSonido m) throws Throwable {
        apl.close();
        m.finalize();

    }

    @Override
    public void run() {

        try {

            apl = new Player(new FileInputStream(
                    url));
            apl.play();

        } catch (FileNotFoundException | JavaLayerException ex) {
            Logger.getLogger(EfectoDeSonido.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
