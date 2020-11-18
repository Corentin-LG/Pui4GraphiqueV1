/*
 *18/11/2020
 *Corentin LE GOFF && Marc-Andréas DEHAIS
 */
package superpuissance4_modegraphique;

/**
 * modifié par @author cocol
 * @author bdarties
 */
public class Joueur {
    
    
    
    String Nom;
    String Couleur;
    Jeton ListeJetons[] = new Jeton [21];
    int nombreDesintegrateurs;
    int nombreJetonsRestant;
    
    Joueur(String nom_joueur){
        Nom = nom_joueur;
        nombreDesintegrateurs = 0;
        nombreJetonsRestant = 0;
    } 
    
    void affecterCouleur(String coul){
        Couleur = coul;
    }
    
    void ajouterJeton(Jeton un_jeton){
        ListeJetons[nombreJetonsRestant++] = un_jeton;
    }
    
    Jeton retirerJeton(){
        nombreJetonsRestant = nombreJetonsRestant-1;
        return ListeJetons[nombreJetonsRestant];
    }
    
    void obtenirDesintegrateur(){
        nombreDesintegrateurs += 1;
    }
    
    boolean utiliserDesintegrateur(){
        if(nombreDesintegrateurs==0){
            return false;
        }
        nombreDesintegrateurs--;
        return true;
    }
    
    
}
