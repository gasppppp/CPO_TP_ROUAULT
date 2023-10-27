/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_rouault_version_console;

import java.util.Scanner;

/**
 *
 * @author Gaspard Rouault
 */
public class Partie {
    GrilledeJeu grille;
    int nbCoups=0;
    int a;

    public Partie(GrilledeJeu grille, int nbCoups) {
        this.grille = new GrilledeJeu(a,a);
        this.nbCoups = nbCoups;
    }
    
    public void initialiserPartie(){
        this.grille.melangerMatriceAleatoirement(10);
    }
    
    public void lancerPartie(){
        String Coupjoueur;
        int num;
        System.out.println(grille.toString());
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Entrer le coups souhaité (colonne/ligne/ diagonalemontante/diagonaledescendante):");
        Coupjoueur = sc.nextLine();
        while(!"colonne".equals(Coupjoueur) ||!"ligne".equals(Coupjoueur)|| !"diagonalemontante".equals(Coupjoueur)|| !"diagonaledescendante".equals(Coupjoueur)){
           System.out.println("Coup souhaité incorrect, réessayez:");
           Coupjoueur = sc.nextLine();
          
        } 
        if ("ligne".equals(Coupjoueur)){
            System.out.println("\n Entrer le numéro de ligne :");
            num = sc.nextInt();
            while(num<0 && num>this.grille.nbLignes-1){
              System.out.println("Numéro de ligne incorrect, réessayez :");
              num=sc.nextInt();
            } 
            this.grille.activerLigneDeCellules(num);
            
          }
          if ("colonne".equals(Coupjoueur)){
            System.out.println("\n Entrer le numéro de colonne :");
            num = sc.nextInt();
            while(num<0 && num>this.grille.nbColonnes-1){
              System.out.println("Numéro de colonne incorrect, réessayez :");
              num=sc.nextInt();
            }  
            this.grille.activerColonneDeCellules(num);
        }
        if ("diagonalemontante".equals(Coupjoueur)){
            System.out.println("\n Entrer le numéro de colonne :");
            num = sc.nextInt();
            while(num<0 && num>a-1){
              System.out.println("Numéro de colonne incorrect, réessayez :");
              num=sc.nextInt();
            }  
            this.grille.activerDiagonaleMontante();
          }
          if ("diagonaledescendante".equals(Coupjoueur)){
            System.out.println("\n Entrer le numéro de colonne :");
            num = sc.nextInt();
            while(num<0 && num>a-1){
              System.out.println("Numéro de colonne incorrect, réessayez :");
              num=sc.nextInt();
            }  
            this.grille.activerDiagonaleDescendante();
          }
    }
    
}
