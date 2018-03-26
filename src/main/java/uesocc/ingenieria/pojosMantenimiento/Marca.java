/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.pojosMantenimiento;

/**
 *
 * @author sergio
 */
public class Marca {
    private int id_marca;
    private String Marca;

    public Marca(){
        
    }
    
    public Marca(int id_marca, String Marca) {
        this.id_marca = id_marca;
        this.Marca = Marca;
    }

    @Override
    public String toString() {	
        return "Marca [id="+id_marca+", Marca='"+Marca + "']";	
    }
    
    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
}
