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
        String content = "esto, es, una, prueba";
        File tempfile = DirPrueba.newFile("prueba.csv");
        try (FileWriter fw = new FileWriter(tempfile.getAbsolutePath()); PrintWriter pw = new PrintWriter(fw)) {
            pw.println(content);
        }    
        System.out.println(tempfile);
        System.out.println("Url Folder de prueba " + DirPrueba.getRoot().toString());
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
        boolean result = instance.Validar(path);
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
        List<String> result = instance.ObtenerCSV(path);
        //System.out.println(result.get(0));
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
        String path = DirPrueba.getRoot().toString();
        boolean saltarLinea = false;
        String separador = ",";
        ProcesarArchivo instance = new ProcesarArchivo();
        List<List<String>> expResult = new ArrayList<>();
        List<String> parse = new ArrayList<>();
        parse.add("esto");
        parse.add(" es");
        parse.add(" una");
        parse.add(" prueba");
        expResult.add(parse);
        List<List<String>> result = instance.Parser(path+"/prueba.csv", saltarLinea, separador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
