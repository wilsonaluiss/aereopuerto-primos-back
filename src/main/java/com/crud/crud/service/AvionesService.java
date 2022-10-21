/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.service;

import com.crud.crud.model.AvionesModelo;
import com.crud.crud.model.Roles;
import com.crud.crud.repository.AvionesRepository;
import static com.crud.crud.service.ClienteService.LOG;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Wilson
 */
@Service
@Slf4j
@org.springframework.transaction.annotation.Transactional
public class AvionesService {
    final static Logger LOG = LoggerFactory.getLogger(AvionesService.class);
    @Autowired
    AvionesRepository avionesRepository;
    
    public boolean crearAvion(AvionesModelo pModelo){
        LOG.debug("Creando Cliente " + pModelo.toString());
        AvionesModelo aviones = avionesRepository.findByNoPlaca(pModelo.getNoPlaca());
        try {
            if (aviones == null) {
                avionesRepository.save(pModelo);
            }else{
                return false;
            }
            return true;
        } catch (Exception e) {
            LOG.error("ERROR" + e);
            return false;
        }
    }
    
    public Iterable<AvionesModelo> obtenerAviones(){
        return avionesRepository.findAll();
    }
}
