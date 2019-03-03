/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivipaperisakset.vastustajat;

import java.util.Random;

/**
 *
 * @author sovu
 */
public class VastustajaTutkija implements Vastustaja {
    private Random random;
    private int vastustajanEdellinen;
    private int vastustajanToiseksiEdellinen;
    private int algoritminEdellinen;
    private int algoritminToiseksiEdellinen;
    private int ennustettuSeuraava;
    private int[][] aiemmatValinnat;
    
    /**
     * Aiemmat valinnat selitys: Taulukon ensimmäinen luku (0, 1 tai 2) kertoo,
     * onko algoritmi voittanut (1), hävinnyt (2) vai pelannut tasan (3).
     * Toinen luku kertoo, miten käyttäjä (algoritmin vastustaja) on seuraavaksi 
     * ruvennut pelaamaan. (0: sama, 1: edellisen voittava, 2: edelliselle
     * häviävä).
     */
    public VastustajaTutkija() {
        this.random = new Random();
        this.vastustajanEdellinen = -1;
        this.vastustajanToiseksiEdellinen = -1;
        this.algoritminEdellinen = -1;
        this.algoritminToiseksiEdellinen = -1;
        this.ennustettuSeuraava = random.nextInt(3);
        this.aiemmatValinnat = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aiemmatValinnat[i][j] = 0;
            }
        }
    }

    @Override
    public void vastaanotaValinta(int valinta) {
        vastustajanToiseksiEdellinen = vastustajanEdellinen;
        vastustajanEdellinen = valinta;
        this.paivitaEdellisetValinnat();
        this.maaritaSeuraava();
    }

    @Override
    public int valitse() {
        algoritminToiseksiEdellinen = algoritminEdellinen;
        algoritminEdellinen = (this.ennustettuSeuraava + 1) % 3;
        return algoritminEdellinen;
    }
    
    /**
     * Päivittää aiemmatValinnat-taulukon arvoja.
     */
    private void paivitaEdellisetValinnat() {
        if (vastustajanToiseksiEdellinen == -1) {
            return;
        }
        int i = (algoritminToiseksiEdellinen - vastustajanToiseksiEdellinen + 3) % 3;
        int j = (vastustajanEdellinen - vastustajanToiseksiEdellinen + 3) % 3;
        aiemmatValinnat[i][j] += 1;
    }
    
    /**
     * Määrittää ennustetun seuraavan valinnan pelaajalle sen perusteella,
     * mitä käyttäjä on aikaisemmin valinnut.
     */
    private void maaritaSeuraava() {
        int i = (algoritminToiseksiEdellinen - vastustajanToiseksiEdellinen + 3) % 3;
        int k = 0;
        int arvausVaikuttaja = 0;
        for (int j = 0; j < 3; j++) {
            if (aiemmatValinnat[i][j] > k) {
                k = aiemmatValinnat[i][j];
                arvausVaikuttaja = kahdenPotenssi(j);
            } else if (aiemmatValinnat[i][j] == k) {
                arvausVaikuttaja += kahdenPotenssi(j);
            }
        }
        int arvaus = valinta(arvausVaikuttaja);
        ennustettuSeuraava = (vastustajanEdellinen + arvaus) % 3;
    }
    
    /**
     * Tätä käytetään hyöydyksi maaritaSeuraava-metodissa, jossa tämä arvo
     * annetaan arvausVaikuttaja-muuttujalle. Tarvitaan vain arvot
     * 2⁰=1, 2¹=2 ja 2²=4.
     */
    private int kahdenPotenssi(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        return 4;
    }
    
    /**
     * 
     * @param n - arvo, joka saatiin arvausVaikuttaja-muuttujalle
     * @return palautettu arvo on joko 0, 1 tai 2, jossa 0 tarkoittaa, että
     * pelaajan ennustetaan valitsevan saman kuin viimeksi, 1 sen voittavan
     * ja 2 sille häviävän.
     */
    private int valinta(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return random.nextInt(2);
        }
        if (n == 4) {
            return 2;
        }
        if (n == 5) {
            return 2 * random.nextInt(2);
        }
        if (n == 6) {
            return random.nextInt(2) + 1;
        }
        return random.nextInt(3);
    }
    
}
