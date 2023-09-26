/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_rouault;

import java.util.Scanner;

/**
 *
 * @author Gaspard Rouault
 *ROUAULT, TDB, Convertisseur, Septembre 2023
 */
public class TP1_convertisseur_Rouault {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre réel :");
        double nombreCelsius = sc.nextDouble();
        System.out.println(nombreCelsius);
        double nombreKelvin = nombreCelsius + 273.15;
        System.out.println(nombreKelvin);
        System.out.println("Bonjour, saisissez une valeur :");
        double Saisie=sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        int choix = sc.nextInt();
        if (choix ==1) {
            System.out.println(CelciusVersKelvin(Saisie));
        }
        if (choix==2){
            System.out.println(Saisie+" degré Kelvin est égal à "+KelvinVersCelcius(Saisie)+" degré Celcius");
        }
        
            // TODO code application logic here
    }
    public static double CelciusVersKelvin(double tCelcius ) {
       return (tCelcius + 273.15);
    }
    public static double KelvinVersCelcius(double tKelvin ) {
       return (tKelvin - 273.15);
    }
    public static double FarenheitVersCelcius(double tFarenheit ) {
       return (tFarenheit - 32);
    }
    public static double CelciusVersFarenheit(double tCelcius ) {
       return (tCelcius + 32);
    }
    public static double KelvinVersFarenheit(double tKelvin ) {
       return (CelciusVersFarenheit(KelvinVersCelcius(tKelvin)));
    }
    public static double FarenheitVersKelvin(double tFarenheit ) {
       return (CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)));
    }
}
