/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;

import Modelo.Escenario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose
 * 
 *  Solventacion de errores  José
 */
public class Zombie1 extends Zombie implements Serializable {

    public Zombie1(int precio, String nombre, Escenario Escenario, int tipo, int activacion) {
        super(0, "Z1", Escenario, 0, 0);
        zombie = new ArrayList<>();
        zombie.add(new Zombi());
        super.setNumeroZombie(1);

    }

    @Override
    public void atacaHumano() {

        for (int i = 0; i < zombie.size(); i++) {
            if (zombie.get(i).isVivo() == true) {
                escenario.personaje.parteCuerpoAtacar();

            }
        }
        escenario.mazoZombies.getDescarteZombies().add(this);
        escenario.mazoZombies.eliminarZombieArray(this);

    }

    //NO HACER
    @Override
    public String descripcion() {
        return ("zombi, un zombie mas... un zombie menos, este juego es demasiado dificil y posiblemente no se pueda ganar nunca");
    }

    @Override
    public void action() {
        System.out.println("No se como has llegado a ver esto, debería ser imposible, si encuentras este error comuníqueselo al administrador de Zombies numero 612-321-999");
        System.out.println("Coge el teléfono y llama...");
        Scanner sc = new Scanner(System.in);
        try {
            int numero = sc.nextInt();

            if (numero == 612321999) {

                System.out.println("Hola, servicio técnico, se ha encontrado con un Zombie perdido, no se preocupe lo solucionaremos en un momento");
                Enter();
                System.out.println("Musica de tele-operadora...");
                Enter();
                System.out.println("Gracias por la espera devolveremos al Zombie al lugar que le corresponde");
                Enter();
                escenario.arrayZombies.add(this);
                escenario.mano.getMano().remove(this);
            } else {

                System.out.println("Si no quiere colaborar no podemos ayudarle, se ha equivocado de número, por ello su partida ha finalizado");
                Enter();
                escenario.personaje.setCabeza(true);
            }

        } catch (Exception e) {
            action();
        }

    }

    public void Enter() {
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
