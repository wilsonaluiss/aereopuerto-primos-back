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
    
    private int idVuelo;
    private String origen;
    private String destino;
    private Date horaSalida;
    private Date horaLlegada;
    private float costoAsientos;
    private String estadoVuelo;
    private String usuarioCrea;
    private String usuarioModifica;
    private int	idAvion;
    private int	idTripulacion;

    public VueloModel() {
    }

    public VueloModel(int idVuelo, String origen, String destino, Date horaSalida, Date horaLlegada, float costoAsientos, String estadoVuelo, String usuarioCrea, String usuarioModifica, int idAvion, int idTripulacion) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.costoAsientos = costoAsientos;
        this.estadoVuelo = estadoVuelo;
        this.usuarioCrea = usuarioCrea;
        this.usuarioModifica = usuarioModifica;
        this.idAvion = idAvion;
        this.idTripulacion = idTripulacion;
    }

    
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_vuelo", unique = true, nullable = false)
    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    @Column(name = "origen",nullable = false)
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Column(name = "destino",nullable = false)
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "horaSalida",nullable = false)
    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "horaLlegada",nullable = false)
    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @Column(name = "costoAsientos",nullable = false)
    public float getCostoAsientos() {
        return costoAsientos;
    }

    public void setCostoAsientos(float costoAsientos) {
        this.costoAsientos = costoAsientos;
    }

    @Column(name = "estadoVuelo",nullable = false)
    public String getEstadoVuelo() {
        return estadoVuelo;
    }

    public void setEstadoVuelo(String estadoVuelo) {
        this.estadoVuelo = estadoVuelo;
    }

    @Column(name = "usuarioCrea",nullable = false)
    public String getUsuarioCrea() {
        return usuarioCrea;
    }

    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
    }

    @Column(name = "usuarioModifica",nullable = false)
    public String getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    @Column(name = "idAvion",nullable = false)
    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    @Column(name = "idTripulacion",nullable = false)
    public int getIdTripulacion() {
        return idTripulacion;
    }

    public void setIdTripulacion(int idTripulacion) {
        this.idTripulacion = idTripulacion;
    }

    
    
    
    
}
