package sp4_console_k_b;
package Joueur.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leaburriat
 */
public class Partie {
    
    /// Attributs
    //ListeJoueurs : tableau des deux joueurs de la partie
    Joueur [] ListeJoueurs = new Joueur[2] ;
    
    //joueurCourant : désigne le joueur courant à tout moment de la partie
    Joueur joueurCourant = new Joueur;
    
    //grilleJeu : désigne la grille de jeu. C’est sans doute l’objet le plus important de ce projet.
    //Tout y est fait : ajout de jetons, et vérification de la grille
    Grille grilleJeu = new Grille;
    
    
    //Constructeur de Partie
    Partie(Joueur,Joueur) {
        
        // Méthode : crée la grille, crée les jetons et les attribue aux joueurs correspondants
        //Place les trous noirs (version 2) et les téléporteurs (version 3)
        public void initialiserPartie() {
            
        }
        
        // Méthode : lance la partie
        public void debuterPartie() {
            
        }
        
        // Methode : attribue des couleurs aux joueurs
        public void attribuerCouleursAuxJoueurs() {
            
        }
        
    }
    
}


//une partie n’est finalement qu’une grande boucle : à chaque tour un joueur joue, puis l’autre,
//et on recommence ainsi tant qu’il n’y a pas de joueur gagnant ou que la grille n’est pas remplie.