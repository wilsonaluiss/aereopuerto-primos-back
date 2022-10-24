/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.dto;

/**
 *
 * @author conco
 */
public class aereolineaDto {
    
      private int id_aereolinea;
    private String no_patente_comercio;
    private String administrador_aereolinea;
    private String nombre_aereolinea;
    private String estado_aereolinea;

    public aereolineaDto() {
    }

    public aereolineaDto(int id_aereolinea, String no_patente_comercio, String administrador_aereolinea, String nombre_aereolinea, String estado_aereolinea) {
        this.id_aereolinea = id_aereolinea;
        this.no_patente_comercio = no_patente_comercio;
        this.administrador_aereolinea = administrador_aereolinea;
        this.nombre_aereolinea = nombre_aereolinea;
        this.estado_aereolinea = estado_aereolinea;
    }

    public int getId_aereolinea() {
        return id_aereolinea;
    }

    public void setId_aereolinea(int id_aereolinea) {
        this.id_aereolinea = id_aereolinea;
    }

    public String getNo_patente_comercio() {
        return no_patente_comercio;
    }

    public void setNo_patente_comercio(String no_patente_comercio) {
        this.no_patente_comercio = no_patente_comercio;
    }

    public String getAdministrador_aereolinea() {
        return administrador_aereolinea;
    }

    public void setAdministrador_aereolinea(String administrador_aereolinea) {
        this.administrador_aereolinea = administrador_aereolinea;
    }

    public String getNombre_aereolinea() {
        return nombre_aereolinea;
    }

    public void setNombre_aereolinea(String nombre_aereolinea) {
        this.nombre_aereolinea = nombre_aereolinea;
    }

    public String getEstado_aereolinea() {
        return estado_aereolinea;
    }

    public void setEstado_aereolinea(String estado_aereolinea) {
        this.estado_aereolinea = estado_aereolinea;
    }
    
    
    
}
