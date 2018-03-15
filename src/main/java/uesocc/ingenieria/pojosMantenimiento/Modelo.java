/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.pojosMantenimiento;

/**
 *
 * @author ricky
 */
public class Modelo {
    private int id_modelo;
    private String modelo;

    public Modelo(){
        
    }
    
    public Modelo(int id_modelo, String modelo) {
        this.id_modelo = id_modelo;
        this.modelo = modelo;
    }
    @Override
    public String toString(){
        return "Modelo [id="+id_modelo+", Modelo="+modelo+"]";
    
    }
    

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
