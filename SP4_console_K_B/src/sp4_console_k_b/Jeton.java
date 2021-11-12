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
        Couleur = Color ;
        }

    //Méthode : renvoie la couleur du jeton
    public String lireCouleur() {
        return Couleur;
    }
}
