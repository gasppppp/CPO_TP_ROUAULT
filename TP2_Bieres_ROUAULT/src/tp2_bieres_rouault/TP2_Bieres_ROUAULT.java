/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_rouault;

/**
 *
 * @author Gaspard Rouault
 *Rouault Gaspard,TDB,Octobre 2023
 */
 public class TP2_Bieres_ROUAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0 ,"Dubuisson") ;
        System.out.println(uneBiere) ;
        uneBiere.ouverte=false;
        uneBiere.Decapsuler();
        uneBiere.lireEtiquette();
        
        BouteilleBiere une2Biere = new BouteilleBiere("Leffe",6.6 ,"Abbaye de Leffe") ;
        System.out.println(une2Biere) ;
        une2Biere.lireEtiquette();
        
        BouteilleBiere une3Biere = new BouteilleBiere("Blondasse",5.0 ,"Meyer") ;
        System.out.println(une3Biere) ;
        une3Biere.ouverte=true;
        une3Biere.Decapsuler();
        une3Biere.lireEtiquette();
        
        BouteilleBiere une4Biere = new BouteilleBiere("Brunette",3.0 ,"Nike") ;
        une3Biere.ouverte=true;
        une4Biere.Decapsuler();
        une4Biere.lireEtiquette();
        System.out.println(une4Biere) ;
        

    }
    
}
