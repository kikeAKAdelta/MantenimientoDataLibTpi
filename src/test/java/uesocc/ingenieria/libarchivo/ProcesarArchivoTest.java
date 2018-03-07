/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo;


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
public class ProcesarArchivoTest {
    
    public ProcesarArchivoTest() {
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
     * Test of validarArchivo method, of class ProcesarArchivo.
     */
    @org.junit.Test
    public void testValidarArchivo() {
        System.out.println("validarArchivo");
        String path = "src/test/sources/newfile.txt";
        
        ProcesarArchivo instance = new ProcesarArchivo();
        boolean expResult = false;
        boolean result = instance.validar(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LeerArchivo method, of class ProcesarArchivo.
     */
    @Test
    public void testLeerArchivo() {
        System.out.println("LeerArchivo");
        String path = "src/test/sources/newfile.txt";
        ProcesarArchivo instance = new ProcesarArchivo();
        boolean expResult = false;
        //ArrayList<Object> resultado = instance.LeerArchivo(path);
        //boolean result = resultado.isEmpty();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
