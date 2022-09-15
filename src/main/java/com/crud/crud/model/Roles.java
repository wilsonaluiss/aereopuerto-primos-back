/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.model;


import javax.persistence.*;
@Entity
@Table(name ="usuarios", schema = "public")
/**
 *
 * @author Wilson
 */


public class Roles {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo_usuario;
    
    @Column
    private String nombre_usuario;
    
    @Column
    private String usuario;
    
    @Column
    private String contrasena;
    
    @Column
    private String rol;
    
    @Column
    private String codigo_aereopuerto;
    
    @Column
    private String puesto;
    
    @Column
    private String estado;

    public int getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCodigo_aereopuerto() {
        return codigo_aereopuerto;
    }

    public void setCodigo_aereopuerto(String codigo_aereopuerto) {
        this.codigo_aereopuerto = codigo_aereopuerto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
