/*
 *18/11/2020
 *Corentin LE GOFF && Marc-Andréas DEHAIS
 */
package superpuissance4_modegraphique;

/**
 * modifié par @author cocol
 * @author bdarties
 */
public class Jeton {
    String Couleur;
    
    Jeton(String coul){
        Couleur = coul;
    }
    
    // ajout d'un commentaire
    String lireCouleur(){
        return Couleur;
    }
    
    // notez le vert
    @Override
    public String toString(){
        if("Rouge".equals(Couleur))
            return "\u001B[31m O ";
        return "\u001B[33m O ";
    }
}
