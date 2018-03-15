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
    public Marca[] ObtenerMarca(){
        Response respuesta = cliente.target(URL_RESOURCE).request().get();
        if (respuesta!=null && respuesta.getStatus()==Response.Status.OK.getStatusCode()) {
            Marca[] lista = respuesta.readEntity(Marca[].class);
            return lista;
        }
        return null;
    
    }
    
    public URI CrearMarca(Marca nombre) throws JSONException{
        //JSONArray jsonMantenimiento = new JSONArray();     
        if (nombre!=null ) {  
            Response respuesta = raiz.path("marcaraw").request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(nombre.toString(), MediaType.APPLICATION_JSON));
            if (respuesta!= null && respuesta.getStatus()==Response.Status.CREATED.getStatusCode()) {
                
                return respuesta.getLocation();
            }
        }  
    return null;
    }
    
    public URI ActualizarMarca(Marca marca){
        if (marca!=null) {
            Response respuesta = raiz.request(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON).put(Entity.entity(marca.toString(), MediaType.APPLICATION_JSON));
            if (respuesta !=null && respuesta.getStatus()==Response.Status.CREATED.getStatusCode()) {
                return respuesta.getLocation();
            }
        } 
        return null;
    
    }
    public void EliminarMarca(int id) {
    Response response = cliente.target(URL_RESOURCE).path(String.valueOf(id)).request().delete();
    System.out.println("Status code:" + response.getStatus());
  }
    
}
