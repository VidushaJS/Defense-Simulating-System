/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import classes.Strength;

/**
 *
 * @author Vidusha
 */
public interface Observer {
    
    void setAreaClear(boolean isClear);
    
    String getDefenceName();
    
    int getSoldierCount();
    
    int getAmmoCount();
    
    int getFuelAmount();
    
    void setStrengthLevel(Strength strength);
    
    void setStrength(Strength strength);
    
}
