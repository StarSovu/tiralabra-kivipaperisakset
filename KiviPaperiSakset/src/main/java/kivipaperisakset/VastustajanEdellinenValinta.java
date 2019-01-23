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
    
    public VastustajanEdellinenValinta() {
        edellinenValinta = 1;
    }
    
    public int valitse() {
        int valinta = edellinenValinta + 1;
        if (valinta == 3) {
            valinta = 0;
        }
        return valinta;
    }
    
    public void vastaanotaValinta(int valinta) {
        edellinenValinta = valinta;
    }
    
}
