/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author Gaspard Rouault
 */
public class Magicien extends Personnage {
    boolean confirme;
    private static int nombreMagiciens = 0;

    public Magicien( String nom, int lvlvie,boolean confirme) {
        super(nom, lvlvie);
        this.confirme = confirme;
        nombreMagiciens++;
    }
    
    public static int getNombreMagiciens() {
        
        return nombreMagiciens;
    }   
    
    @Override
    public void estAttaqué(int points){
        lvlvie=lvlvie-points;
    }
    
    @Override
    public String toString() {
        return "Magicien{" + "confirme=" + confirme + super.toString()+'}';
    }
    
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
}
