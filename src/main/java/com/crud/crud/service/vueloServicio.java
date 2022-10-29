/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.service;


import com.crud.crud.model.AsientosModel;

import com.crud.crud.model.aviones;

import com.crud.crud.model.vuelo;
import com.crud.crud.repository.vueloRepository;
import java.util.Date;
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
public class vueloServicio {
    @Autowired
    vueloRepository vueloRepositorio;
    
    
    
    public Boolean crearVuelo (vuelo Vuelo){
        try {
         vueloRepositorio.save(Vuelo);
        return true;   
        } catch (Exception e) {
            log.error("error"+e);
           return false;
        }     
    }
    
  public List<vuelo> obtenerFecha(Date fecha_salida) {
        return (List<vuelo>) vueloRepositorio.obtenerFecha(fecha_salida);
    }
    

  
     public List<vuelo> listarVuelos(){
           return (List<vuelo>)vueloRepositorio.findAll();
       }

    
    
    
    
    
}
