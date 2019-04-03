/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public abstract class CartaArma extends Carta{
    
    ArrayList<Carta> cartas;
    
    public CartaArma(int precio, String nombre, Escenario Escenario, int tipo) {
        super(precio, nombre, Escenario, tipo);
        cartas=new ArrayList<>();
    }
    
    
    
    
    
    
}
