/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author nicol
 */
public class CaseGrilleGraphique extends JButton {
    
    CaseGrille caseGrilleAssociee;
    Pions pion;
    
    
    /*public String quiOccupeLaCase() {
        
    }//*/

    public CaseGrilleGraphique(CaseGrille caseGrilleAssociee) {
        this.caseGrilleAssociee = caseGrilleAssociee;
    }
    
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int longueur = this.getWidth();
        int hauteur = this.getHeight();
        if (caseGrilleAssociee.estOccupee() == false) {
            g.setColor(Color.gray);
        } else {
            if (pion.couleur == "R") {
                if (pion.eleve == true) {
                    g.setColor(Color.red);
                }
            }
            g.setColor(Color.yellow);
        }
        g.fillOval(2, 2, longueur - 4, hauteur - 4);
    } 
    
    
}
