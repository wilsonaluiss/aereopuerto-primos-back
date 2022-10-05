/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author conco
 */

@Entity
@Table(name ="aereopuerto", schema = "public")
public class aereopuerto {
     @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_aereopuerto;
     
     @Column
     private String nombre_aereopuerto;
     
     @Column
     private String ubicacion_aereopuerto;
     
     @Column
     private String estado;

    public int getId_aereopuerto() {
        return id_aereopuerto;
    }

    public void setId_aereopuerto(int id_aereopuerto) {
        this.id_aereopuerto = id_aereopuerto;
    }

    

    public String getNombre_aereopuerto() {
        return nombre_aereopuerto;
    }

    public void setNombre_aereopuerto(String nombre_aereopuerto) {
        this.nombre_aereopuerto = nombre_aereopuerto;
    }

    public String getUbicacion_aereopuerto() {
        return ubicacion_aereopuerto;
    }

    public void setUbicacion_aereopuerto(String ubicacion_aereopuerto) {
        this.ubicacion_aereopuerto = ubicacion_aereopuerto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
     
    
}
