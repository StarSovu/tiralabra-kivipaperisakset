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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void vastustajaTestausta() {
        vastustaja.algoritminEdellinen = 1;
        vastustaja.algoritminToiseksiEdellinen = 1;
        vastustaja.vastustajanEdellinen = 1;
        vastustaja.vastustajanToiseksiEdellinen = 1;
        vastustaja.paivitaEdellisetValinnat();
        assertTrue(vastustaja.aiemmatValinnat[0][0][0] == 1);
    }
}
