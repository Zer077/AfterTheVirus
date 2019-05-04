/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author enrique
 */
public class GuardarYCargar {

    public void guardar(String archivo, Object o) {
        FileOutputStream aux = null;
        try {
            aux = new FileOutputStream(archivo);
            ObjectOutputStream salida = new ObjectOutputStream(aux);
            salida.writeObject(o);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public Object abrir(String archivo) {
        try {
            FileInputStream aux = new FileInputStream(archivo);
            ObjectInputStream entrada = new ObjectInputStream(aux);
            return entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
            return null;

        }
    }

}
