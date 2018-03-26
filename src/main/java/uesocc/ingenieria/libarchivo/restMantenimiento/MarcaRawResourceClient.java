/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo.restMantenimiento;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONObject;
//import org.codehaus.jettison.json.JSONArray;
import uesocc.ingenieria.pojosMantenimiento.Marca;

/**
 *
 * @author sergio
 */

public class MarcaRawResourceClient {
    Client cliente;
    WebTarget raiz;
    private final static String URL_RESOURCE = "http://localhost:8080/mantenimiento/ws/marca";
    
    public MarcaRawResourceClient(){
        this.cliente = ClientBuilder.newClient();
        this.raiz = cliente.target(URL_RESOURCE);
    }
    
    
    public URI crearMarca(List<List<String>> lista){
        for (List<String> list : lista) {
            for (String elemento : list) {
                JsonObject nuevo=Json.createObjectBuilder().add("marca",elemento).build();
                Response respuesta = raiz.path("marca")
                        .request(MediaType.APPLICATION_JSON)
                        .post(Entity.json(nuevo));
                       
                if (respuesta!=null && respuesta.getStatus()==Response.Status.CREATED.getStatusCode()) {
                         return respuesta.getLocation();
                }
            }
        }
        
        
                
                 
        return null;
    }
}
