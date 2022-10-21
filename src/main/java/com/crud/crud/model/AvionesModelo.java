/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author Wilson
 */
@Entity
@Builder
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@Table(name = "aviones", schema = "public")
public class AvionesModelo implements java.io.Serializable {
    
    private int idAvion;
    private String noPlaca;
    private int capacidadAsientos;
    private String estadoAvion;
    private String dimensiones;
    private int	idAereolinea;
    private int idAereopuerto;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_avion", unique = true, nullable = false)
    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    @Column(name = "no_placa")
    public String getNoPlaca() {
        return noPlaca;
    }

    public void setNoPlaca(String noPlaca) {
        this.noPlaca = noPlaca;
    }

    @Column(name = "capacidad_asientos")
    public int getCapacidadAsientos() {
        return capacidadAsientos;
    }

    public void setCapacidadAsientos(int capacidadAsientos) {
        this.capacidadAsientos = capacidadAsientos;
    }

    @Column(name = "estado_avion")
    public String getEstadoAvion() {
        return estadoAvion;
    }

    public void setEstadoAvion(String estadoAvion) {
        this.estadoAvion = estadoAvion;
    }

    @Column(name = "dimensiones")
    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Column(name = "id_aereolinea")
    public int getIdAereolinea() {
        return idAereolinea;
    }

    public void setIdAereolinea(int idAereolinea) {
        this.idAereolinea = idAereolinea;
    }

    @Column(name = "id_aereopuerto")
    public int getIdAereopuerto() {
        return idAereopuerto;
    }

    public void setIdAereopuerto(int idAereopuerto) {
        this.idAereopuerto = idAereopuerto;
    }
    
    
}
