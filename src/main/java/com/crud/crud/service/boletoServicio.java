/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.service;

import com.crud.crud.model.boleto;
import com.crud.crud.repository.boletoRepository;
import lombok.extern.java.Log;
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
    
    
    
    
    public Boolean crearBoleto(boleto Boleto){
        try {
            boletoRepositorio.save(Boleto);
            return true;
        } catch (Exception e) {
            log.error("error"+e);
           return false;
            
        }
    }
    
    
    
    
    
    
}
