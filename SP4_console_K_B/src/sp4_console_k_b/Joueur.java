/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_k_b;
package Jeton.java;

/**
 *
 * @author mario
 */

public class Joueur {
    
    String Nom;
    String Couleur;
    Jeton Liste_Jetons[ ] = new Jeton[21]; //creation d'un tableau du type Jeton contenant 21 jetons
    int nombreDesintegrateurs;
    int nombreJetonsRestants = 21; //initialement 21 jetons, évolue au cours de la partie (taille effective Liste_Jetons)
    Jeton piece;
    
    //constructeur initialisant le nom du joueur avec son paramètre
    public Joueur(String name){
        System.out.println("Initialisation du nom du joueur. ");
        Nom = name;
    }
    
    //affecte la couleur en paramètre au joueur
    public void affecterCouleur(String Color){
        System.out.println("Affectation de la couleur au joueur. ");
        Couleur = Color;
    }
    
    //ajoute le jeton passé en paramètre à la liste des jetons
    public boolean ajouterJeton(Jeton unJeton){
        Liste_Jetons[nombreJetonsRestants++] = unJeton; //ajoute d'un jeton à la Liste_Jetons
        System.out.println("Un jeton a été ajouté à la Liste de Jetons. ");
        return false;
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
