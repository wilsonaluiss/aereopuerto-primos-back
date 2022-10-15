/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.dto;

import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Wilson
 */
@Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class VueloDto  {
    
    private String origen;
    private String destino;
    private Date horaSalida;
    private Date horaLlegada;
    private float costoAsientos;
    private String usuarioCrea;
    private String usuarioModifica;
    private int	idAvion;
    private int	idTripulacion;
    private String nombreAsiento;
    private List<String>  ubicacionAsiento;
    private String estadoVuelo;
    
    
}
