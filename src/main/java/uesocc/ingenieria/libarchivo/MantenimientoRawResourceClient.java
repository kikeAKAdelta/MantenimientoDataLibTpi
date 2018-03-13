/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo;

import java.net.URI;
import java.util.List;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;

/**
 *
 * @author sergio
 */
@Path("/mantenimiento")
public class MantenimientoRawResourceClient {
    Client cliente;
    WebTarget raiz;
    private final static String URL_RESOURCE = "http://localhost:8080/mantenimiento-war/ws/Marca";
    public MantenimientoRawResourceClient(){
        this.cliente = ClientBuilder.newClient();
        this.raiz = cliente.target(URL_RESOURCE);
    }
    
    public URI CrearMantenimiento(List<List<String>> lista) throws JSONException{
        JSONArray jsonMantenimiento = new JSONArray();
        for (List<String> list : lista) {
            for (String string : list) {
                if (lista!=null && string.trim().isEmpty()) {
                    //JsonObject nuevo = Json.createObjectBuilder().add("nombre", string.trim().toUpperCase()).build();
                    jsonMantenimiento.put(new JSONArray(string));
                    Response respuesta = raiz.path("marcajeraw").request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.json(jsonMantenimiento));
                    if (respuesta!= null && respuesta.getStatus()==Response.Status.CREATED.getStatusCode()) {
                        return respuesta.getLocation();
                    }
                }  
            }
        }
        
    return null;
    }
}
