/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.controller;



import com.crud.crud.model.AsientosModel;
import com.crud.crud.model.vuelo;
import com.crud.crud.service.vueloServicio;
import com.crud.crud.util.ManejoFechas;
import java.util.Date;

import com.crud.crud.Projection.avionesProyection;
import com.crud.crud.model.vuelo;
import com.crud.crud.service.vueloServicio;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

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
    

    

    @GetMapping(path="/obtenerFecha/{fecha}")
    public List<vuelo>obtenerFecha (@PathVariable String fecha){
        Date fechaSalida = ManejoFechas.stringToDate(fecha,"dd-MM-yyyy");
        return vueloService.obtenerFecha(fechaSalida);
    }

    @GetMapping(value = "/listarVuelos")
    public List<vuelo> listarAviones() {
        return vueloService.listarVuelos();
    }
    
    

    
}
