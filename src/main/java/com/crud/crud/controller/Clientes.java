/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Wilson
 */

@lombok.AllArgsConstructor
@Data
@lombok.NoArgsConstructor
@Entity
@Table(name ="clientes", schema = "public")
public class Clientes {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_clientes;
    
    @Column
    private String pasaporte_clientes;
    
    @Column
    private String nombre_cliente;
    
    @Column 
    private int codigo_rol;
}
