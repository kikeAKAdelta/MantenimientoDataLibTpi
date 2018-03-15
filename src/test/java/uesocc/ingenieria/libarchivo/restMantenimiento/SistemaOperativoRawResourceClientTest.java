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
import uesocc.ingenieria.pojosMantenimiento.SistemaOperativo;

/**
 *
 * @author sergio
 */
public class SistemaOperativoRawResourceClientTest {
    static Client cliente;
    static WebTarget raiz;
    public SistemaOperativoRawResourceClientTest() {
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
     * Test of CrearSistema method, of class SistemaOperativoRawResourceClient.
     */
    @Test
    public void testCrearSistema() throws Exception {
       System.out.println("CrearMarca");
        SistemaOperativo nombre = new SistemaOperativo();
        nombre.setId_sistemaOperativo(1);
        nombre.setLicencia(true);
        nombre.setSistemaOperativo("Windows");
        nombre.setVersion("7");
        
        SistemaOperativoRawResourceClient marca = Mockito.mock(SistemaOperativoRawResourceClient.class);
        Mockito.when(marca.CrearSistema(nombre)).thenReturn(raiz.getUri());
        System.out.println(marca.CrearSistema(nombre));
        assertEquals(raiz.getUri(), marca.CrearSistema(nombre));
    }
    
}
