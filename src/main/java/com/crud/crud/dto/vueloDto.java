/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.dto;

import java.util.Date;

/**
 *
 * @author conco
 */
public class vueloDto {
    
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

    public vueloDto() {
    }

    public vueloDto(int id_vuelo, String origen, String destino, Date hora_salida, Date hora_llegada, float costo_asientos, String estado_vuelo, String usuario_crea, String usuario_modifica, int id_avion, int id_tripulacion) {
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
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Date getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(Date hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public float getCosto_asientos() {
        return costo_asientos;
    }

    public void setCosto_asientos(float costo_asientos) {
        this.costo_asientos = costo_asientos;
    }

    public String getEstado_vuelo() {
        return estado_vuelo;
    }

    public void setEstado_vuelo(String estado_vuelo) {
        this.estado_vuelo = estado_vuelo;
    }

    public String getUsuario_crea() {
        return usuario_crea;
    }

    public void setUsuario_crea(String usuario_crea) {
        this.usuario_crea = usuario_crea;
    }

    public String getUsuario_modifica() {
        return usuario_modifica;
    }

    public void setUsuario_modifica(String usuario_modifica) {
        this.usuario_modifica = usuario_modifica;
    }

    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    public int getId_tripulacion() {
        return id_tripulacion;
    }

    public void setId_tripulacion(int id_tripulacion) {
        this.id_tripulacion = id_tripulacion;
    }
    
    
    
    
}
