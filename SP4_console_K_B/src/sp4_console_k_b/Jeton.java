package sp4_console_k_b;

import static java.lang.Math.random;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leaburriat
 */
public class Jeton {
    
    //couleur affectée au joueur
    String Couleur;

    //Méthode : constructeur initialisant la couleur du jeton avec le paramètre
    public Jeton(String Color) {
        Color = Couleur;
        
        //creation tableau contenant les deux couleurs
        String uneCouleur[] = new String[2];
        uneCouleur[0] = "Jaune";
        uneCouleur[1] = "Rouge";
        
        //Tirage aléatoire d'une couleur de jeton
        Random rand = new Random();
        int i = rand.nextInt(2);
        Color = uneCouleur[i];
        ////TEST////
        System.out.println(Couleur);
        }

    //Méthode : renvoie la couleur du jeton
    public String lireCouleur() {
        return Couleur;
    }
}
