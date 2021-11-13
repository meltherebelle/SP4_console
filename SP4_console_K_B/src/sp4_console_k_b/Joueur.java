/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_k_b;
package

/**
 *
 * @author mario
 */

public class Joueur {
    
    String Nom;
    String Couleur;
    int Liste_Jetons[ ] = new int[21]; //creation d'un tableau du type Jeton contenant 21 jetons
    int nombreDesintegrateurs;
    int nombreJetonsRestants = 21; //initialement 21 jetons, évolue au cours de la partie
    Jeton piece;
    
    //constructeur initialisant le nom du joueur avec son paramètre
    public Joueur(String name){
        Nom = name;
        //nombreDesintegrateurs = 0;
        //nombreJetonsRestants = 0;
    }
    
    //affecte la couleur en paramètre au joueur
    public void affecterCouleur(String Color){
        Couleur = Color;
    }
    
// COMPLETER CETTE MÉTHODE //
    //ajoute le jeton passé en paramètre à la liste des jetons
    public boolean ajouterJeton(Jeton){
        //Liste_Jetons[nombreJetonsRestants++] = unJeton;
    }
    
    //incrémente le nombre de désintégrateurs du joueur
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs += 1;
    }
    
    //décrémente le nombre de désintégrateurs et confirme l’utilisation de ce dernier,
    //ou renvoie faux s’il ne restait plus de désintégrateurs.
    public boolean utiliserDesintegrateur(){
        //vérifie que le joueur possède au moins un désintégrateur
        if (nombreDesintegrateurs > 0) {
            nombreDesintegrateurs -= 1; //retire un désintégrateur
            System.out.println("Désintégrateur utilisé. "); //mess confirmation utilisation désintégrateur
            return true;
            }
        else {
            System.out.println("Vous ne possédez plus de désintégrateur. ");
            return false;
            }
        }
        
    }
}
