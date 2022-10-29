/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.controller;

import static com.crud.crud.controller.ClienteCrontroller.LOG;
import com.crud.crud.model.ClienteModel;
import com.crud.crud.model.TripulacionModel;
import com.crud.crud.model.aereolinea;
import com.crud.crud.service.TripulacionService;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Wilson
 */
@RestController
public class TripulacionController {
    
    final static Logger LOG = LoggerFactory.getLogger(TripulacionController.class);
    
    @Autowired
    TripulacionService tripulacionService;
    
    
    @PostMapping(path = "/creaTripulacion")
    public Boolean crearTripulacion (@Valid @RequestBody TripulacionModel tripulacion){
        try {
            return tripulacionService.crearTripulacion(tripulacion);
        } catch (Exception e) {
            LOG.error("Error" + e);
            return false;
        }
    }
    
    @GetMapping(path="/listarTripulacion")
    public List<TripulacionModel> listarTripulacion(){
        return tripulacionService.listarTripulacion();
        
    }
    
}
