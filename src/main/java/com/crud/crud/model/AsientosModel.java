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
@Table(name ="asientos", schema = "public")
public class AsientosModel implements java.io.Serializable{
    
    
    private int id_asiento;
    private String nombre_asiento;
    private int	id_avion;
    private int id_estado;

    public AsientosModel() {
    }

    public AsientosModel(int id_asiento, String nombre_asiento, int id_avion, int id_estado) {
        this.id_asiento = id_asiento;
        this.nombre_asiento = nombre_asiento;
        this.id_avion = id_avion;
        this.id_estado = id_estado;
    }

    

    
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_asiento", unique = true, nullable = false)
    public int getId_asiento() {
        return id_asiento;
    }

    public void setId_asiento(int id_asiento) {
        this.id_asiento = id_asiento;
    }

    
      @Column(name = "nombre_asiento", nullable = false)
    public String getNombre_asiento() {
        return nombre_asiento;
    }

    public void setNombre_asiento(String nombre_asiento) {
        this.nombre_asiento = nombre_asiento;
    }

   
  @Column(name = "id_avion", nullable = false)
    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    
    @Column(name = "id_estado", nullable = false)
     public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }
    
    
   
    
    
 

    
        
    
    
    
    


    
    
    
    
}
