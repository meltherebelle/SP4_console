/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leaburriat
 */
public class Convertisseur {
    int nbConversions = 0; // incrémenter nbConversions de 1 à chaque conversion

    // La méthode toString() doit retourner le nombre de conversions effectuées
    @Override
        public String toString() {
        return "nb de conversions" + nbConversions;
    }

    public float CelsiusVersKelvin(float tempC) {
        float tempK;
        tempK = (float) (tempC + 273.15); // K = °C + 273,15.
        return tempK;
    }

    public float KelvinVersCelcius(float tempK) {
        float tempC;
        tempC = (float) (tempK - 273.15); // °C = K - 273,15.
        return tempC;
    }

    public float FarenheitVersCelcius(float tempF) {
        float tempC;
        tempC = (tempF - 32) * (5 / 9); // (°F − 32) × 5/9 = °C
        return tempC;
    }

    public float CelciusVersFarenheit(float tempC) {
        float tempF;
        tempF = (tempC * (9 / 5)) + 32; // (0°C × 9/5) + 32 = 32°F
        return tempF;
    }

    public float KelvinVersFarenheit(float tempK) {
        float tempF;
        tempF = (float) ((tempK - 273.15) * (9 / 5) + 32); // (0K − 273.15) × 9/5 + 32 = -459.7°F
        return tempF;
    }

    public float FarenheitVersKelvin(float tempF) {
        float tempK;
        tempK = (float) ((tempF - 32) * (5 / 9) + 273.15); // (32°F − 32) × 5/9 + 273.15 = 273.15K
        return tempK;
    }
}
