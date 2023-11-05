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
    int nbCoups = 0;
    int a;

    /**
     * Ce constructeur permet d'initialiser le nombre de coups et la grille de
     * jeu
     *
     * @param grille
     * @param nbCoups
     */
    public Partie(int dimensions) {
        this.grille = new GrilledeJeu(dimensions, dimensions);
        this.nbCoups = 5;
    }

    /**
     * Cette méthode permet d'initialiser la partie en mélangeant la grille
     */
    public void initialiserPartie() {
        this.grille.melangerMatriceAleatoirement(10);
    }

    /**
     * Cette méthode permet d'afficher la bienvenue au joueur
     */
    public void afficherBienvenue() {
        String[] bienvenue = {
            "BBBBB   III   EEEEE  N   N   V   V   EEEEE   N   N   U    U   EEEEE   !",
            "B   B    I    E      NN  N   V   V   E       NN  N   U    U   E       !",
            "BBBBB    I    EEEE   N N N   V   V   EEEE    N N N   U    U   EEEE    !",
            "B   B    I    E      N  NN    V V    E       N  NN   U    U   E       !",
            "BBBBB   III   EEEEE  N   N     V     EEEEE   N   N   UUUUUU   EEEEE   !",
            "\nLa partie est lancee ! Ton but sera d'eteindre toute les cellules en faisant le moins de coups possibles !"
            + "\nIl y'a deux modes que tu pourra choisir : facile ou difficile"
            + "\nMais attention ! Tu ne dois pas depasser 10 COUPS pour tout eteindre en mode facile et 5 COUPS en mode difficile sinon tu as perdu ! \n"
                + "Si tu le souhaites, tu pourra arreter la partie a tout moment en ecrivant : stop. \n"
                + "                                  BONNE CHANCE !"
        };

        for (String line : bienvenue) {
            System.out.println(line);
        }

    }
    
    /**
     * Cette méthode permet d'afficher la bienvenue au joueur
     */
    public void afficherBravo() {
        String[] bravo = {
            "BBBBB   RRRRR       A      V   V   OOOO   !",
            "B   B   R   R      A A     V   V  O    O  !",
            "BBBBB   RRRRR     A   A    V   V  O    O  !",
            "B   B   R R      AAAAAAA    V V   O    O  !",
            "BBBBB   R   R   A       A    V     OOOO   !",
            
        };

        for (String line : bravo) {
            System.out.println(line);
        }

    }
    /**
     * Cette methode permet le lancement d'une partie après l'avoir initialisée
     */
    public void lancerPartie() {
        String Coupjoueur;
        int num;
        int nbCoups = 0;
        String choix;
        Scanner sc = new Scanner(System.in);

        this.afficherBienvenue();
        System.out.println(this.grille.toString());
        
        System.out.println("\nQuel mode veux tu choisir ? (facile ou dificile)");
        choix = sc.nextLine();
        while (this.grille.cellulesToutesEteintes() == false) {
            if ("facile".equals(choix)||"difficile".equals(choix)){
                
            
              if ("facile".equals(choix)&& nbCoups==11){
                System.out.println("Vous avez dépassé le nombre de coups maximum possible, veuillez recommencer");
                break;
              }
            
              if("difficile".equals(choix)&& nbCoups==6){
                System.out.println("Vous avez dépassé le nombre de coups maximum possible, veuillez recommencer");
                break;
              }
            } else{
                System.out.println("Choix de mode incorrect, veuilez reessayer :");
                choix=sc.nextLine();
            }
            
            
            
            
            
            System.out.println("\n Entrer le coups souhaite (colonne/ligne/ diagonalemontante/diagonaledescendante):");
            Coupjoueur = sc.nextLine();
            
            if ("stop".equals(Coupjoueur)||"stop".equals(choix)){
                System.out.println("Vous avez mis fin a la partie, a bientot !");
                break;
            }
            if ("ligne".equals(Coupjoueur)) {
                System.out.println("\n Entrer le numero de ligne :");
                num = sc.nextInt();
                
                while (num < 0 || num > this.grille.nbLignes - 1) {
                    System.out.println("Numero de ligne incorrect, réessayez :");
                    num = sc.nextInt();
                    
                }
                this.grille.activerLigneDeCellules(num);
                nbCoups += 1;
                System.out.println("Votre nombre de coups est de : " + nbCoups);
                System.out.println(this.grille.toString());

            }
            if ("colonne".equals(Coupjoueur)) {
                System.out.println("\n Entrer le numéro de colonne :");
                num = sc.nextInt();
                
                while (num < 0 || num > this.grille.nbColonnes - 1) {
                    System.out.println("Numéro de colonne incorrect, réessayez :");
                    num = sc.nextInt();
                    
                }
                this.grille.activerColonneDeCellules(num);
                nbCoups += 1;
                System.out.println("Votre nombre de coups est de : " + nbCoups);
                System.out.println(this.grille.toString());
            }
            if ("diagonalemontante".equals(Coupjoueur)) {
                
                this.grille.activerDiagonaleMontante();
                nbCoups += 1;
                System.out.println("Votre nombre de coups est de : " + nbCoups);
                System.out.println(this.grille.toString());
            }
            if ("diagonaledescendante".equals(Coupjoueur)) {
                
                this.grille.activerDiagonaleDescendante();
                nbCoups += 1;
                System.out.println("Votre nombre de coups est de : " + nbCoups);
                System.out.println(this.grille.toString());
            }
            
            
        }
        
        if (this.grille.cellulesToutesEteintes() == true) {
            this.afficherBravo();
            System.out.println("Votre nombre de coups effectué pour tout éteindre est de : " + nbCoups);
        }
    }

}
