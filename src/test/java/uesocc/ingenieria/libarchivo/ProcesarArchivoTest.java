/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo;

//import com.sun.xml.internal.stream.buffer.stax.StreamWriterBufferCreator;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

/**
 *
 * @author sergio
 */
public class ProcesarArchivoTest {
    @Rule
    public TemporaryFolder DirPrueba = new  TemporaryFolder();
    @Test
    public void crearArchivosTemp() throws IOException {
        String content = "esto, es, una, prueba", conten1 = "esto, es, otra, prueba";
        File tempfile = DirPrueba.newFile("prueba.csv");
        File tempfile1 = DirPrueba.newFile("prueba1.csv");
        try (FileWriter fw = new FileWriter(tempfile.getAbsolutePath()); PrintWriter pw = new PrintWriter(fw)) {
            pw.println(content);
        }
        try (FileWriter fw = new FileWriter(tempfile1.getAbsolutePath()); PrintWriter pw = new PrintWriter(fw)) {
            pw.println(conten1);
        }
    }
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
     * Test of Validar method, of class ProcesarArchivo.
     */
    @Test
    public void testValidar() {
        System.out.println("Validar");
        String path = DirPrueba.toString();
        ProcesarArchivo instance = new ProcesarArchivo();
        boolean expResult = false;
        boolean result = instance.validar(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ObtenerCSV method, of class ProcesarArchivo.
     */
    @Test
    public void testObtenerCSV() throws Exception {
        System.out.println("ObtenerCSV");
        crearArchivosTemp();
        String path = DirPrueba.getRoot().toString();
        ProcesarArchivo instance = new ProcesarArchivo();
        List<String> expResult = new ArrayList<>();
        expResult.add(path+"/prueba.csv");
        expResult.add(path+"/prueba1.csv");
        List<String> result = instance.obtenerCSV(path);
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Parser method, of class ProcesarArchivo.
     */
    @Test
    public void testParser() throws Exception {
        System.out.println("Parser");
        crearArchivosTemp();
        String paths = DirPrueba.getRoot().toString();
        boolean saltarLinea = false;
        String separador = ",";
        ProcesarArchivo instance = new ProcesarArchivo();
        List<List<String>> expResult = new ArrayList<>();
        List<String> parse = new ArrayList<>();
        List<String> parse1 = new ArrayList<>();
        String[] prueba = {"esto", "es", "una", "prueba"};
        String[] otraPrueba = {"esto", "es", "otra", "prueba"};
        parse.addAll(Arrays.asList(prueba));
        parse1.addAll(Arrays.asList(otraPrueba));
        expResult.add(0, parse);
        expResult.add(1, parse1); 
        List<String> path = instance.obtenerCSV(paths);
        List<List<String>> result = instance.parser(path, saltarLinea, separador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
