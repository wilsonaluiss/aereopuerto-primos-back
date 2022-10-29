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
@Table(name = "tripulacion", schema = "public")
public class TripulacionModel implements java.io.Serializable {
    
    private int idTripulacion;
    private int idUsuario;
    private int idAereolinea;
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_tripulacion", unique = true, nullable = false)

    public int getIdTripulacion() {
        return idTripulacion;
    }

    public void setIdTripulacion(int idTripulacion) {
        this.idTripulacion = idTripulacion;
    }

    @Column(name = "id_usuario")
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Column(name = "id_aereolinea")
    public int getIdAereolinea() {
        return idAereolinea;
    }

    public void setIdAereolinea(int idAereolinea) {
        this.idAereolinea = idAereolinea;
    }
    
    
    
}
