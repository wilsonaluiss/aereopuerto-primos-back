/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.controller;


import com.crud.crud.model.vuelo;
import com.crud.crud.service.vueloServicio;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author conco
 */

@RestController
@RequestMapping({"/vuelo"})
@CrossOrigin(origins = "http://localhost:4200/")
public class vueloController {
    
    @Autowired
    vueloServicio vueloService;
    
    @PostMapping(path="/crearVuelo")
    public Boolean crearVuelo(@Valid @RequestBody vuelo Vuelo){
        vueloService.crearVuelo(Vuelo);
        return true;
    }
    
}
