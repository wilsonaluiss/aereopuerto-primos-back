/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.model;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;
import lombok.Builder;

/**
 *
 * @author Wilson
 */
@Entity
@Builder
@Table(name = "bodega", schema = "public")
public class Roles implements java.io.Serializable {

    private int idUsuario;
    private String nombreUsuario;
    private String contrasena;
    private String estadoUsuario;
    private String telefonoUsuario;
    private String direccionUsuario;
    private String usuarioCrea;
    private String usuarioModifica;
    private int idAereopuerto;
    private int idRol;

    public Roles() {
    }

    public Roles(int idUsuario, String nombreUsuario, String contrasena, String estadoUsuario, String telefonoUsuario, String direccionUsuario, String usuarioCrea, String usuarioModifica, int idAereopuerto, int idRol) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.estadoUsuario = estadoUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.direccionUsuario = direccionUsuario;
        this.usuarioCrea = usuarioCrea;
        this.usuarioModifica = usuarioModifica;
        this.idAereopuerto = idAereopuerto;
        this.idRol = idRol;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_usuario", unique = true, nullable = false)
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Column(name = "nombre_usuario", nullable = false)
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Column(name = "contrasena", nullable = false)
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Column(name = "estado_usuario", nullable = false)
    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    @Column(name = "telefono_usuario", nullable = false)
    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    @Column(name = "direccion_usuario", nullable = false)
    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    @Column(name = "usuario_crea", nullable = false)
    public String getUsuarioCrea() {
        return usuarioCrea;
    }

    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
    }

    @Column(name = "usuario_modifica", nullable = false)
    public String getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    @Column(name = "id_aereopuerto", nullable = false)
    public int getIdAereopuerto() {
        return idAereopuerto;
    }

    public void setIdAereopuerto(int idAereopuerto) {
        this.idAereopuerto = idAereopuerto;
    }

    @Column(name = "id_rol", nullable = false)
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

}
