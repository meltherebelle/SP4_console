/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_mk_lb;

/**
 *
 * @author mario
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur (){
        nbConversions=0;
    }
        
    public double CelciusVersKelvin(double tempC) {
        nbConversions += 1;
        double tempK;
        tempK = tempC + 273.15; // K = °C + 273,15.
        return tempK;
    }

    public double KelvinVersCelcius(double tempK) {
        nbConversions += 1;
        double tempC;
        tempC = tempK - 273.15; // °C = K - 273,15.
        return tempC;
    }

    public double FarenheitVersCelcius(double tempF) {
        nbConversions += 1;
        double tempC;
        tempC = (tempF - 32) * (5 / 9); // (°F − 32) × 5/9 = °C
        return tempC;
    }

    public double CelciusVersFarenheit(double tempC) {
        nbConversions += 1;
        double tempF;
        tempF = (tempC * (9 / 5)) + 32; // (0°C × 9/5) + 32 = 32°F
        return tempF;
    }

    public double KelvinVersFarenheit(double tempK) {
        nbConversions += 1;
        double tempF;
        tempF = (tempK - 273.15) * (9 / 5) + 32; // (0K − 273.15) × 9/5 + 32 = -459.7°F
        return tempF;
    }

    public double FarenheitVersKelvin(double tempF) {
        nbConversions += 1;
        double tempK;
        tempK = (tempF - 32) * (5 / 9) + 273.15; // (32°F − 32) × 5/9 + 273.15 = 273.15K
        return tempK;
    }
    
    @Override
    public String toString () {
        return "nb de conversions : "+ nbConversions;
    }
}

