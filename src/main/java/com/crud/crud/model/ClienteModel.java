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
@Table(name = "clientes", schema = "public")
public class ClienteModel implements java.io.Serializable {

    private int idClientes;
    private String pasaporteClientes;
    private String nombreCliente;
    private String emailCliente;
    private String telefonoCliente;
    private String telEmergenciaCliente;
    private String direccionCliente;
    private int idRol;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_clientes", unique = true, nullable = false)
    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    @Column(name = "pasaporte_clientes", nullable = false)
    public String getPasaporteClientes() {
        return pasaporteClientes;
    }

    public void setPasaporteClientes(String pasaporteClientes) {
        this.pasaporteClientes = pasaporteClientes;
    }

    @Column(name = "nombre_cliente")
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Column(name = "email_cliente")
    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Column(name = "telefono_cliente")
    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    @Column(name = "tel_emergencia_cliente")
    public String getTelEmergenciaCliente() {
        return telEmergenciaCliente;
    }

    public void setTelEmergenciaCliente(String telEmergenciaCliente) {
        this.telEmergenciaCliente = telEmergenciaCliente;
    }

    @Column(name = "direccion_cliente")
    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    @Column(name = "id_rol")
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

}
