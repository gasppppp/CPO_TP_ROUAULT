/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_rouault;

import java.util.Scanner;

/**
 *
 * @author Gaspard Rouault
 *Rouault Gaspard, TDB, Octobre 2023
*/public class TP2_convertisseurObjet_ROUAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        
        System.out.println("Bonjour, saisissez une valeur :");
        double Saisie=sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        Convertisseur C1=new Convertisseur();
        int choix = sc.nextInt();
        if (choix ==1) {
            C1.Convertisseur();
            System.out.println(Saisie+ "degré Celcius est égal à "+C1.CelciusVersKelvin(Saisie) + "degré Kelvin");
            C1.toString();
        }
        if (choix==2){
            C1.Convertisseur();
            System.out.println(Saisie+" degré Kelvin est égal à "+C1.KelvinVersCelcius(Saisie)+" degré Celcius");
            C1.toString();
        }
        if (choix==3){
            C1.Convertisseur();
            System.out.println(Saisie+" degré Farenheit est égal à "+C1.FarenheitVersCelcius(Saisie)+ "degré Celcius");
            C1.toString();
        }
        if (choix==4){
            C1.Convertisseur();
            System.out.println(Saisie+ "degré Celcius est égal à "+C1.CelciusVersFarenheit(Saisie) + "degré Farenheit");
            C1.toString();
        }
        if (choix==5){
            C1.Convertisseur();
            System.out.println(Saisie+ "degré Kelvin est égal à "+C1.KelvinVersFarenheit(Saisie) + "degré Farenheit");
            C1.toString();
        }
        if (choix==6){
            C1.Convertisseur();
            System.out.println(Saisie+ "degré Farenheit est égal à "+C1.FarenheitVersKelvin(Saisie) + "degré Kelvin");
            C1.toString();
            
        }
        System.out.println(C1);
        
       
        
    }
    
}
