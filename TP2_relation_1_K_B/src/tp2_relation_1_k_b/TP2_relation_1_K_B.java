/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_k_b;

/**
 *
 * @author leaburriat
 */
public class TP2_relation_1_K_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra) ;
        //« Bob est propriétaire d’une Clio »
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] );
        //on ajoute une seconde voiture à Bob, et deux autres voitures à Reno
        bob.liste_voitures[0] = uneAutreClio ;
        bob.nbVoitures = 2 ;
        uneAutreClio.Proprietaire = bob ;
        System.out.println("la deuxieme voiture de Bob est " + bob.liste_voitures[1] );
        
        reno.liste_voitures[0] = une2008 ;
        une2008.Proprietaire = reno ;
        System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[0] );
        
        reno.liste_voitures[1] = uneMicra ;
        uneMicra.Proprietaire = reno ;
        System.out.println("la deuxieme voiture de Reno est " + reno.liste_voitures[1] );
        reno.nbVoitures = 2 ;
    }
}
