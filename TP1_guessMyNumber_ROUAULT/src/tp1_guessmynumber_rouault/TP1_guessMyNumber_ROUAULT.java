/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_rouault;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gaspard Rouault ROUAULT, TDB, Convertisseur, Octobre 2023
 */
public class TP1_guessMyNumber_ROUAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel niveau de difficulté souhaitez-vous ?(Facile,Moyen Difficile)");
        String choix = sc.nextString();
        if choix == "Facile" {

            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(25);

            System.out.println("Saisissez un nombre entre 0 et 25 : ");
            int nombre = sc.nextInt();
            int nbtentative = 1;
            while (nombre != n) {

                System.out.println("La valeur n'est pas celle recherchée");

                if (nombre < n) {
                    System.out.println("Trop petit");
                    System.out.println("Saisissez un autre nombre entre 0 et 25 : ");
                    nombre = sc.nextInt();
                    nbtentative += 1;
                }
                if (nombre > n) {
                    System.out.println("Trop grand");
                    System.out.println("Saisissez un autre nombre entre 0 et 25 : ");
                    nombre = sc.nextInt();
                    nbtentative += 1;
                }
                if (nombre == n) {
                    System.out.println("gagné");

                    System.out.println("Votre nombre de tentative est de " + nbtentative);
                }
            }
        }
        if choix=="Moyen"{
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(50);

            System.out.println("Saisissez un nombre entre 0 et 50 : ");
            int nombre = sc.nextInt();
            int nbtentative = 1;
            while (nombre != n) {

                System.out.println("La valeur n'est pas celle recherchée");

                if (nombre < n) {
                    System.out.println("Trop petit");
                    System.out.println("Saisissez un autre nombre entre 0 et 50 : ");
                    nombre = sc.nextInt();
                    nbtentative += 1;
                }
                if (nombre > n) {
                    System.out.println("Trop grand");
                    System.out.println("Saisissez un autre nombre entre 0 et 50 : ");
                    nombre = sc.nextInt();
                    nbtentative += 1;
                }
                if (nombre == n) {
                    System.out.println("gagné");

                    System.out.println("Votre nombre de tentative est de " + nbtentative);
                }
            }
        }

    }

}
