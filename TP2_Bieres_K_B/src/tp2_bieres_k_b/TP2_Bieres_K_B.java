/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_k_b;

/**
 *
 * @author leaburriat
 */
public class TP2_Bieres_K_B {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson");
        // obligé de modifier le type de degreAlcool dans 'BouteilleBiere.java'
        // demandé: type float ; j'ai changé en double pour que ça marche
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        System.out.println( uneBiere );
        System.out.println( secondeBiere );
        // on créé une nouvelle boisson de notre choix pour effectuer des tests
        BouteilleBiere laYellow = new BouteilleBiere("LeJaune",51,"LaPeufinerie");
        System.out.println( laYellow );
        // On décapsule à présent laYellow pour vérifier si ouverture est à true
        laYellow.Décapsuler();
        System.out.println( laYellow );
        // laYellow est ouverte !
    }
    
}
