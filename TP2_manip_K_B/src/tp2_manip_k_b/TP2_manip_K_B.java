/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_k_b;
package Moussaka.java;

import java.util.Arrays;

/**
 *
 * @author leaburriat
 */
public class TP2_manip_K_B {

    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2;
        // 3 assiettes de tartiflettes ont été créé
        // assiette 3 étant égale à assiette 2
       
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
       
        //les objets de type tartiflette référencés dans assiettes 1 et 2 ont été intervertis
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
       
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
       
        // Moussaka assiette666 = assiette1 ;
        // ligne 34 = erreur : assiette666 du type Moussaka n'est pas compatible assiette 1 du type Tartiflette
        // Moussaka assiette667 = new Tartiflette();
        // ligne 36 = erreur : la référence Moussaka n'est pas compatible avec la référence Tartiflette pour créer un nouvel objet
        
        //creation d'un tableau de 10 références de Moussaka
        Moussaka[] TabMouss = new Moussaka[10];
        for (int i=0; i < 10; i++) {
            TabMouss[i] = new Moussaka(100*i);
        }
    }
}
