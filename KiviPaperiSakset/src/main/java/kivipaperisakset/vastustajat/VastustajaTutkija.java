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
    Random random;
    int vastustajanEdellinen;
    int vastustajanToiseksiEdellinen;
    int algoritminEdellinen;
    int algoritminToiseksiEdellinen;
    int ennustettuSeraava;
    int[][][] aiemmatValinnat;
    
    /**
     * Aiemmat valinnat selitys: Taulukon ensimmäinen luku (0, 1 tai 2) kertoo,
     * onko algoritmi voittanut (1), hävinnyt (2) vai pelannut tasan (3).
     * Toinen luku kertoo, miten käyttäjä (algoritmin vastustaja) on seuraavaksi 
     * ruvennut pelaamaan. (0: sama, 1: edellisen voittava, 2: edelliselle
     * häviävä).
     * Kolmas luku kertoo, onko tämä seuraava valinta johtanut algoritmin
     * voittoon (1), käyttäjän voittoon (2) vai tasapeliin (0).
     * Taulukko pitää kirjaa, kuinka monta kertaa kukin tapaus on tapahtunut.
     */
    public VastustajaTutkija() {
        this.random = new Random();
        this.vastustajanEdellinen = -1;
        this.vastustajanToiseksiEdellinen = -1;
        this.algoritminEdellinen = -1;
        this.algoritminToiseksiEdellinen = -1;
        this.ennustettuSeraava = random.nextInt(3);
        this.aiemmatValinnat = new int[3][3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    aiemmatValinnat[i][j][k] = 0;
                }
            }
        }
    }

    @Override
    public void vastaanotaValinta(int valinta) {
        vastustajanToiseksiEdellinen = vastustajanEdellinen;
        vastustajanEdellinen = valinta;
        this.paivitaEdellisetValinnat();
    }

    @Override
    public int valitse() {
        return (this.ennustettuSeraava + 1) % 3;
    }
    
    /**
     * Päivittää aiemmatValinnat-taulukon arvoja.
     */
    private void paivitaEdellisetValinnat() {
        if (vastustajanToiseksiEdellinen == -1) {
            return;
        }
        int i = (algoritminToiseksiEdellinen - vastustajanToiseksiEdellinen) % 3;
        int j = (vastustajanEdellinen - vastustajanToiseksiEdellinen) % 3;
        int k = (algoritminEdellinen - vastustajanEdellinen) % 3;
        aiemmatValinnat[i][j][k] += 1;
    }
    
    /**
     * Määrittää seuraavan valinnan sen perusteella, mitä vastustaja on
     * aiemmin valinnut.
     */
    private void maaritaSeuraava() {
        
    }
    
}
