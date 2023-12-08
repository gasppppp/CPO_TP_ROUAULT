/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

/**
 *
 * @author marin
 */
public class Pions {
    private int position_ligne;
    private int position_colonne; 
    private boolean eleve;
    private String couleur;  //R pour rouge et B pour bleu

    public Pions(int position_ligne, int position_colonne, boolean eleve) {
        this.position_ligne = position_ligne;
        this.position_colonne = position_colonne;
        this.eleve = eleve;
    }

    public int getPosition_ligne() {
        return position_ligne;
    }

    public int getPosition_colonne() {
        return position_colonne;
    }

    public boolean estEleve() {
        return eleve;
    }

    public String getCouleur() {
        return couleur;
    }
    
    //CREER LA METHODE POUR CHECKER QU'UNE CASE VOULUE EST BIEN DANS LA GRILLE
    /*public boolean verifierCaseDansGrille(int position_ligne, int position_colonne, Cartes carte) {
        String animal = carte.nom;
    }*/
    
    
    
}
