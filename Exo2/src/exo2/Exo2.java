/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author Gaspard Rouault
 Rouault, TDB, Addition entiers, Septembre 2023
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//Declaration des variables
int nb; // nombre dentiers a additionner
int result; // resultat
int ind; //indice
result=0;
// Addition des nb premiers entiers
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
ind=1;
while (ind <= nb) {
ind=ind+1;
result=result+ind;

}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);
}
        // TODO code application logic here
    }
    

