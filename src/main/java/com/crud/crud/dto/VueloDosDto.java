/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Wilson
 */

@Entity
public class VueloDosDto implements Serializable{
    
    private int id_asiento;
    private String origen;
    private String destino;
    private Date horaSalida;
    private Date horaLlegada;
    private String  ubicacionAsiento;
    private String noPlaca;

    public VueloDosDto() {
    }

    public VueloDosDto(int id_asiento, String origen, String destino, Date horaSalida, Date horaLlegada, String ubicacionAsiento, String noPlaca) {
        this.id_asiento = id_asiento;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.ubicacionAsiento = ubicacionAsiento;
        this.noPlaca = noPlaca;
    }

    @Id
    public int getIdAsiento() {
        return id_asiento;
    }

    public void setIdAsiento(int idVuelo) {
        this.id_asiento = idVuelo;
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

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getUbicacionAsiento() {
        return ubicacionAsiento;
    }

    public void setUbicacionAsiento(String ubicacionAsiento) {
        this.ubicacionAsiento = ubicacionAsiento;
    }

    public String getNoPlaca() {
        return noPlaca;
    }

    public void setNoPlaca(String numeroPlaca) {
        this.noPlaca = numeroPlaca;
    }

    @Override
    public String toString() {
        return "VueloDosDto{" + "id_asiento=" + id_asiento + ", origen=" + origen + ", destino=" + destino + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + ", ubicacionAsiento=" + ubicacionAsiento + ", noPlaca=" + noPlaca + '}';
    }

    

    
    

  
    
    
    
}
