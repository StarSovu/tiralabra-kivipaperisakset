/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivipaperisakset.vastustajat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tämä testiluokka ei ole edistynyt
 * @author sovu
 */
public class VastustajaTutkijaTest {
    VastustajaTutkija vastustaja;
    
    public VastustajaTutkijaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        vastustaja = new VastustajaTutkija();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void annetaanSamaa() {
        for (int i = 0; i < 5; i++) {
            vastustaja.valitse();
            vastustaja.vastaanotaValinta(1);
        }
        assertTrue(vastustaja.valitse() == 2);
    }
}
