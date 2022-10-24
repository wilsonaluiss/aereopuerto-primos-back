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
public class boletoDto {
    private int id_no_boleto;
 private double costo_boleto;
 private Date fecha_hora_reserva;
 private int cantidad_equipaje;
 private int peso_equipaje;
 private int puerta_embarque;
 private int id_asiento;
 private int id_vuelo;
 private int id_cliente;

    public boletoDto() {
    }

    public boletoDto(int id_no_boleto, double costo_boleto, Date fecha_hora_reserva, int cantidad_equipaje, int peso_equipaje, int puerta_embarque, int id_asiento, int id_vuelo, int id_cliente) {
        this.id_no_boleto = id_no_boleto;
        this.costo_boleto = costo_boleto;
        this.fecha_hora_reserva = fecha_hora_reserva;
        this.cantidad_equipaje = cantidad_equipaje;
        this.peso_equipaje = peso_equipaje;
        this.puerta_embarque = puerta_embarque;
        this.id_asiento = id_asiento;
        this.id_vuelo = id_vuelo;
        this.id_cliente = id_cliente;
    }

    public int getId_no_boleto() {
        return id_no_boleto;
    }

    public void setId_no_boleto(int id_no_boleto) {
        this.id_no_boleto = id_no_boleto;
    }

    public double getCosto_boleto() {
        return costo_boleto;
    }

    public void setCosto_boleto(double costo_boleto) {
        this.costo_boleto = costo_boleto;
    }

    public Date getFecha_hora_reserva() {
        return fecha_hora_reserva;
    }

    public void setFecha_hora_reserva(Date fecha_hora_reserva) {
        this.fecha_hora_reserva = fecha_hora_reserva;
    }

    public int getCantidad_equipaje() {
        return cantidad_equipaje;
    }

    public void setCantidad_equipaje(int cantidad_equipaje) {
        this.cantidad_equipaje = cantidad_equipaje;
    }

    public int getPeso_equipaje() {
        return peso_equipaje;
    }

    public void setPeso_equipaje(int peso_equipaje) {
        this.peso_equipaje = peso_equipaje;
    }

    public int getPuerta_embarque() {
        return puerta_embarque;
    }

    public void setPuerta_embarque(int puerta_embarque) {
        this.puerta_embarque = puerta_embarque;
    }

    public int getId_asiento() {
        return id_asiento;
    }

    public void setId_asiento(int id_asiento) {
        this.id_asiento = id_asiento;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
 
 
 
}
