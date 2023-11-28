/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Gaspard Rouault Rouault,TDB,Calculette, Septembre 2023
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operator;
        float operande1;
        float operande2;
        System.out.println("Please enter the operator :");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre entier entre 1 et 5:");
        operator = sc.nextInt();
        System.out.println("\n Entrer une valeur :");
        operande1 = sc.nextFloat();
        System.out.println("\n Entrer une valeur :");
        operande2 = sc.nextFloat();
        
        if (operator>=1 & operator<=5){
            if (operator==1){
                System.out.println(operande1+operande2);
            }
            if (operator==2){
                System.out.println(operande1-operande2);
            }   
            if (operator==3){
                System.out.println(operande1*operande2);
            }
            if (operator==4){
                System.out.println(operande1/operande2);
            }
        }
        
        // TODO code application logic here
    }

}
