/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.Observable;
import javax.swing.JFrame;

/**
 *
 * @author Vidusha
 */
public abstract class SuperDefence extends JFrame {
    
    private Observable mainController;
    private String defenceName;
    private Strength strength;
    private int soldierCount;
    private int fuelAmount;
    private int ammoCount;
    private int msgId;

    public SuperDefence(Observable mainController, String defenceName, int soldierCount, int ammoCount) {
        this.mainController = mainController;
        this.defenceName = defenceName;
        this.soldierCount = soldierCount;
        this.ammoCount = ammoCount;
        fuelAmount = 100;
        msgId = 0;
    }    

    public void setDefenceName(String defenceName) {
        this.defenceName = defenceName;
    }
    
    public void setSoldierCount(int soldierCount) {
        this.soldierCount = soldierCount;
    }

    public void setStrength(Strength strength) {
        this.strength = strength;
    }
    
    public void setAmmoCount(int ammoCount) {
        this.ammoCount = ammoCount;
    }

    public Observable getMainController() {
        return mainController;
    }

    public String getDefenceName() {
        return defenceName;
    }

    public Strength getStrength() {
        return strength;
    }
    
    public int getSoldierCount() {
        return soldierCount;
    }

    public int getAmmoCount() {
        return ammoCount;
    }

    public abstract int getFuelAmount();
    
    public int getMsgId() {
        return ++msgId;
    }
    
    public void decreaseAmmoCount() {
       if(ammoCount != 0) {
           ammoCount--;
       }
    }
    
}
