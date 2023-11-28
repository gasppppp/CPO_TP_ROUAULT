/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_rouault;

/**
 *
 * @author Gaspard Rouault
 *ROUAULT Gaspard, TDB, Octobre 2023
*/public class TP2_manip_ROUAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ; 
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        //2 Tartiflettes ont été crées, assiette 2 et 3 référencent la meme tartiflette
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        assiette2.nbCalories+=1;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories);
        
        Tartiflette inter=new Tartiflette(assiette2.nbCalories);
        assiette2=inter;
        assiette2 =assiette1;
        assiette1=inter;
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        
        //Moussaka assiette666 = assiette1 ;  
        //Moussaka assiette667 = new Tartiflette() ;   Ces deux lignes sont incorrectes
        // Non une référence d'objet ne peux référencer que le type d'objet qu'elle annonce
        Moussaka [] tabMoussaka = new Moussaka[10];
        for (int i=0; i < 10; i++) {
          tabMoussaka[i]=new Moussaka(i);
          System.out.println(tabMoussaka[i].nbCalories);
        }
    }
    
}
