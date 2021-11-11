/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_mk_lb.git;
package Convertisseur.java;

import java.util.Scanner;
import tp2_convertisseurobjet_mk_lb.Convertisseur;

/**
 *
 * @author mario
 */
public class TP2_convertisseurObjet_MK_LB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Création de 2 objets de type Convertisseur
        Convertisseur conv1 = new Convertisseur();
        Convertisseur conv2 = new Convertisseur();
        
        int choixconv;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour, saisissez une valeur :");
        double val = sc.nextDouble();

        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Celcius\n4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit\n6) De Farenheit vers Kelvin");
        choixconv = sc.nextInt();

        while ((0 < choixconv) && (choixconv < 7)) {
            //On récupère les températures converties dans des variables
            float temp1;
            //float temp2;
            
            
            if (choixconv == 1) {
                temp1 = (float) conv1.CelciusVersKelvin(val);
                //temp2 = (float) conv2.CelciusVersKelvin(val);
                System.out.println(val+"°C vaut "+temp1+"K");
            }

            if (choixconv == 2) {
                temp1 = (float) conv1.KelvinVersCelcius(val);
                //temp2 = (float) conv2.KelvinVersCelcius(val);
                System.out.println(val+"K vaut "+temp1+"°C");
            }

            if (choixconv == 3) {
                temp1 = (float) conv1.FarenheitVersCelcius(val);
                //temp2 = (float) conv2.FarenheitVersCelcius(val);
                System.out.println(val+"F vaut "+temp1+"°C");
            }

            if (choixconv == 4) {
                temp1 = (float) conv1.CelciusVersFarenheit(val);
                //temp2 = (float) conv2.CelciusVersFarenheit(val);
                System.out.println(val+"°C vaut "+temp1+"F");
            }

            if (choixconv == 5) {
                temp1 = (float) conv1.KelvinVersFarenheit(val);
                //temp2 = (float) conv2.KelvinVersFarenheit(val);
                System.out.println(val+"K vaut "+temp1+"F");
            }

            if (choixconv == 6) {
                temp1 = (float) conv1.FarenheitVersKelvin(val);
                //temp2 = (float) conv2.FarenheitVersKelvin(val);
                System.out.println(val+"F vaut "+temp1+"K");
            }
            
            System.out.println("Saisissez une autre conversion que vous souhaiter effectuer avec cette même valeur :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Celcius\n4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit\n6) De Farenheit vers Kelvin\n(OU entrez un autre chiffre pour stopper)");
            choixconv = sc.nextInt();
        }
        System.out.println(conv1);
    }   
}