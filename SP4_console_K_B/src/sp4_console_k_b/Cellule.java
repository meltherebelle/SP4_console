package sp4_console_k_b;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leaburriat
 */
public class Cellule {

    Jeton jetonCourant; //référence vers le jeton occupant la cellule, ou null
    boolean trouNoir; //indique ou non la présence d’un trou noir
    boolean desintegrateur; //indique ou non la présence d’un désintégrateur

     
    // Constructeur : initialisant les attributs avec des valeurs par défaut
    public Cellule() {
        
    }
    
    //ajoute le jeton en paramètre à la cellule, et retourne vrai si
    //l’ajout s’est bien passé, sinon faux
    public Jeton affecterJeton(Jeton unjeton) {
        jetonCourant = unjeton;
        if (CellulesJeu[line][column].jetonCourant != jetonCourant) {
            CellulesJeu[line][column].jetonCourant = unjeton;
            return true;
            }
        else {
            return false; //jeton déjà présent
            }
        }

    //renvoie une référence vers le jeton de la cellule
    public Jeton recupererJeton(){
        jetonCourant = CellulesJeu[line][column];
        return jetonCourant;
    }
    
    
    //supprime le jeton et renvoie vrai si la suppression s’est bien
    //passée, ou faux autrement (ex : pas de jeton présent)
    public boolean supprimerJeton() {
        if (CellulesJeu[line][column].jetonCourant == jetonCourant) {
            CellulesJeu[line][column].jetonCourant -= jetonCourant;
            return true; //la suppression s'est bien passée
        }
        else {
            return false; //pas de jeton présent sur la cellule
        }
    }

    //ajoute un trou noir à l’endroit indiqué et retourne vrai si
    //l’ajout s’est bien passé, ou faux sinon (exemple : trou noir déjà présent)
    public boolean placerTrouNoir() {
        if (CellulesJeu[line][column].jetonCourant != trouNoir) {
            CellulesJeu[line][column].jetonCourant = trouNoir;
            return true; //ajout d'un trouNoir
        }
        else {
            return false; //trou noir déjà présent
        }
    }
    
    //ajoute un désintégrateur à l’endroit indiqué et retourne vrai si l’ajout s’est bien passé,
    //ou faux sinon (exemple : désintégrateur déjà présent)
    public boolean placerDesintegrateur(){
        if (CellulesJeu[line][column].jetonCourant != desintegrateur) {
            CellulesJeu[line][column].jetonCourant = desintegrateur;
            return true; //désintégrateur placé
        }
        else {
            return false;
        }
    }
    
    //renvoie vrai si un trou noir est présent sur la cellule
    public boolean presenceTrouNoir(){
        //if () {
            return true;
        //}
        //else {
          //  return false;
        //}
    }
    
    // renvoie la couleur du jeton occupant la cellule, ou
    //renvoie le mot « vide » si aucun jeton n’est présent.
    public String lireCouleurDuJeton(){
        
    }
    public boolean recupererDesintegrateur(){
        
    }
    public boolean activerTrouNoir(){
        
    }
    public boolean affecterJeton(Jeton) {

    }
}
