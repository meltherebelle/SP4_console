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
    //boolean trouNoir; //indique ou non la présence d’un trou noir
    //boolean desintegrateur; //indique ou non la présence d’un désintégrateur

     
    // Constructeur : initialisant les attributs avec des valeurs par défaut
    public Cellule() {
        jetonCourant = null;
        //trouNoir = false;
        //desintegrateur = false;
    }
    
    //ajoute le jeton en paramètre à la cellule, et retourne vrai si
    //l’ajout s’est bien passé, sinon faux
    public boolean affecterJeton(Jeton unjeton) {
        if (jetonCourant == null) {
            jetonCourant = unjeton;
            System.out.println("Le jeton courant est bien affecté à la cellule");
            return true;
            }
        else {
            System.out.println("Le jeton courant est déjà présent sur la cellule");
            return false;
            }
        }

    //renvoie une référence vers le jeton de la cellule
    public Jeton recupererJeton(){
        System.out.println("La référence du jeton courant a bien été récupérée et renvoyé. ");
        return jetonCourant; //renvoie la réf du jetonCourant
    }
    
    
    //supprime le jeton et renvoie vrai si la suppression s’est bien
    //passée, ou faux autrement (ex : pas de jeton présent)
    public boolean supprimerJeton() {
        if (jetonCourant == jetonCourant) {
            jetonCourant = null ; //on supprime le jetonCourant placé dans la cellule
            System.out.println("La suppression s'est bien passée");
            return true;
        }
        else {
            System.out.println("Pas de jeton présent sur la cellule");
            return false;
        }
    }

    //ajoute un trou noir à l’endroit indiqué et retourne vrai si
    //l’ajout s’est bien passé, ou faux sinon (exemple : trou noir déjà présent)
    /* public boolean placerTrouNoir() {
        if (trouNoir.jetonCourant == 0) {
            trouNoir.jetonCourant = 1 ;
            return true; //ajout d'un trouNoir
        }
        else {
            return false; //trou noir déjà présent
        }
    } */
    
    //ajoute un désintégrateur à l’endroit indiqué et retourne vrai si l’ajout s’est bien passé,
    //ou faux sinon (exemple : désintégrateur déjà présent)
    /* public boolean placerDesintegrateur(){
        if (desintegrateur.jetonCourant == 0 ) {
            desintegrateur.jetonCourant = 1 ;
            return true; //désintégrateur placé
        }
        else {
            return false;
        }
    } */
    
    //renvoie vrai si un trou noir est présent sur la cellule
    /* public boolean presenceTrouNoir(){
        if (jetonCourant == trouNoir) {
            return true; //il y a un trouNoir sur la cellule
        }
        else {
            return false;
        }
    } */
    
    //renvoie la couleur du jeton occupant la cellule, ou
    //renvoie le mot « vide » si aucun jeton n’est présent.
    public String lireCouleurDuJeton(){
        if (jetonCourant == null) {
            return "La cellule est vide. ";
        }
        else {
            System.out.println("La couleur du jeton courant est : "+jetonCourant.Couleur);
            return jetonCourant.Couleur;
        }
    }
    
    /*//supprime le désintégrateur présent de la cellule,
    //et renvoie vrai, ou faux sinon (exemple : pas de désintégrateur présent)
    public boolean recupererDesintegrateur(){
        
    }*/
    
    /*//active le trou noir : le trou noir engloutit le jeton et disparait.
    //Retourne vrai si tout s’est correctement déroulé, ou faux sinon (pas de trou noir)
    public boolean activerTrouNoir(){
        
    }*/
    
}
