package sp4_console_k_b;
package Joueur.java;
package Jeton.java;
package Grille.java;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leaburriat
 */

import java.util.Scanner;

public class Partie {
    
    //ListeJoueurs : tableau des deux joueurs de la partie
    Joueur [] ListeJoueurs = new Joueur[2];
    
    //joueurCourant : désigne le joueur courant à tout moment de la partie
    Joueur joueurCourant;
    
    //grilleJeu : désigne la grille de jeu. C’est sans doute l’objet le plus important de ce projet.
    //Tout y est fait : ajout de jetons, et vérification de la grille
    Grille grilleJeu = new Grille();
        
    // Méthode : créé la grille, créé les jetons et les attribue aux joueurs correspondants
    //Place les trous noirs (version 2) et les téléporteurs (version 3)
    public void initialiserPartie() {
        grilleJeu.viderGrille(); //creation de la grille
        grilleJeu.afficherGrilleSurConsole(); //affichage grille sur console
        
        //affectation des noms aux joueurs
        Scanner sc = new Scanner(System.in);
        System.out.println("Joueur 1 - Entrez votre nom : ");
        Joueur joueur1 = new Joueur(sc.nextLine());
        System.out.println("Joueur 2 - Entrez votre nom : ");
        Joueur joueur2 = new Joueur(sc.nextLine());
        
        //affectations des joueurs 1 & 2 au tableau de joueurs
        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;
        
        //attribution des couleurs aux joueurs
        attribuerCouleursAuxJoueurs();
        System.out.println(joueur1+" possède les jetons de couleur "+Joueur1.Couleur);
        System.out.println(joueur2+" possède les jetons de couleur "+Joueur2.Couleur);
       
        //creation des jetons & attribution des jetons correpondants aux joueurs
        for (int i = 0, i < 21, i++) {
            Jeton unJeton = new Jeton(joueur1.couleur); //creation jetons joueur1
            joueur1.ajouterJeton(unJeton);
            Jeton unJeton = new Jeton(joueur2.couleur); //creation jetons joueur2
            joueur2.ajouterJeton(unJeton);
        }
        
        // FAIRE : définition aléatoire du joueur qui commence à jouer ??
        
        //placement des trous noirs (v.2)
        //placement des téléporteurs (v.3)
        
//METHODE A FINIR
    }

    // Méthode : lance la partie
    public void debuterPartie() {
        initialiserPartie(); //tout d'abord, on initalise la partie (préparation grille & joueurs)
        
    }

// TESTER CETTE MÉTHODE --> L'ATTRIBUTION ALÉATOIRE DE COULEUR OK OU PAS OK ?
    // Methode : attribue des couleurs aux joueurs
    public void attribuerCouleursAuxJoueurs() {
        
        //creation tableau contenant les deux couleurs
        String uneCouleur[] = new String[2];
        uneCouleur[0] = "Jaune";
        uneCouleur[1] = "Rouge";
        
        //Tirage aléatoire d'une couleur de jeton
        String Couleurjoueur1 = "";
        Random rand = new Random();
        int i = rand.nextInt(2);
        joueur1.Jeton(uneCouleur[i]); //on attribu cette 1ere couleur aléatoire au joueur1
        int a;
        if (i == 0) {
            a = 1;
        }
        else {
            a = 0;
        }
        joueur2.Jeton(uneCouleur[a]); //on attribu l'autre couleur au joueur2
        
    }
    
}


//une partie n’est finalement qu’une grande boucle : à chaque tour un joueur joue, puis l’autre,
//et on recommence ainsi tant qu’il n’y a pas de joueur gagnant ou que la grille n’est pas remplie.