/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance4_modegraphique;

import java.util.Random;
import java.util.Scanner;

/**
 * Je tiens à préciser que cette fenètre est issue d'un copier-coller de notre
 * fenêtre graphique de notre propre code. Ayant recommencer avec le code du
 * professeur Benoit Darties, j'ai tenté un copier-coller de Design vers Design
 * qui à fonctionné. Seulement, l'odre de copie des btn n'est pas croissant, ce
 * qui faitqu'ils sont à des positions différentes de la vidéo dans Source.
 *
 * @author cocol
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    Joueur Listejoueurs[] = new Joueur[2];
    Joueur JoueurCourant;
    Grille grilleDeJeu = new Grille();

    public fenetreDeJeu() {
        initComponents();
        panneau_infos_joueur.setVisible(false);
        panneau_infos_partie.setVisible(false);

        Partie une_partie = new Partie();

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleDeJeu.Cellules[i][j]);

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        }
                        if (c.jetonCourant.Couleur.equals(JoueurCourant.Couleur)) {
                            textemessage.setText("le joueur " + JoueurCourant.Nom + " récupère un de ses jetons");
                            return;
                        }
                        else {
                            textemessage.setText("le joueur " + JoueurCourant.Nom + " veut désintégrer un jeton");                            
                        }
                       // textemessage.setText("un bouton a été cliqué"); //part6 10min comme un décalage des messages
                    }
                });//part6 6min pas message affiché

                panneau_grille.add(cellGraph);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JTextField();
        nom_joueur1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_infos_joueur = new javax.swing.JPanel();
        lbl_j1_nbdesint = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_j2_nbdesint = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        panneau_infos_partie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        textemessage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 630, 540));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        panneau_creation_partie.setBackground(new java.awt.Color(153, 255, 153));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 : ");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 30));

        jLabel2.setText("Nom Joueur 1 : ");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 30));
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, 30));

        nom_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur1ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 130, 30));

        btn_start.setText("Démarer la partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 290, 150));

        panneau_infos_joueur.setBackground(new java.awt.Color(153, 255, 153));
        panneau_infos_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_j1_nbdesint.setText("désintégrateursjoueur1 : ");
        panneau_infos_joueur.add(lbl_j1_nbdesint, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        lbl_j1_nom.setText("nomjoueur 1 : ");
        panneau_infos_joueur.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        lbl_j1_couleur.setText("couleurjoueur1 : ");
        panneau_infos_joueur.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel7.setText("joueur 1 : ");
        panneau_infos_joueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel8.setText("couleur : ");
        panneau_infos_joueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel9.setText("désintégrateurs : ");
        panneau_infos_joueur.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        panneau_infos_joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 270, 10));

        lbl_j2_nbdesint.setText("désintégrateursjoueur2 : ");
        panneau_infos_joueur.add(lbl_j2_nbdesint, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        lbl_j2_couleur.setText("couleurjoueur2 : ");
        panneau_infos_joueur.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel11.setText("couleur : ");
        panneau_infos_joueur.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel12.setText("désintégrateurs : ");
        panneau_infos_joueur.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Infos Joueur");
        panneau_infos_joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel13.setText("joueur 2 : ");
        panneau_infos_joueur.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lbl_j2_nom.setText("nomjoueur 2 : ");
        panneau_infos_joueur.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        getContentPane().add(panneau_infos_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 290, 200));

        panneau_infos_partie.setBackground(new java.awt.Color(153, 255, 153));
        panneau_infos_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Infos Joueur");
        panneau_infos_partie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel10.setText("joueur courant : ");
        panneau_infos_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lbl_jcourant.setText("nomjoueur courant : ");
        panneau_infos_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        textemessage.setColumns(20);
        textemessage.setRows(5);
        message.setViewportView(textemessage);

        panneau_infos_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        getContentPane().add(panneau_infos_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 290, 170));

        setBounds(0, 0, 1096, 839);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        jouerDansColonne(0);
        if (grilleDeJeu.colonne_remplie(0) == true) {
            btn_col_0.setEnabled(false);
        } //attention les crochets
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        jouerDansColonne(2);
        if (grilleDeJeu.colonne_remplie(2) == true) {
            btn_col_2.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        jouerDansColonne(4);
        if (grilleDeJeu.colonne_remplie(4) == true) {
            btn_col_4.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void nom_joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur1ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_infos_joueur.setVisible(true);
        panneau_infos_partie.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false); //EMPECHE DE FAIRE PLUSIEURS TESTS
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        jouerDansColonne(1);
        if (grilleDeJeu.colonne_remplie(1) == true) {
            btn_col_1.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        jouerDansColonne(3);
        if (grilleDeJeu.colonne_remplie(3) == true) {
            btn_col_3.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        jouerDansColonne(5);
        if (grilleDeJeu.colonne_remplie(5) == true) {
            btn_col_5.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        jouerDansColonne(6);
        if (grilleDeJeu.colonne_remplie(6) == true) {
            btn_col_6.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed

    public boolean jouerDansColonne(int indice_colonne) {
        boolean resultatAction;
        resultatAction = grilleDeJeu.ajouterJetonDansColonne(JoueurCourant, indice_colonne);
        panneau_grille.repaint();

        lbl_j1_nbdesint.setText(Listejoueurs[0].nombreDesintegrateurs + "");
        lbl_j2_nbdesint.setText(Listejoueurs[1].nombreDesintegrateurs + "");

        boolean vict_j1 = grilleDeJeu.etreGagnantePourJoueur(Listejoueurs[0]);
        boolean vict_j2 = grilleDeJeu.etreGagnantePourJoueur(Listejoueurs[1]);

        if (vict_j1 && !vict_j2) {
            textemessage.setText("Victoire de " + Listejoueurs[0].Nom);
        }
        if (vict_j2 && !vict_j1) {
            textemessage.setText("Victoire de " + Listejoueurs[1].Nom);
        }

        if (vict_j1 && vict_j2) {
            if (JoueurCourant == Listejoueurs[0]) {
                textemessage.setText("Victoire de " + Listejoueurs[1].Nom + " par faute de l'autre joueur");
            } else {
                textemessage.setText("Victoire de " + Listejoueurs[0].Nom + " par faute de l'autre joueur");
            }
        }

        if (resultatAction == true) {
            return true;
        } else {
            return false;
        }
    }

    public void joueurSuivant() {
        if (JoueurCourant == Listejoueurs[0]) {
            JoueurCourant = Listejoueurs[1];
        } else {
            JoueurCourant = Listejoueurs[0];
        }//pas de crochets !!
        lbl_jcourant.setText(JoueurCourant.Nom);

    }

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    void initialiserPartie() {
        //Mise en place de la grille
        grilleDeJeu.viderGrille();

        //Création des joueurs
        String nomJoueur1 = nom_joueur1.getText();
        Joueur J1 = new Joueur(nomJoueur1);
        String nomJoueur2 = nom_joueur2.getText();
        Joueur J2 = new Joueur(nomJoueur2);

        Listejoueurs[0] = J1;
        Listejoueurs[1] = J2;

        attribuerCouleursAuxJoueurs();

        System.out.println(J1.Nom + " est de couleur " + J1.Couleur);
        System.out.println(J2.Nom + " est de couleur " + J2.Couleur);

        lbl_j1_nom.setText(nomJoueur1);
        lbl_j2_nom.setText(nomJoueur2);
        lbl_j1_couleur.setText(J1.Couleur);
        lbl_j2_couleur.setText(J2.Couleur);
        lbl_j1_nbdesint.setText(J1.nombreDesintegrateurs + ""); //entier + chaine de charatere = chaine de charatere
        lbl_j2_nbdesint.setText(J2.nombreDesintegrateurs + "");

        // On donne des jetons aux joueurs
        for (int i = 0; i < 21; i++) {

            /*Jeton J = new Jeton(Listejoueurs[0].Couleur);
            J1.ajouterJeton(J);
            J2.ajouterJeton(new Jeton(J2.Couleur));*/
            J1.ajouterJeton(new Jeton(J1.Couleur));
            J2.ajouterJeton(new Jeton(J2.Couleur));
        }

        // Determine qui est le premier joueur
        Random r = new Random();
        boolean le_premier = r.nextBoolean();
        if (le_premier) {
            JoueurCourant = Listejoueurs[0];
        } else {
            JoueurCourant = Listejoueurs[1];
        }

        lbl_jcourant.setText(JoueurCourant.Nom);

        // Génération des 5 trous noirs et de 2 désintégrateurs sur les trou noirs
        int compteur = 0;
        for (float i = 0; i < 5; i++) {
            int ligne_trou_noir = r.nextInt(6);
            int colonne_trou_noir = r.nextInt(7);
            if (compteur < 2) {
                if (!grilleDeJeu.placerDesintegrateur(ligne_trou_noir, colonne_trou_noir)) {
                    compteur--;
                }
                compteur = compteur + 1;
            }
            if (!grilleDeJeu.placerTrouNoir(ligne_trou_noir, colonne_trou_noir)) {
                i--;
            }
        }

        // On place les trois derniers désintégrateurs
        for (int i = 0; i < 3; i++) {
            int ligne_désin = r.nextInt(6);
            int colonne_désin = r.nextInt(7);
            if (!grilleDeJeu.placerDesintegrateur(ligne_désin, colonne_désin) || grilleDeJeu.Cellules[ligne_désin][colonne_désin].presenceTrouNoir()) {
                i--;
            }
        }
    }

    void attribuerCouleursAuxJoueurs() {
        Random r = new Random();
        boolean couleur;
        couleur = r.nextBoolean();
        if (couleur) {
            Listejoueurs[0].Couleur = "Rouge";
            Listejoueurs[1].Couleur = "Jaune";
        } else {
            Listejoueurs[0].Couleur = "Jaune";
            Listejoueurs[1].Couleur = "Rouge";
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_nbdesint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_nbdesint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_infos_joueur;
    private javax.swing.JPanel panneau_infos_partie;
    private javax.swing.JTextArea textemessage;
    // End of variables declaration//GEN-END:variables
}
