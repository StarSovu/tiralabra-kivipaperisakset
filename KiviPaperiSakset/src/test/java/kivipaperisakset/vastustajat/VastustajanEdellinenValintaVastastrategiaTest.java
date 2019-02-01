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
 *
 * @author sovu
 */
public class VastustajanEdellinenValintaVastastrategiaTest {
    VastustajanEdellinenValintaVastastrategia vastustaja;
    
    public VastustajanEdellinenValintaVastastrategiaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        vastustaja = new VastustajanEdellinenValintaVastastrategia();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void valitseeAluksiKiven() {
        assertTrue(vastustaja.valitse() == 0);
    }
    
    @Test
    public void valitseeToisenaSakset() {
        vastustaja.valitse();
        assertTrue(vastustaja.valitse() == 2);
    }
    
    @Test
    public void valitseeKolmantenaPaperin() {
        vastustaja.valitse();
        vastustaja.valitse();
        assertTrue(vastustaja.valitse() == 1);
    }
}
