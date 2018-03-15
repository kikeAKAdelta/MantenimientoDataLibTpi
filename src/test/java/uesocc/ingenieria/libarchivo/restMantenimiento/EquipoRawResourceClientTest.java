/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo.restMantenimiento;

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

import uesocc.ingenieria.pojosMantenimiento.Equipo;


/**
 *
 * @author sergio
 */
public class EquipoRawResourceClientTest {
    static Client cliente;
    static WebTarget raiz;
    public EquipoRawResourceClientTest() {
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
     * Test of CrearEquipo method, of class EquipoRawResourceClient.
     */
    @Test
    public void testCrearEquipo() throws Exception {
        System.out.println("CrearMarca");
        Equipo nombre = new Equipo();
        nombre.setId_marca(1);
        nombre.setId_modelo(1);
        nombre.setId_sistemaOperativo(1);
        nombre.setNumero_inventario("1");
        nombre.setNumero_serie("1");
        EquipoRawResourceClient equipo = Mockito.mock(EquipoRawResourceClient.class);
        Mockito.when(equipo.CrearEquipo(nombre)).thenReturn(raiz.getUri());
        System.out.println(equipo.CrearEquipo(nombre));
        assertEquals(raiz.getUri(), equipo.CrearEquipo(nombre));
    }
    
}
