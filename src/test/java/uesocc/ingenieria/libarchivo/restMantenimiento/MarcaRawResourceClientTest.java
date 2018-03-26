/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo.restMantenimiento;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author enrique
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ClientBuilder.class)
public class MarcaRawResourceClientTest {
    
    
    final Client mockClient = Mockito.mock(Client.class);
    final Response mockResponse = Mockito.mock(Response.class);
    
    public MarcaRawResourceClientTest() {
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

    

    @Before
    public void inicializar() throws URISyntaxException {

        Mockito.when(this.mockResponse.getStatus()).thenReturn(Response.Status.CREATED.getStatusCode());
        Mockito.when(this.mockResponse.getLocation()).thenReturn(new URI("http://localhost:8080/mantenimiento/ws/marca"));
        final Invocation.Builder mockBuilder = Mockito.mock(Invocation.Builder.class);
        Mockito.when(mockBuilder.post(Matchers.any())).thenReturn(this.mockResponse);

        final WebTarget mockWebTarget = Mockito.mock(WebTarget.class);
        Mockito.when(mockWebTarget.path(Matchers.anyString())).thenReturn(mockWebTarget);
        Mockito.when(mockWebTarget.request(MediaType.APPLICATION_JSON)).thenReturn(mockBuilder);

        Mockito.when(this.mockClient.target(Matchers.anyString())).thenReturn(mockWebTarget);

        PowerMockito.mockStatic(ClientBuilder.class);
        PowerMockito.when(ClientBuilder.newClient()).thenReturn(mockClient);
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

        List<List<String>> lista = new ArrayList<List<String>>();
        
        List<String> sublista=new ArrayList<String>();
        
        lista.add(sublista);
        lista.get(0).add("objeto 1");
        lista.get(0).add("objeto 2");
        
        
        MarcaRawResourceClient instance = new MarcaRawResourceClient();
        URI expResult = URI.create("http://localhost:8080/mantenimiento/ws/marca");
        URI result = instance.crearMarca(lista);
        
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
