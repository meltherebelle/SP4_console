/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stats_kervella_burriat;

import java.util.Scanner;

/**
 *
 * @author leaburriat
 */
public class stats_KERVELLA_BURRIAT {

    public static void main(String[] args) {

        int[] Face = new double[6];
        for (int i = 0; i < 5; i++) {
            Face[i] = 0;
            System.out.println(Face[i]);
        }

        Scanner sc = new Scanner(System.in);
        int m;
        int tirage;
        System.out.println("Saisissez un nombre entier m");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            tirage = Math.random() * (5);
            Face[tirage] += 1;
        }

        float Face1, Face2, Face3, Face4, Face5, Face6;
        Face1 = (Face[0] * m) / 100;
        Face2 = (Face[1] * m) / 100;
        Face3 = (Face[2] * m) / 100;
        Face4 = (Face[3] * m) / 100;
        Face5 = (Face[4] * m) / 100;
        Face6 = (Face[5] * m) / 100;

        System.out.println("Pourcentage d'obtention de la face 1 : " + Face1);
        System.out.println("Pourcentage d'obtention de la face 2 : " + Face2);
        System.out.println("Pourcentage d'obtention de la face 3 : " + Face3);
        System.out.println("Pourcentage d'obtention de la face 4 : " + Face4);
        System.out.println("Pourcentage d'obtention de la face 5 : " + Face5);
        System.out.println("Pourcentage d'obtention de la face 6 : " + Face6);

    }
}
