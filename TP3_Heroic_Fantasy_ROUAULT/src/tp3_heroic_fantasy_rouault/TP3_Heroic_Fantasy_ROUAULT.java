/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_rouault;

import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Gaspard Rouault Gaspard Rouault, TDB, Heroic Fantasy, Octobre 2023
 */
public class TP3_Heroic_Fantasy_ROUAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Epee epee1 = new Epee(5, "Excalibur", 7);
        Epee epee2 = new Epee(7, "Durandal", 4);
        Baton baton1 = new Baton(5, "Chene", 4);
        Baton baton2 = new Baton(6, "Charme", 5);
        
        ArrayList<Arme> tabarme = new ArrayList();
        tabarme.add(epee1);
        tabarme.add(epee2);
        tabarme.add(baton1);
        tabarme.add(baton2);

        for (int i = 0; i < tabarme.size(); i++) {
            Arme arme = tabarme.get(i);
            System.out.println(arme);
        }

        Magicien magicien1 = new Magicien("Gandalf", 65, true);
        Magicien magicien2 = new Magicien("Garcimore", 44, false);
        Guerrier guerrier1 = new Guerrier("Conan", 78, false);
        Guerrier guerrier2 = new Guerrier("Lannister", 45, true);

        ArrayList<Personnage> tabperso = new ArrayList();
        tabperso.add(magicien1);
        tabperso.add(magicien2);
        tabperso.add(guerrier1);
        tabperso.add(guerrier2);

        for (int i = 0; i < tabperso.size(); i++) {
            Personnage personnage = tabperso.get(i);
            System.out.println(personnage);
        }

        /* Magicien magicien3 = new Magicien("Jean", 87, true);
        Guerrier guerrier3 = new Guerrier("Arthur", 1, false);
        Epee epee3 = new Epee(9, "metal", 10);
        Epee epee4 = new Epee(7, "Fer", 9);
        Epee epee5 = new Epee(7, "Acier", 1);
        Baton baton3 = new Baton(5, "Boulot", 9);
        Baton baton4 = new Baton(7, "Brindille", 5);
        Baton baton5 = new Baton(1, "Arbuste", 8);

        magicien3.ajoutarme(epee3);
        magicien3.ajoutarme(baton4);
        magicien3.ajoutarme(baton3);

        guerrier3.ajoutarme(epee5);
        guerrier3.ajoutarme(epee4);
        guerrier3.ajoutarme(baton5);
        guerrier3.equipeArme(epee4);

        int compteur = 0;
        for (int i = 0; i < magicien3.getArmepossedees().size(); i++) {
            if (magicien3.getArmepossedees().get(i) instanceof Baton == true) {
                compteur += 1;
            }
        }
        System.out.println("Le magicien a " + compteur + " armes preferees");

        System.out.println(guerrier3.toString());
        System.out.println(magicien3.toString());

        System.out.println("Le nombre total de personnages est : " + Personnage.getNombrePerso());
        System.out.println("Le nombre total de Guerrier est : " + Guerrier.getNombreGuerriers());
        System.out.println("Le nombre total de Magicien est : " + Magicien.getNombreMagiciens());

        
        Magicien magicien4 = new Magicien("Zinedine", 90, true);
        Guerrier guerrier4 = new Guerrier("Platini", 51, true);
        System.out.println(guerrier4.toString());
        System.out.println(magicien4.toString());
        System.out.println("Le nombre total de personnages est : " + Personnage.getNombrePerso());
        System.out.println("Le nombre total de Guerrier est : " + Guerrier.getNombreGuerriers());
        System.out.println("Le nombre total de Magicien est : " + Magicien.getNombreMagiciens());
        
        guerrier4.seFatiguer();
        System.out.println(guerrier4.toString());
        
        guerrier4.estVivant();
        if (guerrier4.estVivant()==true){
            System.out.println("Votre personnage est toujours vivant");
        } else {
            System.out.println("Votre personnage est MORT");
        }
        
        magicien4.estAttaqué(30, magicien4);
        System.out.println(guerrier4.toString());
        System.out.println(magicien4.toString());
        */
        
        Epee epee3 = new Epee(5, "Excalibur", 7);
        Epee epee4 = new Epee(7, "Durandal", 4);
        Baton baton3 = new Baton(5, "Chene", 4);
        Baton baton4 = new Baton(6, "Charme", 5);
        
        Magicien magicien5 = new Magicien("Dernier Magicien", 90, false);
        Guerrier guerrier5 = new Guerrier("Dernier guerrier", 51, true);
        
        guerrier5.ajoutarme(epee3);
        guerrier5.ajoutarme(baton4);
        magicien5.ajoutarme(baton3);
        magicien5.ajoutarme(epee4);
        
        magicien5.equipeArme(baton3);
        guerrier5.equipeArme(epee3);
        
        magicien5.Attaquer(magicien5, guerrier5, baton3);
        System.out.println(guerrier5.toString());
        System.out.println(magicien5.toString()); 
        
        guerrier5.Attaquer(guerrier5, magicien5, epee3);
        System.out.println(guerrier5.toString());
        System.out.println(magicien5.toString()); 
        
        guerrier5.estVivant();
        if (guerrier5.estVivant()==true){
            System.out.println("Votre personnage est toujours vivant");
        } else {
            System.out.println("Votre personnage est MORT");
        }
        
        magicien5.estVivant();
        if (magicien5.estVivant()==true){
            System.out.println("Votre personnage est toujours vivant");
        } else {
            System.out.println("Votre personnage est MORT");
        }


    }

}
