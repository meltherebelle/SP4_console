package sp4_console_k_b;
 
/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
 
/**
*
* @author leaburriat
*/
public class Grille {
   
    //creation du tableau Cellules composé de 42 cellules
    Cellule CellulesJeu[][] = new Cellule[6][7];
 
    //Constructeur de la grille - creation de la grille
    public Grille(){
       for (int l=0; l<6; l++){
            for (int c=0; c<7; c++){
                Cellules[l][c] = new Cellule(); //créé un nouvel objet de type Cellule --> référence la cellule
            }
        }
    }
    
    public boolean ajouterJetonDansColonne(Jeton unjeton, int column ){
        for (int line=0; line<6;line ++){
            //vérification si la colonne est vide = libre
            if (CellulesJeu[line][column].jetonCourant==null){
                CellulesJeu[line][column].jetonCourant=unjeton; //si libre --> on ajoute un jeton dans cette colonne
                return true;
            }
        }
     return false; //sinon on ne permet pas d'ajouter un jeton dans cette colonne
    }
    
    //retourne le boolean true si la grille est pleine, false sinon
    public boolean etreremplie(){
        for (int line=0;line<6;line++){
            for (int column=0;column<7;column ++){
                if(CellulesJeu[line][column].jetonCourant==null){
                    break;
                }
            }
        }
        return true; //certaines cellules sont encore vides
    }
    
    //Parcours la grille et initialise les cellules à 0 (quand elles ne le sont pas déjà)
    public void viderGrille(){
        for (int line=0;line<6;line++){
            for (int column=0;column<7;column ++){
                if(CellulesJeu[line][column].jetonCourant!=null){
                    CellulesJeu[line][column].jetonCourant=null;
                }
            }
        }
    }
    
    //Vérifie si la cellule est vide (renvoie true) ou occupée (renvoie false)
    public boolean celluleOccupee(int line , int column){
        if (CellulesJeu[line][column].jetonCourant==null){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Lis (et donc renvoie) la couleur du jeton présent dans la cellule rentrée en paramètres
    public String lireCouleurDuJeton(int line , int column) {
        String couleur=CellulesJeu[line][column].lireCouleurDuJeton();
        return couleur;
    }
    
    //Détermine si le joueur est gagnant (donc si 4 de ses pions sont alignés)
    public boolean etreGagnantePourJoueur(Joueur unjoueur) {
         
     // A FAIRE (je crois que tu avais commencé à lire le doc explicatif sur moodle pour cette méthode...)
        return true;
    }   
    
}

    ///J'aurais besoin de la méthode AfficherGrilleSurConsole...