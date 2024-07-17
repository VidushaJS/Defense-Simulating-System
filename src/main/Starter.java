/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import JFrames.HelicopterWindow;
import JFrames.MainControllerWindow;
import JFrames.SubmarineWindow;
import JFrames.TankWindow;
import classes.Strength;

/**
 *
 * @author Vidusha
 */
public class Starter {
    
    public static void main(String[] args) {
        MainControllerWindow defenceController = new MainControllerWindow(Strength.LOW);
        HelicopterWindow helicopter = new HelicopterWindow(defenceController, 4, 100);
        SubmarineWindow submarine = new SubmarineWindow(defenceController, 70, 150);
        TankWindow tank = new TankWindow(defenceController, 4, 200);
        defenceController.addDefenceUnit(helicopter);
        defenceController.addDefenceUnit(submarine);
        defenceController.addDefenceUnit(tank);
        
    }
    
    
}
