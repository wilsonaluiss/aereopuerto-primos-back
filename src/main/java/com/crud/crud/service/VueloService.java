/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.service;


import com.crud.crud.dto.vueloDto;
import com.crud.crud.model.AsientosModel;
import com.crud.crud.model.VueloModel;
import com.crud.crud.repository.AsientosRepository;

import com.crud.crud.repository.VueloRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projection.VueloProjection;

/**
 *
 * @author Wilson
 */
@Service
@Slf4j
@org.springframework.transaction.annotation.Transactional
public class VueloService {

    final static Logger LOG = LoggerFactory.getLogger(VueloService.class);
    @Autowired
    VueloRepository vueloRepository;


    public Boolean crearVuelo(VueloModel Vuelo){
        try {
            vueloRepository.save(Vuelo);
            return true;
        } catch (Exception e) {
            log.error("error"+e);
           return false;
        }
        
    }
   
    
    
    
  
}
