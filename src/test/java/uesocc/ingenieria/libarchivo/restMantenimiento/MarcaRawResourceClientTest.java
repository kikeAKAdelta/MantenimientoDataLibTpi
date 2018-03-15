/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo.restMantenimiento;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import uesocc.ingenieria.pojosMantenimiento.Marca;

/**
 *
 * @author sergio
 */
public class MarcaRawResourceClientTest {
    static Client cliente;
    static WebTarget raiz;
    public MarcaRawResourceClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        cliente = ClientBuilder.newClient();
        raiz = cliente.target("http://localhost:8080/mantenimiento-war/ws/Marca");
        
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
     * Test of CrearMarca method, of class MarcaRawResourceClient.
     */
    @Test
    public void testCrearMarca() throws Exception {
        System.out.println("CrearMarca");
        Marca nombre = new Marca();
        nombre.setId_marca(1);
        nombre.setMarca("dell");
        
        MarcaRawResourceClient marca = Mockito.mock(MarcaRawResourceClient.class);
        Mockito.when(marca.CrearMarca(nombre)).thenReturn(raiz.getUri());
        System.out.println(marca.CrearMarca(nombre));
        assertEquals(raiz.getUri(), marca.CrearMarca(nombre));
        
    }
    
}
