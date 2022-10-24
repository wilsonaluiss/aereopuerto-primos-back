/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.controller;


import com.crud.crud.dto.vueloDto;
import com.crud.crud.model.VueloModel;
import com.crud.crud.model.aviones;
import com.crud.crud.service.VueloService;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import projection.VueloProjection;

/**
 *
 * @author Wilson
 */
@RestController
@RequestMapping({"/vuelos"})
@CrossOrigin(origins = "http://localhost:4200/")
public class VueloController {

    final static Logger LOG = LoggerFactory.getLogger(VueloController.class);
    @Autowired
    VueloService vueloService;

    @PostMapping(path = "/crearVuelo")
   public Boolean crearVuelo(@Valid @RequestBody VueloModel Vuelo){
       vueloService.crearVuelo(Vuelo);
       return true;
       
   }

    

}
