/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo;

import java.net.URI;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergio
 */
public class MantenimientoRawResourceClientTest {
    
    public MantenimientoRawResourceClientTest() {
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
     * Test of CrearMantenimiento method, of class MantenimientoRawResourceClient.
     */
    @Test
    public void testCrearMantenimiento() throws Exception {
        System.out.println("CrearMantenimiento");
        List<List<String>> lista = null;
        MantenimientoRawResourceClient instance = new MantenimientoRawResourceClient();
        URI expResult = null;
        URI result = instance.CrearMantenimiento(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
