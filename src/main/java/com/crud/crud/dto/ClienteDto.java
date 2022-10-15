/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.dto;

import lombok.Data;

/**
 *
 * @author Wilson
 */

@Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class ClienteDto {
    
    
    private String nombreCliente;
    private String emailCliente;
    private String telefonoCliente;
    private String telEmergenciaCliente;
    private String direccionCliente;
    private int idRol;
    
}
