 
package tp2_bieres_k_b;
 
 
/**
*
* @author lea
*/
public class BouteilleBiere {  // il faut faut faire attention a la construction d'une classe
    // en premier on créer la classe via New/Java class...
    // ensuite dans la classe on initialise es différents attributs et aussi un CONSTRUCTEUR
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
 
    // Création du constructeur de BouteilleBiere
    public BouteilleBiere(String unNom, double unDegre, String
    uneBrasserie) {
     // un constructeur prend en entrée les différents éléments que l'on veut définir pour un objet
     // un constructeur facilite donc l'attribution d'éléments a un certain objet
     nom = unNom;
     degreAlcool=unDegre;
     brasserie = uneBrasserie;
     ouverte = false;
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)ouverte ? " ;
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }
 
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +
         " degres) \nBrasserie : " + brasserie ) ;
    }
    
    public boolean Décapsuler() {
       if (ouverte==false){
           ouverte=true;
       }
       else{
          System.out.println(" Erreur: Biere deja ouverte");
          ouverte=false;
       }
       return ouverte ;
    }
}
 