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
import static uesocc.ingenieria.libarchivo.restMantenimiento.ModeloRawResourceClientTest.cliente;
import uesocc.ingenieria.pojosMantenimiento.Responsable;

/**
 *
 * @author sergio
 */
public class ResponsableRawResourceClientTest {
    static Client cliente;
    static WebTarget raiz;
    public ResponsableRawResourceClientTest() {
         cliente = ClientBuilder.newClient();
        raiz = cliente.target("http://localhost:8080/mantenimiento-war/ws/Marca");
        
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
    public void testCrearResponsable() throws Exception {
       System.out.println("CrearMarca");
        Responsable nombre = new Responsable();
        nombre.setId_responsable(0);
        nombre.setResponsable("dell");
        
        ResponsableRawResourceClient marca = Mockito.mock(ResponsableRawResourceClient.class);
        Mockito.when(marca.CrearResponsable(nombre)).thenReturn(raiz.getUri());
        System.out.println(marca.CrearResponsable(nombre));
        assertEquals(raiz.getUri(), marca.CrearResponsable(nombre));
    }
    
}
