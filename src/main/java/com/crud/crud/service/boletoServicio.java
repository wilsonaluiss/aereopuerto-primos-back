/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.service;

import com.crud.crud.dto.boletoDto;
import com.crud.crud.model.AsientosModel;
import com.crud.crud.model.boleto;
import com.crud.crud.repository.AsientosRepository;
import com.crud.crud.repository.boletoRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author conco
 */

@Service
@Slf4j
@org.springframework.transaction.annotation.Transactional
public class boletoServicio {
    
    @Autowired
    boletoRepository boletoRepositorio;
    
    
    @Autowired
 AsientosRepository asientosRepo;
    
    
    
    
    public Boolean crearBoleto(List<boletoDto> Boleto){
        try {
            Boleto.forEach(k -> {
                System.out.println("este es el id del asiento"+k.getId_asiento());
               boletoRepositorio.save(boleto.builder()
                       .idClientes(k.getId_cliente())
                       .idVuelo(k.getId_vuelo())
                       .puertaEmbarque(k.getPuerta_embarque())
                       .pesoEquipaje(k.getPeso_equipaje())
                       .cantidaEquipaje(k.getCantidad_equipaje())
                       .fechaHoraReserva(k.getFecha_hora_reserva())
                       .costoBoleto(k.getCosto_boleto())
                       .idAsiento(k.getId_asiento())
                       .build());

             AsientosModel Asiento = asientosRepo.findById(k.getId_asiento()).get();
             Asiento.setId_estado(2);
             asientosRepo.save(Asiento);
            });        
             return true;
        } catch (Exception e) {
            log.error("error"+e);
           return false;
            
        }
    }



    
    
    
    
    
    
    
}
