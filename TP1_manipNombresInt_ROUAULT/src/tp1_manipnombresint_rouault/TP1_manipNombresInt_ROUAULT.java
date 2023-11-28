/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_rouault;

import java.util.Scanner;

/**
 *
 * @author Gaspard Rouault
 *Rouault, TDB, manip nombre, Septembre2023
 */
public class TP1_manipNombresInt_ROUAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre entier :");
        int nombre1 = sc.nextInt();
        System.out.println("\n Entrer un nombre entier :");
        int nombre2 = sc.nextInt();
        System.out.println(nombre1);
        System.out.println(nombre2);
        System.out.println("La somme des nombres est "+(nombre1+nombre2));
        System.out.println("La difference des nombres est "+(nombre1-nombre2));
        System.out.println("Le produit des nombres est "+(nombre1*nombre2));
        System.out.println("Le quotient des nombres est "+(nombre1 / nombre2));
        System.out.println("Le reste des nombres est "+(nombre1 % nombre2));
        
        // TODO code application logic here
    }
    
}
