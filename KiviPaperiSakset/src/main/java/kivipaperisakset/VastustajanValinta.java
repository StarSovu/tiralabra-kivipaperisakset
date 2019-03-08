/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivipaperisakset;

import kivipaperisakset.vastustajat.VastustajanEdellinenValintaVastastrategia;
import kivipaperisakset.vastustajat.Vastustaja;
import kivipaperisakset.vastustajat.VastustajanEdellinenValinta;
import java.util.Random;
import kivipaperisakset.vastustajat.VastustajaTutkija;

public class VastustajanValinta {
    private Random random;
    
    public VastustajanValinta() {
        random = new Random();
    }
    
    public Vastustaja satunnainenVastustaja() {
        int vastustajaLuku = random.nextInt(2) + 1;
        return (this.valittuVastustaja(vastustajaLuku));
    }
    
    public Vastustaja valittuVastustaja(int vastustajaLuku) {
        Vastustaja vastustaja;
        if (vastustajaLuku == 1) {
            vastustaja = new VastustajanEdellinenValinta();
        } else if (vastustajaLuku == 2) {
            vastustaja = new VastustajanEdellinenValintaVastastrategia();
        } else {
            vastustaja = new VastustajaTutkija();
        }
        return vastustaja;
    }
    
}
