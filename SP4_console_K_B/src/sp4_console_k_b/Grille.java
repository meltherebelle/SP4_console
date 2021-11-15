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
   
 
    Cellule CellulesJeu[][] = new Cellule[6][7];
 
    public Grille(){
       
    }
    public boolean ajouterJetonDansColonne(Jeton unjeton, int column ){
        for (int line=0; line<6;line ++){
            if (CellulesJeu[line][column].jetonCourant==null){
                CellulesJeu[line][column].jetonCourant=unjeton;
                return true;
            }
        }
     return false;
     //la colonne est remplie
    }
    public boolean etreremplie(){
        for (int line=0;line<6;line++){
            for (int column=0;column<7;column ++){
                if(CellulesJeu[line][column].jetonCourant==null){
                    break;
                }
            }
        }
        return true;
       
    }
    public void viderGrille(){
        for (int line=0;line<6;line++){
            for (int column=0;column<7;column ++){
                if(CellulesJeu[line][column].jetonCourant!=null){
                    CellulesJeu[line][column].jetonCourant=null;
                }
            }
        }
    }
    public boolean celluleOccupee(int line , int column){
        if (CellulesJeu[line][column].jetonCourant==null){
            return true;
        }
        else{
            return false;
        }
    }
    public String lireCouleurDuJeton(int line , int column) {
        String couleur=CellulesJeu[line][column].lireCouleurDuJeton();
        return couleur;
    }
           
}