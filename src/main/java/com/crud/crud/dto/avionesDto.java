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
public class avionesDto {
   
    private int id_avion;
    private String no_placa;
    private int capacidad_asientos;
    private String estado_avion;
    private String dimensiones;
    private int id_aereolinea;
    private int id_aereopuerto;

    public avionesDto() {
    }

    public avionesDto(String no_placa, int capacidad_asientos, String estado_avion, String dimensiones, int id_aereolinea, int id_aereopuerto) {
        this.no_placa = no_placa;
        this.capacidad_asientos = capacidad_asientos;
        this.estado_avion = estado_avion;
        this.dimensiones = dimensiones;
        this.id_aereolinea = id_aereolinea;
        this.id_aereopuerto = id_aereopuerto;
    }

    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    public String getNo_placa() {
        return no_placa;
    }

    public void setNo_placa(String no_placa) {
        this.no_placa = no_placa;
    }


    public int getCapacidad_asientos() {
        return capacidad_asientos;
    }

    public void setCapacidad_asientos(int capacidad_asientos) {
        this.capacidad_asientos = capacidad_asientos;
    }

    public String getEstado_avion() {
        return estado_avion;
    }

    public void setEstado_avion(String estado_avion) {
        this.estado_avion = estado_avion;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getId_aereolinea() {
        return id_aereolinea;
    }

    public void setId_aereolinea(int id_aereolinea) {
        this.id_aereolinea = id_aereolinea;
    }

    public int getId_aereopuerto() {
        return id_aereopuerto;
    }

    public void setId_aereopuerto(int id_aereopuerto) {
        this.id_aereopuerto = id_aereopuerto;
    }
    
    
}
