package tp2_relation_1_k_b;
 
/**
*
* @author mario
*/
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire=null;
   
    
    
     public Voiture (String LeModele,String LaMarque,int PuisCV)  {
       Modele=LeModele;
       Marque=LaMarque;
       PuissanceCV=PuisCV;
      
     }    
    @Override
    public String toString(  ) {
        String chaine_a_retourner;
        chaine_a_retourner = "\n Le modele est: " + Modele + "  de la marque " + Marque + "  avec comme puissance   " + PuissanceCV + "  chevaux";
    
        return chaine_a_retourner ;
    }
   
}
 