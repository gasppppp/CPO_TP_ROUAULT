package lightoff_rouault_version_console;

import java.awt.GridLayout;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Gaspard Rouault
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilledeJeu grille;
    int nbCoups, nbCoupsMax;

    boolean mode1 = false;
    boolean mode2 = false;

    public void GrilleVisible(boolean etat) {
        PanneauGrille.setVisible(etat);
        btnLigne0.setVisible(etat);
        btnLigne1.setVisible(etat);
        btnLigne2.setVisible(etat);
        btnLigne3.setVisible(etat);
        btnLigne4.setVisible(etat);
        btnLigne5.setVisible(etat);
        btnLigne6.setVisible(etat);
        btnColonne0.setVisible(etat);
        btnColonne1.setVisible(etat);
        btnColonne2.setVisible(etat);
        btnColonne3.setVisible(etat);
        btnColonne4.setVisible(etat);
        btnColonne5.setVisible(etat);
        btnColonne6.setVisible(etat);
        btnDiagonaleM.setVisible(etat);
        btnDiagonaleD.setVisible(etat);
        lbl_coups_restants.setVisible(etat);
    }

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {

        initComponents();
        int nbLignes = 7;
        int nbColonnes = 7;
        this.grille = new GrilledeJeu(nbLignes, nbColonnes);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36); // création d'un bouton
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        this.initialiserPartie();
        GrilleVisible(false);

    }

    public void CliquerMode(int type, int indice) {

        if (type == 3) {

            if (indice == 1) {
                nbCoupsMax = 10;
                modebtn2.setVisible(false);
                modebtn1.setVisible(false);
                mode1 = true;

            }
            if (indice == 2) {
                nbCoupsMax = 5;
                modebtn1.setVisible(false);
                modebtn2.setVisible(false);
                mode2 = true;

            }
            GrilleVisible(true);
            lbl_coups_restants.setText("Coups restants : " + nbCoupsMax);
        }
    }

    public void CliquerBoutton(int type, int indice) {
        nbCoups++;

        if (mode1 == true) {
            if (nbCoups > nbCoupsMax) {
                jLabel1.setText("Vous avez perdu ! Vous avez dépassé votre nombre de coups maximum possible en mode facile");
                btnLigne0.setVisible(false);
                btnLigne1.setVisible(false);
                btnLigne2.setVisible(false);
                btnLigne3.setVisible(false);
                btnLigne4.setVisible(false);
                btnLigne5.setVisible(false);
                btnLigne6.setVisible(false);
                btnColonne0.setVisible(false);
                btnColonne1.setVisible(false);
                btnColonne2.setVisible(false);
                btnColonne3.setVisible(false);
                btnColonne4.setVisible(false);
                btnColonne5.setVisible(false);
                btnColonne6.setVisible(false);
                btnDiagonaleM.setVisible(false);
                btnDiagonaleD.setVisible(false);
                lbl_coups_restants.setVisible(false);

            }
        }

        if (mode2 == true) {
            if (nbCoups > nbCoupsMax) {
                jLabel1.setText("Vous avez perdu ! Vous avez dépassé votre nombre de coups maximum possible en mode difficile");
                btnLigne0.setVisible(false);
                btnLigne1.setVisible(false);
                btnLigne2.setVisible(false);
                btnLigne3.setVisible(false);
                btnLigne4.setVisible(false);
                btnLigne5.setVisible(false);
                btnLigne6.setVisible(false);
                btnColonne0.setVisible(false);
                btnColonne1.setVisible(false);
                btnColonne2.setVisible(false);
                btnColonne3.setVisible(false);
                btnColonne4.setVisible(false);
                btnColonne5.setVisible(false);
                btnColonne6.setVisible(false);
                btnDiagonaleM.setVisible(false);
                btnDiagonaleD.setVisible(false);
                lbl_coups_restants.setVisible(false);

            }
        }
        if (type == 0) {
            this.grille.activerLigneDeCellules(indice);
            repaint();
            nbCoups++;

        }

        if (type == 1) {
            this.grille.activerColonneDeCellules(indice);
            repaint();

        }

        if (type == 2) {
            if (indice == 0) {
                this.grille.activerDiagonaleDescendante();
                repaint();

            }
            if (indice == 1) {
                this.grille.activerDiagonaleMontante();
                repaint();

            }
        }
        if (grille.cellulesToutesEteintes() == true) {
            jLabel1.setText("La grille est éteinte vous avez gagné !");
            btnLigne0.setVisible(false);
            btnLigne1.setVisible(false);
            btnLigne2.setVisible(false);
            btnLigne3.setVisible(false);
            btnLigne4.setVisible(false);
            btnLigne5.setVisible(false);
            btnLigne6.setVisible(false);
            btnColonne0.setVisible(false);
            btnColonne1.setVisible(false);
            btnColonne2.setVisible(false);
            btnColonne3.setVisible(false);
            btnColonne4.setVisible(false);
            btnColonne5.setVisible(false);
            btnColonne6.setVisible(false);
            btnDiagonaleM.setVisible(false);
            btnDiagonaleD.setVisible(false);
            lbl_coups_restants.setVisible(false);
        }
        int nbCoupsRestants = nbCoupsMax - nbCoups;
        lbl_coups_restants.setText("Coups restants : " + nbCoupsRestants);
    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        btnLigne0 = new javax.swing.JButton();
        btnLigne1 = new javax.swing.JButton();
        btnLigne2 = new javax.swing.JButton();
        btnLigne3 = new javax.swing.JButton();
        btnLigne4 = new javax.swing.JButton();
        btnLigne5 = new javax.swing.JButton();
        btnLigne6 = new javax.swing.JButton();
        btnColonne0 = new javax.swing.JButton();
        btnColonne1 = new javax.swing.JButton();
        btnColonne2 = new javax.swing.JButton();
        btnColonne3 = new javax.swing.JButton();
        btnColonne4 = new javax.swing.JButton();
        btnColonne5 = new javax.swing.JButton();
        btnColonne6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDiagonaleM = new javax.swing.JButton();
        btnDiagonaleD = new javax.swing.JButton();
        modebtn1 = new javax.swing.JRadioButton();
        modebtn2 = new javax.swing.JRadioButton();
        lbl_coups_restants = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 420, 420));

        btnLigne0.setText("L0");
        btnLigne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 50, 50));

        btnLigne1.setText("L1");
        btnLigne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 50, 50));

        btnLigne2.setText("L2");
        btnLigne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 50, 50));

        btnLigne3.setText("L3");
        btnLigne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 50, 50));

        btnLigne4.setText("L4");
        btnLigne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 50, 50));

        btnLigne5.setText("L5");
        btnLigne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 50, 50));

        btnLigne6.setText("L6");
        btnLigne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 50, 50));

        btnColonne0.setText("C0");
        btnColonne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btnColonne1.setText("C1");
        btnColonne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 50, 50));

        btnColonne2.setText("C2");
        btnColonne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 50, 50));

        btnColonne3.setText("C3");
        btnColonne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 50, 50));

        btnColonne4.setText("C4");
        btnColonne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 50, 50));

        btnColonne5.setText("C5");
        btnColonne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 50, 50));

        btnColonne6.setText("C6");
        btnColonne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 50, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 520, 230));

        btnDiagonaleM.setText("DiagonaleD");
        btnDiagonaleM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagonaleMActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagonaleM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        btnDiagonaleD.setText("DiagonaleM");
        btnDiagonaleD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagonaleDActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagonaleD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 100, 70));

        modebtn1.setText("Mode facile (10 coups max)");
        modebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modebtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(modebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        modebtn2.setText("Mode difficile (5 coups max)");
        modebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modebtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(modebtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        lbl_coups_restants.setText("Coups restants");
        getContentPane().add(lbl_coups_restants, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 190, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne0ActionPerformed
        this.CliquerBoutton(0, 0);
    }//GEN-LAST:event_btnLigne0ActionPerformed

    private void btnLigne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne3ActionPerformed
        this.CliquerBoutton(0, 3);
    }//GEN-LAST:event_btnLigne3ActionPerformed

    private void btnColonne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne0ActionPerformed
        this.CliquerBoutton(1, 0);
    }//GEN-LAST:event_btnColonne0ActionPerformed

    private void btnLigne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne4ActionPerformed
        this.CliquerBoutton(0, 4);
    }//GEN-LAST:event_btnLigne4ActionPerformed

    private void btnLigne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne1ActionPerformed
        this.CliquerBoutton(0, 1);
    }//GEN-LAST:event_btnLigne1ActionPerformed

    private void btnLigne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne2ActionPerformed
        this.CliquerBoutton(0, 2);
    }//GEN-LAST:event_btnLigne2ActionPerformed

    private void btnLigne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne5ActionPerformed
        this.CliquerBoutton(0, 5);
    }//GEN-LAST:event_btnLigne5ActionPerformed

    private void btnLigne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne6ActionPerformed
        this.CliquerBoutton(0, 6);
    }//GEN-LAST:event_btnLigne6ActionPerformed

    private void btnColonne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne1ActionPerformed
        this.CliquerBoutton(1, 1);// TODO add your handling code here:
    }//GEN-LAST:event_btnColonne1ActionPerformed

    private void btnColonne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne2ActionPerformed
        this.CliquerBoutton(1, 2);// TODO add your handling code here:
    }//GEN-LAST:event_btnColonne2ActionPerformed

    private void btnColonne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne3ActionPerformed
        this.CliquerBoutton(1, 3);// TODO add your handling code here:
    }//GEN-LAST:event_btnColonne3ActionPerformed

    private void btnColonne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne5ActionPerformed
        this.CliquerBoutton(1, 5);// TODO add your handling code here:
    }//GEN-LAST:event_btnColonne5ActionPerformed

    private void btnColonne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne4ActionPerformed
        this.CliquerBoutton(1, 4);// TODO add your handling code here:
    }//GEN-LAST:event_btnColonne4ActionPerformed

    private void btnColonne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne6ActionPerformed
        this.CliquerBoutton(1, 6);// TODO add your handling code here:
    }//GEN-LAST:event_btnColonne6ActionPerformed

    private void btnDiagonaleMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagonaleMActionPerformed

        this.CliquerBoutton(2, 0);// TODO add your handling code here:
    }//GEN-LAST:event_btnDiagonaleMActionPerformed

    private void btnDiagonaleDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagonaleDActionPerformed
        this.CliquerBoutton(2, 1);// TODO add your handling code here:
    }//GEN-LAST:event_btnDiagonaleDActionPerformed

    private void modebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modebtn1ActionPerformed
        this.CliquerMode(3, 1);
        // TODO add your handling code here:
    }//GEN-LAST:event_modebtn1ActionPerformed

    private void modebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modebtn2ActionPerformed
        this.CliquerMode(3, 2);
        // TODO add your handling code here:
    }//GEN-LAST:event_modebtn2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnColonne0;
    private javax.swing.JButton btnColonne1;
    private javax.swing.JButton btnColonne2;
    private javax.swing.JButton btnColonne3;
    private javax.swing.JButton btnColonne4;
    private javax.swing.JButton btnColonne5;
    private javax.swing.JButton btnColonne6;
    private javax.swing.JButton btnDiagonaleD;
    private javax.swing.JButton btnDiagonaleM;
    private javax.swing.JButton btnLigne0;
    private javax.swing.JButton btnLigne1;
    private javax.swing.JButton btnLigne2;
    private javax.swing.JButton btnLigne3;
    private javax.swing.JButton btnLigne4;
    private javax.swing.JButton btnLigne5;
    private javax.swing.JButton btnLigne6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_coups_restants;
    private javax.swing.JRadioButton modebtn1;
    private javax.swing.JRadioButton modebtn2;
    // End of variables declaration//GEN-END:variables
}
