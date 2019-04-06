/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Personaje;

import Modelo.Cartas.Antidote;
import Modelo.Cartas.Blockbuster;
import Modelo.Cartas.Car;
import Modelo.Cartas.Chainsaw;
import Modelo.Cartas.ConcussionGrenade;
import Modelo.Cartas.Crossfire;
import Modelo.Cartas.Crowbar;
import Modelo.Cartas.Cure;
import Modelo.Cartas.Entrenchment;
import Modelo.Cartas.Flamethrower;
import Modelo.Cartas.Food;
import Modelo.Cartas.Gasoline;
import Modelo.Cartas.Guide;
import Modelo.Cartas.Lab;
import Modelo.Cartas.LeatherJacket;
import Modelo.Cartas.MC;
import Modelo.Cartas.Machete;
import Modelo.Cartas.Magazine;
import Modelo.Cartas.MedKit;
import Modelo.Cartas.Minigun;
import Modelo.Cartas.PerimeterTrap;
import Modelo.Cartas.Perro;
import Modelo.Cartas.Pistol;
import Modelo.Cartas.Pub;
import Modelo.Cartas.Raid;
import Modelo.Cartas.Rifle;
import Modelo.Cartas.Run;
import Modelo.Cartas.SafeHouse;
import Modelo.Cartas.Scout;
import Modelo.Cartas.Shotgun;
import Modelo.Cartas.SureAim;
import Modelo.Cartas.Survivor;
import Modelo.Cartas.TrapperSkill;
import Modelo.Cartas.Tunnel;
import Modelo.Cartas.VIP;
import Modelo.Cartas.WeaponSkill;
import Modelo.Escenario;

/**
 *
 * @author Zero
 */
public class Jennie extends Personaje {

    public Jennie(Escenario escenario) {
        super(escenario);
        escenario.mazoJugador.getMazoJugador().add(new SafeHouse(0, nombre, escenario, 0,0));
        escenario.mazoJugador.getMazoJugador().add(new Pistol(0, nombre, escenario, 0,0));
        for (int i = 0; i < 3; i++) {
            escenario.mazoJugador.getMazoJugador().add(new Survivor(0, nombre, escenario, 0,0));
            escenario.mazoJugador.getMazoJugador().add(new Run(0, nombre, escenario, 0,0));
        }

        escenario.mazoEscenario.getMazoEscenario().add(new Antidote(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Blockbuster(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Car(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Chainsaw(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new ConcussionGrenade(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Crossfire(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Crowbar(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Cure(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Entrenchment(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Flamethrower(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Food(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Gasoline(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Guide(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Lab(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new LeatherJacket(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new MC(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Machete(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new MedKit(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Minigun(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new PerimeterTrap(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Perro(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Pub(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Raid(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Rifle(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Scout(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Shotgun(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new SureAim(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new TrapperSkill(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Tunnel(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new VIP(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new Magazine(0, nombre, escenario, 0,0));
        escenario.mazoEscenario.getMazoEscenario().add(new WeaponSkill(0, nombre, escenario, 0,0));
        super.nombre = "Jennie";

    }

}
