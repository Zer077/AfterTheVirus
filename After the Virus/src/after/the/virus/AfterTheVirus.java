/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package after.the.virus;

import Vista.MenuPrincipal;
import java.io.Serializable;

/**
 *
 * @author Zero
 */
public class AfterTheVirus implements Serializable {

    /**
     * @param args the command line arguments
     * @throws java.lang.Throwable
     */
    public static void main(String[] args) throws Throwable {
        // TODO code application logic here

        MenuPrincipal menu = new MenuPrincipal();
        menu.Iniciar();

    }

}
