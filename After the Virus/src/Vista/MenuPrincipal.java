/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Modelo.Escenario;
import Modelo.Personaje.Adam;
import Modelo.Personaje.Personaje;
import after.the.virus.DebugMode;

/**
 *
 * @author Zero
 */
public class MenuPrincipal {

//Me muestra reglas, me muestra las campañas y el personaje que quiero seleccionar, tu debes crear el personaje y crear el controlador antes de empezar la campaña
    public MenuPrincipal() {
    }

    public void Iniciar() {
        Controlador c=new Controlador();
        Personaje p=new Adam(c);
        c.AniadirPersonaje(p);
        c.controlador1a();
        //DebugMode();
    }

    public void DebugMode() {
        
        DebugMode DBM = new DebugMode();
        DBM.iniciar();

    }

}
