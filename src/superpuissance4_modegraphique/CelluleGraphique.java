/*
 *18/11/2020
 *Corentin LE GOFF && Marc-Andréas DEHAIS
 */
package superpuissance4_modegraphique;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * modifié par @author cocol
 * @author bdarties
 */
public class CelluleGraphique extends JButton{
    Cellule celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/images/Desintegrateur.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/TrouNoir.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/pionjaune.PNG"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/pionrouge.PNG"));
    
    
        public CelluleGraphique (Cellule uneCellule) {
        celluleAssociee = uneCellule;
       
        
    }
       
    
  @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G);
        if (celluleAssociee.presenceTrouNoir() == true) {
            setIcon(img_trouNoir);
        }
        else if (celluleAssociee.presenceDesintegrateur() == true) {
            setIcon(img_desint);
        }
        else {
            String couleur_jeton = celluleAssociee.lireCouleurDuJeton();
            switch (couleur_jeton) {
                case "vide":
                    setIcon(img_vide); // on attribue l'image celluleVide.png
                    break;
                case "Rouge":
                    setIcon(img_jetonRouge);
                    break;
                case "Jaune":
                    setIcon(img_jetonJaune);
                    break;
                    
            }
        }
    }  
    
}
