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
import uesocc.ingenieria.pojosMantenimiento.SistemaOperativo;

/**
 *
 * @author sergio
 */
public class SistemaOperativoRawResourceClientTest {
    
    public SistemaOperativoRawResourceClientTest() {
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
     * Test of CrearSistema method, of class SistemaOperativoRawResourceClient.
     */
    @Test
    public void testCrearSistema() throws Exception {
        System.out.println("CrearSistema");
        SistemaOperativo sistema = null;
        SistemaOperativoRawResourceClient instance = new SistemaOperativoRawResourceClient();
        URI expResult = null;
        URI result = instance.CrearSistema(sistema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
