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
import uesocc.ingenieria.pojosMantenimiento.Equipo;

/**
 *
 * @author sergio
 */
public class EquipoRawResourceClientTest {
    
    public EquipoRawResourceClientTest() {
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
     * Test of CrearEquipo method, of class EquipoRawResourceClient.
     */
    @Test
    public void testCrearEquipo() throws Exception {
        System.out.println("CrearEquipo");
        Equipo equipo = null;
        EquipoRawResourceClient instance = new EquipoRawResourceClient();
        URI expResult = null;
        URI result = instance.CrearEquipo(equipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
