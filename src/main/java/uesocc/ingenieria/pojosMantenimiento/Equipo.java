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
public class Equipo {
    private String numero_serie;
    private String numero_inventario;
    private int id_modelo;
    private int id_marca;
    private int id_sistemaOperativo;

    public Equipo(String numero_serie, String numero_inventario, int id_modelo, int id_marca, int id_sistemaOperativo) {
        this.numero_serie = numero_serie;
        this.numero_inventario = numero_inventario;
        this.id_modelo = id_modelo;
        this.id_marca = id_marca;
        this.id_sistemaOperativo = id_sistemaOperativo;
    }

    public Equipo() {}

    public String getNumero_serie() {
        return numero_serie;
    }
    @Override
    public String toString() {
        return "Marca [idSO=" + id_sistemaOperativo + ", idModelo=" + id_modelo + ", idMarca=" + id_marca + ", numero_serie=" + numero_serie + ", numero_inventario=" + numero_inventario +"]";
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getNumero_inventario() {
        return numero_inventario;
    }

    public void setNumero_inventario(String numero_inventario) {
        this.numero_inventario = numero_inventario;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getId_sistemaOperativo() {
        return id_sistemaOperativo;
    }

    public void setId_sistemaOperativo(int id_sistemaOperativo) {
        this.id_sistemaOperativo = id_sistemaOperativo;
    }
    
    
    
}
