/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_rouault_version_console;

/**
 *
 * @author Gaspard Rouault
 */
public class LightOff_ROUAULT_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse cellule1=new CelluleLumineuse();
        
        System.out.println(cellule1.getEtat());
        cellule1.activerCellule();
        System.out.println(cellule1.getEtat());
        
        GrilledeJeu grille1=new GrilledeJeu(3,3);
        
        
        
        /*grille1.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println(grille1.toString());
        grille1.activerDiagonaleMontante();
        System.out.println(grille1.toString());
        grille1.activerColonneDeCellules(2);
        System.out.println(grille1.toString());
        grille1.activerDiagonaleDescendante();
        System.out.println(grille1.toString());
        grille1.activerLigneDeCellules(1);
        System.out.println(grille1.toString());
        grille1.cellulesToutesEteintes();
        System.out.println(grille1.toString());
        grille1.eteindreToutesLesCellules();
        System.out.println(grille1.toString());*/
        
        Partie partie1=new Partie(grille1,5);
        partie1.lancerPartie();
        System.out.println(grille1.toString());
    }
    
    
}
