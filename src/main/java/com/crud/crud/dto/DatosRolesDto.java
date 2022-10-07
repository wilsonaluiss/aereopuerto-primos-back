/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author Wilson
 */

@lombok.AllArgsConstructor
@Data
@lombok.NoArgsConstructor
public class DatosRolesDto {
    
    private String nombre_usuario;
    private String contrasena;
    private String estado_usuario;
    private String telefono_usuario;
    private String direccion_usuario;
    private String usuario_crea;
    private String usuario_modifica;
    private int id_aereopuerto;
    private int id_rol;
}
