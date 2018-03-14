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
public class SistemaOperativo {
    public int id_sistemaOperativo;
    public String sistemaOperativo;
    public String version;
    public boolean licencia;

    public SistemaOperativo(int id_sistemaOperativo, String sistemaOperativo, String version, boolean licencia) {
        this.id_sistemaOperativo = id_sistemaOperativo;
        this.sistemaOperativo = sistemaOperativo;
        this.version = version;
        this.licencia = licencia;
    }

    public int getId_sistemaOperativo() {
        return id_sistemaOperativo;
    }

    public void setId_sistemaOperativo(int id_sistemaOperativo) {
        this.id_sistemaOperativo = id_sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }
    
    
    
    
}
