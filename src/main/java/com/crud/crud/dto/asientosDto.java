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
public class asientosDto {
    
    private int id_asiento;
    private String nombre_asiento;
    private int	id_avion;

    public asientosDto() {
    }

    public asientosDto(int id_asiento, String nombre_asiento, int id_avion) {
        this.id_asiento = id_asiento;
        this.nombre_asiento = nombre_asiento;
        this.id_avion = id_avion;
    }

    public int getId_asiento() {
        return id_asiento;
    }

    public void setId_asiento(int id_asiento) {
        this.id_asiento = id_asiento;
    }

    public String getNombre_asiento() {
        return nombre_asiento;
    }

    public void setNombre_asiento(String nombre_asiento) {
        this.nombre_asiento = nombre_asiento;
    }

    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }
    
    
    
    
    
    
    
    
}
