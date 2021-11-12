package tp2_relation_1_k_b;
 
/**
*
* @author mario
*/
public class Personne {
    String nom;
    String prenom;
    int nbVoitures ;
    Voiture [] liste_voitures=new Voiture [3] ;
 
 
    public Personne (String name , String firstname){
        nom=name;
        prenom=firstname;
    }
    @Override
    public String toString(  ) {
        String chaine_a_retourner;
        chaine_a_retourner = "\n Le nom du propiétaire est: " + nom + "  et son prénom " + prenom ;
        
        return chaine_a_retourner ;
    }
    
    //public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        //if (Proprietaire.voiture_a_ajouter[0]=0) {
        //    return false;
        //}
    //}
}
 