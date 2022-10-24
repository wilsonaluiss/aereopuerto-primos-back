/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Builder;

/**
 *
 * @author Wilson
 */
@Entity
@Builder
@Table(name = "vuelo", schema = "public")
public class VueloModel implements java.io.Serializable{
    
    private int id_vuelo;
    private String origen;
    private String destino;
    private Date hora_salida;
    private Date hora_llegada;
    private float costo_asientos;
    private String estado_vuelo;
    private String usuario_crea;
    private String usuario_modifica;
    private int	id_avion;
    private int	id_tripulacion;
    private int id_cliente;

    public VueloModel() {
    }

    public VueloModel(int id_vuelo, String origen, String destino, Date hora_salida, Date hora_llegada, float costo_asientos, String estado_vuelo, String usuario_crea, String usuario_modifica, int id_avion, int id_tripulacion, int id_cliente) {
        this.id_vuelo = id_vuelo;
        this.origen = origen;
        this.destino = destino;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.costo_asientos = costo_asientos;
        this.estado_vuelo = estado_vuelo;
        this.usuario_crea = usuario_crea;
        this.usuario_modifica = usuario_modifica;
        this.id_avion = id_avion;
        this.id_tripulacion = id_tripulacion;
        this.id_cliente = id_cliente;
    }

    

   

      @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_vuelo", unique = true, nullable = false)
    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    @Column(name = "origen", nullable = false)
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
@Column(name = "destino", nullable = false)
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

   
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
    }
 
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(Date hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    @Column(name = "costo_asiento", nullable = false)
    public float getCosto_asientos() {
        return costo_asientos;
    }

    public void setCosto_asientos(float costo_asientos) {
        this.costo_asientos = costo_asientos;
    }

    @Column(name = "estado_vuelo", nullable = false)
    public String getEstado_vuelo() {
        return estado_vuelo;
    }

    public void setEstado_vuelo(String estado_vuelo) {
        this.estado_vuelo = estado_vuelo;
    }

    @Column(name = "usuario_crea", nullable = false)
    public String getUsuario_crea() {
        return usuario_crea;
    }

    public void setUsuario_crea(String usuario_crea) {
        this.usuario_crea = usuario_crea;
    }

    @Column(name = "usuario_modifica", nullable = false)
    public String getUsuario_modifica() {
        return usuario_modifica;
    }

    public void setUsuario_modifica(String usuario_modifica) {
        this.usuario_modifica = usuario_modifica;
    }

    @Column(name = "id_avion", nullable = false)
    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    @Column(name = "id_tripulacion", nullable = false)
    public int getId_tripulacion() {
        return id_tripulacion;
    }

    public void setId_tripulacion(int id_tripulacion) {
        this.id_tripulacion = id_tripulacion;
    }

   

    
    
    
    
}
