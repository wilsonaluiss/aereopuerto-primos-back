/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.service;

import com.crud.crud.model.TripulacionModel;
import com.crud.crud.repository.tripulacionRepository;
import java.util.Optional;
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
public class TripulacionService {
    
    
    final static Logger LOG = LoggerFactory.getLogger(TripulacionService.class);
   @Autowired
    tripulacionRepository tripulacionRepository;
    
    public Boolean crearTripulacion(TripulacionModel pCliente) {
        LOG.debug("Creando Cliente " + pCliente.toString());
        Optional<TripulacionModel> tripulacion = tripulacionRepository.findById(pCliente.getIdTripulacion());
        try {
            if (tripulacion != null) {
                tripulacionRepository.save(pCliente);
            }else{
                return false;
            }
            return true;
        } catch (Exception e) {
            LOG.error("ERROR" + e);
            return false;
        }
    }
    
}
