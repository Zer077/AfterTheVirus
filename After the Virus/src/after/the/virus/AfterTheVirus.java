/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package after.the.virus;

import Vista.MenuPrincipal;

/**
 *
 * @author Zero
 */
public class AfterTheVirus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        // TODO code application logic here

        DebugMode d = new DebugMode();
//        d.iniciar();

        MenuPrincipal menu = new MenuPrincipal();
        menu.Iniciar();

    }

}
