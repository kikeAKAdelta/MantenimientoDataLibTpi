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
import uesocc.ingenieria.pojosMantenimiento.Modelo;

/**
 *
 * @author sergio
 */
public class ModeloRawResourceClientTest {
    static Client cliente;
    static WebTarget raiz;
    public ModeloRawResourceClientTest() {
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
     * Test of CrearModelo method, of class ModeloRawResourceClient.
     */
    @Test
    public void testCrearModelo() throws Exception {
       System.out.println("CrearMarca");
        Modelo nombre = new Modelo();
        nombre.setId_modelo(1);
        nombre.setModelo("dell");
        
        ModeloRawResourceClient marca = Mockito.mock(ModeloRawResourceClient.class);
        Mockito.when(marca.CrearModelo(nombre)).thenReturn(raiz.getUri());
        System.out.println(marca.CrearModelo(nombre));
        assertEquals(raiz.getUri(), marca.CrearModelo(nombre));
    }
    
}
