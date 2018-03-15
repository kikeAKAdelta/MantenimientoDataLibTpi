/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo.restMantenimiento;

import java.net.URI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uesocc.ingenieria.pojosMantenimiento.Responsable;

/**
 *
 * @author sergio
 */
public class ResponsableRawResourceClientTest {
    
    public ResponsableRawResourceClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CrearSistema method, of class ResponsableRawResourceClient.
     */
    @Test
    public void testCrearSistema() throws Exception {
        System.out.println("CrearSistema");
        Responsable responsable = null;
        ResponsableRawResourceClient instance = new ResponsableRawResourceClient();
        URI expResult = null;
        URI result = instance.CrearSistema(responsable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
