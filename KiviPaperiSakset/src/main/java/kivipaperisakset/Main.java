package kivipaperisakset;

import kivipaperisakset.vastustajat.Vastustaja;
import java.util.Scanner;
import kivipaperisakset.vastustajat.VastustajaTutkija;

/**
 *
 * @author sovu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        /**
         * Alussa kysytään pelaajalta algoritmia. Nämä annetaan numeroina (pelaajan
         * on tiedettävä ulkopuolisesti, mikä luku on mikäkin algoritmi).
         */
        
        /**
        System.out.println("Valitse algoritmi (1 tai 2, muu valitsee satunnaisen)");
        
        VastustajanValinta algoritmiValinta = new VastustajanValinta();
        String algoritmiValinta2 = lukija.nextLine();
        Vastustaja vastustaja;
        
        if (algoritmiValinta2.equals("1")) {
            vastustaja = algoritmiValinta.valittuVastustaja(1);
        } else if (algoritmiValinta2.equals("2")) {
            vastustaja = algoritmiValinta.valittuVastustaja(2);
        } else {
            vastustaja = algoritmiValinta.satunnainenVastustaja();
        }
        */
        
        Vastustaja vastustaja = new VastustajaTutkija();
        
        System.out.println("Valitse kivi, paperi tai sakset. k=kivi, p=paperi, s=sakset, kaikki muu lopettaa");
        
        int[] tilastot = new int[3];
        tilastot[0] = 0; //tasapelit
        tilastot[1] = 0; //voitot
        tilastot[2] = 0; //häviöt
        
        while (true) {
            String valinta = lukija.nextLine();
            if (!valinta.equals("k") && !valinta.equals("p") && !valinta.equals("s")) {
                break;
            }
            int valinta2;
            if (valinta.equals("k")) {
                valinta2 = 0;
            } else if (valinta.equals("p")) {
                valinta2 = 1;
            } else {
                valinta2 = 2;
            }
            
            int vastustajanValinta = vastustaja.valitse() - 3;
            vastustaja.vastaanotaValinta(valinta2);
            
            int voitto = (valinta2 - vastustajanValinta) % 3;
            
            if (voitto == 0) {
                System.out.println("tasapeli");
            } else if (voitto == 1) {
                System.out.println("voitto");
            } else {
                System.out.println("häviö");
            }
            
            tilastot[voitto]++;
            
        }
        System.out.println("Voitot: " + tilastot[1] + ", häviöt: " + tilastot[2] + ", tasapelit: " + tilastot[0]);
    }
    
}
