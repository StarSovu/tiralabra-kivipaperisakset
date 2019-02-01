/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivipaperisakset.vastustajat;

import kivipaperisakset.vastustajat.VastustajanEdellinenValinta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sovu
 */
public class VastustajanEdellinenValintaTest {
    VastustajanEdellinenValinta vastustaja;
    
    public VastustajanEdellinenValintaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        vastustaja = new VastustajanEdellinenValinta();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void valitseeAluksiSakset() {
        assertTrue(vastustaja.valitse() == 2);
    }
    
    @Test
    public void valitseePaperinVastaanottamisenJalkeenSakset() {
        vastustaja.vastaanotaValinta(1);
        assertTrue(vastustaja.valitse() == 2);
    }
    
    @Test
    public void valitseeSaksienVastaanottamisenJalkeenKiven() {
        vastustaja.vastaanotaValinta(2);
        assertTrue(vastustaja.valitse() == 0);
    }
    
    @Test
    public void valitseeKivenVastaanottamisenJalkeenPaperin() {
        vastustaja.vastaanotaValinta(0);
        assertTrue(vastustaja.valitse() == 1);
    }
}
