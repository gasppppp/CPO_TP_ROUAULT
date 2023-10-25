/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_rouault_version_console;

/**
 *
 * @author Gaspard Rouault
 */
public class GrilledeJeu {
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;
    CelluleLumineuse[][] MaGrille;

    /**
     * Ce constructeur initialise nb lignes et colonnes et réserve la mémoire pour la grille de jeu et la cellule
     * @param nbLignes
     * @param nbColonnes
     */
    public GrilledeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        
        matriceCellules=new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                // Création d'un nouvel objet de type CelluleLumineuse pour chaque cellule
                this.matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    @Override
    public String toString() {
       
       
       String MaGrille="";
       String separator="-----";
       
       for (int i=0;i<nbColonnes ;i++){
           MaGrille+=" "+i+" |";
       }
       for (int i=0;i<nbColonnes ;i++){
           separator+="----";
       }
       for (int i=0;i<nbColonnes ;i++){
          
          MaGrille+="\n"+separator+ "\n";
          MaGrille+=" "+i+" |";
          for (int j = 0; j < nbColonnes; j++) { 
            
            if (matriceCellules[i][j].getEtat()==true){              
                 
                MaGrille+=" X |";              
            }else{
                
                MaGrille+=" O |";
            }
            
          }  
       }
       MaGrille+="\n"+separator;
       return "   |"+ MaGrille;    
    }
    
    
    
}
