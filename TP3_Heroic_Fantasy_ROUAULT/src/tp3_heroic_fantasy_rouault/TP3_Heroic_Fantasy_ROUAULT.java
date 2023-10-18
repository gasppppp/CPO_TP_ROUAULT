/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_rouault;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Gaspard Rouault
 *Gaspard Rouault, TDB, Heroic Fantasy, Octobre 2023
*/public class TP3_Heroic_Fantasy_ROUAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1=new Epee(5,"Excalibur",7);
        Epee epee2=new Epee(7,"Durandal",4);
        Baton baton1 = new Baton(5,"Chene",4);
        Baton baton2 = new Baton(6,"Charme",5);
        
        ArrayList<Arme> tab=new ArrayList();
        tab.add(epee1);
        tab.add(epee2);
        tab.add(baton1);
        tab.add(baton2);
        
        for (int i=0;i<tab.size();i++){
            Arme arme=tab.get(i);
            System.out.println( arme);
        }
                
        
    }
    
}
