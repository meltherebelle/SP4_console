/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipNombreInt;
import java.util.Scanner;
/**
 *
 * @author leaburriat
 */
public class manipNombresInt_K_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nb1;
        int nb2;
        int add;
        int diff;
        int prod;
        int quot;
        int reste;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez deux valeurs");
        nb1=sc.nextInt();
        nb2=sc.nextInt();
        add=nb1+nb2;
        diff=nb1-nb2;
        prod=nb1*nb2;
        System.out.println("Résultat de la somme est : "+add+ "\nRésultat de la différence est : "+ diff+ "\nRésultat du produit : "+prod);
        quot = nb1 / nb2; // division entier
        reste = nb1 % nb2; // reste de la division euclidienne
        System.out.println("Résultat de la division entière : "+quot+"\nReste de la division euclidienne : "+reste);
    }
    
}