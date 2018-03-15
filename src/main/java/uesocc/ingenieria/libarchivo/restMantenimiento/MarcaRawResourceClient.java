/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo.restMantenimiento;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import uesocc.ingenieria.pojosMantenimiento.Marca;

/**
 *
 * @author sergio
 */

public class MarcaRawResourceClient {
    Client cliente;
    WebTarget raiz;
    private final static String URL_RESOURCE = "http://localhost:8080/mantenimiento-war/ws/Marca";
    public MarcaRawResourceClient(){
        this.cliente = ClientBuilder.newClient();
        this.raiz = cliente.target(URL_RESOURCE);
    }
    public URI CrearMarca(Marca nombre) throws JSONException{
        //JSONArray jsonMantenimiento = new JSONArray();     
        if (nombre!=null ) {  
            Response respuesta = raiz.request().post(Entity.entity(nombre.toString(), MediaType.APPLICATION_JSON_TYPE));
            
            if (respuesta!=null && respuesta.getStatus()==Response.Status.CREATED.getStatusCode()) {
                
                return respuesta.getLocation();
            }
        }  
    return null;
    }
}
