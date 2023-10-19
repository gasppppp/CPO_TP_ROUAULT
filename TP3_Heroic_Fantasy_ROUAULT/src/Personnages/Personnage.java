/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Gaspard Rouault
 */
public abstract class Personnage {
    String nom;
    int lvlvie;

    public Personnage(String nom, int lvlvie) {
        this.nom = nom;
        this.lvlvie = lvlvie;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", lvlvie=" + lvlvie + '}';
    }
    
    
    
}
