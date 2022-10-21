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
public class aereropuertoDTO {

    public aereropuertoDTO() {
    }
    
    private String nombre_aereopuerto;
    private String estado;

    public aereropuertoDTO(String nombre_aereopuerto, String estado) {
        this.nombre_aereopuerto = nombre_aereopuerto;
        this.estado = estado;
    }

    public String getNombre_aereopuerto() {
        return nombre_aereopuerto;
    }

    public void setNombre_aereopuerto(String nombre_aereopuerto) {
        this.nombre_aereopuerto = nombre_aereopuerto;
    }

  

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
