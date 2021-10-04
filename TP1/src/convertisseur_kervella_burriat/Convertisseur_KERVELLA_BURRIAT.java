/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur_kervella_burriat;

import java.util.Scanner;

/**
 *
 * @author leaburriat
 */
public class Convertisseur_KERVELLA_BURRIAT {

    /**
     * @param args the command line arguments
     */
    public static double CelciusVersKelvin(double tempC) {
        double tempK;
        tempK = tempC + 273.15; // K = °C + 273,15.
        return tempK;
    }

    public static double KelvinVersCelcius(double tempK) {
        double tempC;
        tempC = tempK - 273.15; // °C = K - 273,15.
        return tempC;
    }

    public static double FarenheitVersCelcius(double tempF) {
        double tempC;
        tempC = (tempF - 32) * (5 / 9); // (°F − 32) × 5/9 = °C
        return tempC;
    }

    public static double CelciusVersFarenheit(double tempC) {
        double tempF;
        tempF = (tempC * (9 / 5)) + 32; // (0°C × 9/5) + 32 = 32°F
        return tempF;
    }

    public static double KelvinVersFarenheit(double tempK) {
        double tempF;
        tempF = (tempK - 273.15) * (9 / 5) + 32; // (0K − 273.15) × 9/5 + 32 = -459.7°F
        return tempF;
    }

    public static double FarenheitVersKelvin(double tempF) {
        double tempK;
        tempK = (tempF - 32) * (5 / 9) + 273.15; // (32°F − 32) × 5/9 + 273.15 = 273.15K
        return tempK;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double tempC, tempK, tempF, val;
        int choixconv;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour, saisissez une valeur :");
        val = sc.nextDouble();

        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Celcius\n4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit\n6) De Farenheit vers Kelvin");
        choixconv = sc.nextInt();

        if (choixconv == 1) {
            tempK = CelciusVersKelvin(val);
            System.out.println(val + " degré Celcius est égal à " + tempK + " degré Kelvin");
        }

        if (choixconv == 2) {
            tempC = KelvinVersCelcius(val);
            System.out.println(val + " degré Kelvin est égal à " + tempC + " degré Celcius");
        }

        if (choixconv == 3) {
            tempC = FarenheitVersCelcius(val);
            System.out.println(val + " degré Farenheit est égal à " + tempC + " degré Celcius");
        }

        if (choixconv == 4) {
            tempF = CelciusVersFarenheit(val);
            System.out.println(val + " degré Celcius est égal à " + tempF + " degré Farenheit");
        }

        if (choixconv == 5) {
            tempF = KelvinVersFarenheit(val);
            System.out.println(val + " degré Kelvin est égal à " + tempF + " degré Farenheit");
        }

        if (choixconv == 6) {
            tempK = FarenheitVersKelvin(val);
            System.out.println(val + " degré Farenheit est égal à " + tempK + " degré Kelvin");
        }
    }

}
