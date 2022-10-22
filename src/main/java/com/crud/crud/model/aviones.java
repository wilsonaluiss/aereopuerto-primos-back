/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

/**
 *
 * @author conco
 */

@Entity
@Builder
@Table(name ="aviones", schema = "public")
public class aviones implements java.io.Serializable {
    private int id_avion;
    private String no_placa; 
    private int capacidad_asientos;
    private String estado_avion;
    private String dimensiones;
    private int id_aereolinea;
    private int id_aereopuerto;

    public aviones() {
    }

    public aviones(int id_avion, String no_placa, int capacidad_asientos, String estado_avion, String dimensiones, int id_aereolinea, int id_aereopuerto) {
        this.id_avion = id_avion;
        this.no_placa = no_placa;
        this.capacidad_asientos = capacidad_asientos;
        this.estado_avion = estado_avion;
        this.dimensiones = dimensiones;
        this.id_aereolinea = id_aereolinea;
        this.id_aereopuerto = id_aereopuerto;
    }

     @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_avion", unique = true, nullable = false)
    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    
    @Column(name = "no_placa", nullable = false)
    public String getNo_placa() {
        return no_placa;
    }

    public void setNo_placa(String no_placa) {
        this.no_placa = no_placa;
    }
    
@Column(name = "capacidad_asientos", nullable = false)
    public int getCapacidad_asientos() {
        return capacidad_asientos;
    }

    

    public void setCapacidad_asientos(int capacidad_asientos) {
        this.capacidad_asientos = capacidad_asientos;
    }

    @Column(name = "estado_avion", nullable = false)
    public String getEstado_avion() {
        return estado_avion;
    }

    
    public void setEstado_avion(String estado_avion) {
        this.estado_avion = estado_avion;
    }

    @Column(name = "dimensiones", nullable = false)
    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Column(name = "id_aereolinea", nullable = false)
    public int getId_aereolinea() {
        return id_aereolinea;
    }

    public void setId_aereolinea(int id_aereolinea) {
        this.id_aereolinea = id_aereolinea;
    }

    @Column(name = "id_aereopuerto", nullable = false)
    public int getId_aereopuerto() {
        return id_aereopuerto;
    }

    public void setId_aereopuerto(int id_aereopuerto) {
        this.id_aereopuerto = id_aereopuerto;
    }
    
    
  
    
    
    
    
}
