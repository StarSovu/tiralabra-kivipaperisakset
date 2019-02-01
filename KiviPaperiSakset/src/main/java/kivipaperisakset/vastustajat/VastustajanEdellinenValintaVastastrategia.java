/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivipaperisakset.vastustajat;

/**
 * Vastustaja-algoritmi, joka olettaa, että vastustaja käyttää
 * "VastustajanEdellinenValinta"-algoritmia. Algorimit valitsee siis
 * aina sen, mikä häviää sille, mitä se on viimeksi valinnut, eikä käytä
 * vastustajan valintaa ollenkaan hyödyksi.
 * 
 * @author sovu
 */
public class VastustajanEdellinenValintaVastastrategia implements Vastustaja {
    int edellinenValinta;
    int edellinenTulos;
    
    /**
     * Oletusarvona muuttujalle tulee paperi (1), jolloin algoritmi valitsee
     * ensimmäisenä kiven (0).
     */
    public VastustajanEdellinenValintaVastastrategia() {
        edellinenValinta = 1;
    }

    /**
     * Algoritmi ei käytä tätä metodia lainkaan hyödykseen, sillä
     * VastustajanEdellinenValinta ei tee valintoja sen itse tekemien
     * aikaisempien valintojen perusteella
     * @param valinta 
     */
    @Override
    public void vastaanotaValinta(int valinta) {
    }

     /**
      * Algoritmi valitsee sen, mikä voittaa sen, mitä luokka
      * VastustanEdellinenValinta
      * @return mitä algorimit valitsee seuraavaksi.
      */
    @Override
    public int valitse() {
        edellinenValinta--;
        if (edellinenValinta == -1) {
            edellinenValinta = 2;
        }
        return edellinenValinta;
    }
    
}
