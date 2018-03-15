/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo.restMantenimiento;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONException;
import uesocc.ingenieria.pojosMantenimiento.Equipo;

/**
 *
 * @author sergio
 */
public class EquipoRawResourceClient {
    Client cliente;
    WebTarget raiz;
    private final static String URL_RESOURCE = "http://localhost:8080/mantenimiento-war/ws/Equipo";
    public EquipoRawResourceClient(){
        this.cliente = ClientBuilder.newClient();
        this.raiz = cliente.target(URL_RESOURCE);
    }
   
    public URI CrearEquipo(Equipo equipo) throws JSONException{
        //JSONArray jsonMantenimiento = new JSONArray();     
        if (equipo!=null ) {  
            Response respuesta = raiz.path("equiporaw").request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(equipo.toString(), MediaType.APPLICATION_JSON));
            if (respuesta!= null && respuesta.getStatus()==Response.Status.CREATED.getStatusCode()) {
                
                return respuesta.getLocation();
            }
        }  
    return null;
    }
    
    
    
}
