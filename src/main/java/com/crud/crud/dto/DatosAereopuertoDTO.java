/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.dto;

import lombok.Data;

/**
 *
 * @author conco
 */


@lombok.AllArgsConstructor
@Data
@lombok.NoArgsConstructor
public class DatosAereopuertoDTO {
    
     private String nombre_aereopuerto;
     private String ubicacion_aereopuerto;
     private String estado;
    
    
}
