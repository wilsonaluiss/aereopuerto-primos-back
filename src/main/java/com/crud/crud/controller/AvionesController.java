/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.controller;

import static com.crud.crud.controller.VueloController.LOG;
import com.crud.crud.dto.VueloDto;
import com.crud.crud.model.AvionesModelo;
import com.crud.crud.model.Roles;
import com.crud.crud.service.AvionesService;
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
public class AvionesController {
    
    final static Logger LOG = LoggerFactory.getLogger(AvionesController.class);
    @Autowired
    AvionesService avionesService;
    
    @PostMapping(path = "/crearAvion")
    public Boolean crearVuelo(@Valid @RequestBody AvionesModelo aviones) {
        try {
            return avionesService.crearAvion(aviones);
        } catch (Exception e) {
            LOG.error("Error" + e);
            return false;
        }
    }
    
    @GetMapping(value = "/obtenerAviones/todos")
    public List<AvionesModelo> obtenerAllUsuarios() {
        return (List<AvionesModelo>) avionesService.obtenerAviones();
    }
    
    
}
