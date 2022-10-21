/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.model;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Table;
import lombok.Builder;

/**
 *
 * @author conco
 */

@Entity
@Builder
@Table(name ="aereopuerto", schema = "public")
public class aereopuerto implements java.io.Serializable{
    
     private int id_aereopuerto;
     private String nombre_aereopuerto;
     private String ubicacion_aereopuerto;
     private String estado;

    public aereopuerto() {
    }

    public aereopuerto(int id_aereopuerto, String nombre_aereopuerto, String ubicacion_aereopuerto, String estado) {
        this.id_aereopuerto = id_aereopuerto;
        this.nombre_aereopuerto = nombre_aereopuerto;
        this.ubicacion_aereopuerto = ubicacion_aereopuerto;
        this.estado = estado;
    }
     
     
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_aereopuerto", unique = true, nullable = false) 
    public int getId_aereopuerto() {
        return id_aereopuerto;
    }
    
  
    public void setId_aereopuerto(int id_aereopuerto) {
        this.id_aereopuerto = id_aereopuerto;
    }

    
@Column(name = "nombre_aereopuerto", nullable = false)
    public String getNombre_aereopuerto() {
        return nombre_aereopuerto;
    }

    public void setNombre_aereopuerto(String nombre_aereopuerto) {
        this.nombre_aereopuerto = nombre_aereopuerto;
    }

    @Column(name = "ubicacion_aereopuerto", nullable = false)
    public String getUbicacion_aereopuerto() {
        return ubicacion_aereopuerto;
    }

    public void setUbicacion_aereopuerto(String ubicacion_aereopuerto) {
        this.ubicacion_aereopuerto = ubicacion_aereopuerto;
    }

    @Column(name = "estado", nullable = false)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
     
    
}
