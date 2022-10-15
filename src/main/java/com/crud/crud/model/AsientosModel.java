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
@Table(name = "asientos", schema = "public")
public class AsientosModel implements java.io.Serializable{
    
    
    private int idAsiento;
    private String nombreAsiento;
    private String ubicacionAsiento;
    private int	idAvion;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_asiento", unique = true, nullable = false)
    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    @Column(name = "nombre_asiento")
    public String getNombreAsiento() {
        return nombreAsiento;
    }

    public void setNombreAsiento(String nombreAsiento) {
        this.nombreAsiento = nombreAsiento;
    }

    @Column(name = "ubicacion_asiento")
    public String getUbicacionAsiento() {
        return ubicacionAsiento;
    }

    public void setUbicacionAsiento(String ubicacionAsiento) {
        this.ubicacionAsiento = ubicacionAsiento;
    }

    @Column(name = "id_avion")
    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }
    
    
}
