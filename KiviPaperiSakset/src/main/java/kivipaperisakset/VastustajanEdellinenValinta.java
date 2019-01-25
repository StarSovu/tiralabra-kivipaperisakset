/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivipaperisakset;

/**
 *
 * @author sovu
 */
public class VastustajanEdellinenValinta {
    int edellinenValinta;
    
    /**
     * Oletusarvona muuttujalle edellinenValinta tulee 1 (paperi), jolloin
     * valitse-metodin myötä luokka valitsee ensimmäisenä aina sakset
     */
    public VastustajanEdellinenValinta() {
        edellinenValinta = 1;
    }
    
    /**
     * Metodi tarkistaa, minkä valinnan vastustaja viimeksi teki, ja valitsee
     * seuraavaksi sen, mikä voittaa vastustajan edellisen valinnan
     * (0: kivi, 1: paperi; 2: sakset)
     * @return palauttaa 
     */
    public int valitse() {
        int valinta = edellinenValinta + 1;
        if (valinta == 3) {
            valinta = 0;
        }
        return valinta;
    }
    
    /**
     * Metodilla luokka saa tietoonsa, mitä vastustaja valitsi viimeksi.
     * Luokka käyttää tätä tietoa, kun "valitse"-metodia kutsutaan
     * seuraavan kerran.
     * @param valinta  Vastustajan valinta (0: kivi, 1: paperi, 2: sakset)
     */
    public void vastaanotaValinta(int valinta) {
        edellinenValinta = valinta;
    }
    
}
