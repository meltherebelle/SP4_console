/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_kervella_burriat;

/**
 *
 * @author leaburriat
 */
public class TP2_convertisseurObjet_KERVELLA_BURRIAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        convertisseur convF_C = new convertisseur();
       
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
