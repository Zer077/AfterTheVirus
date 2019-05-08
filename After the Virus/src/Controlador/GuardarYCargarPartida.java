/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class GuardarYCargarPartida implements Serializable{

    public void Guardar(Object o) {
        String ruta = "sav.txt";
        File archivo = new File(ruta);
        FileOutputStream aux = null;
        try {
            if (archivo.exists()) {
                aux = new FileOutputStream(archivo);
                ObjectOutputStream salida = new ObjectOutputStream(aux);
                salida.writeObject(o);
            } else {
                System.out.println("No existe archivo de guardado, ¿deseas crear uno nuevo?");
                System.out.println("Si o No...");
                Scanner sc = new Scanner(System.in);
                String SN = sc.next();
                if ("Si".equals(SN) || "s".equals(SN) || "S".equals(SN) || "SI".equals(SN)) {
                    archivo.createNewFile();
                } else {
                    System.out.println("No se ha creado archivos para guardar los datos");

                }

            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public Object Cargar() {
        String ruta = "sav.txt";
        File archivo = new File(ruta);
        try {
            FileInputStream aux = new FileInputStream(archivo);
            ObjectInputStream entrada = new ObjectInputStream(aux);
            return entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
            return null;

        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }

}
