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
import uesocc.ingenieria.pojosMantenimiento.Responsable;

/**
 *
 * @author sergio
 */
public class ResponsableRawResourceClient {
    Client cliente;
    WebTarget raiz;
    
    private final static String URL_RESOURCE = "http://localhost:8080/mantenimiento-war/ws/SistemaOperativo";
    public ResponsableRawResourceClient(){
        this.cliente = ClientBuilder.newClient();
        this.raiz = cliente.target(URL_RESOURCE);
    }

    public URI CrearResponsable(Responsable responsable) {
        //JSONArray jsonMantenimiento = new JSONArray();     
        if (responsable!=null ) {  
            Response respuesta = raiz.path("responsableraw").request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(responsable.toString(), MediaType.APPLICATION_JSON));
            if (respuesta!= null && respuesta.getStatus()==Response.Status.CREATED.getStatusCode()) {
                
                return respuesta.getLocation();
            }
        }  
    return null;
    }
    
    
}
