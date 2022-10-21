/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.controller;

import static com.crud.crud.controller.AdministracionController.LOG;
import com.crud.crud.dto.DatosAereopuertoDTO;
import com.crud.crud.model.aereopuerto;
import com.crud.crud.service.aereopuertoServicio;
//import io.swagger.annotations.Api;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author conco
 */
//@Api(tags="aereopuerto")
@RestController
@RequestMapping({"/aereopuerto"})
@CrossOrigin(origins = "http://localhost:4200/")
public class aereopuertoController {

    

    @Autowired
    aereopuertoServicio AereopuertoServicio;

    /*
   @GetMapping 
    public List<aereopuerto>Listar(){
        return AereopuertoServicio.listar();
    }
    
    @PostMapping
    public aereopuerto agregar(@RequestBody aereopuerto a){
        return AereopuertoServicio.add(a);
    }
    
    @GetMapping(path ={"/{id}"})
    public aereopuerto listarId(@PathVariable("id") int id){
        return AereopuertoServicio.listarId(id);
    }
    
    @PutMapping(path ={"/actualizar/{id}"})
    public aereopuerto edit(@RequestBody aereopuerto a, @PathVariable("id") int id){
        a.setId_aereopuerto(id);
        return AereopuertoServicio.edit(a);
    }
    
    @PutMapping(path ={"/eliminar/{id}"})
    public aereopuerto eliminar(@PathVariable("id") int id){
        return AereopuertoServicio.delete(id);
    }
     */

    
    @PostMapping(path = "/creaAereopuerto")
    public Boolean CrearAereopuerto(@Valid @RequestBody aereopuerto Aereo) {
        try {
            return AereopuertoServicio.crearAereopuerto(Aereo);
        } catch (Exception e) {
            LOG.error("Error" + e);
          return null;
        }
    }
    
    
   
     @PutMapping(value = "/modificar/{idAereopuerto}")
    public Boolean actualizarAereopuerto(@Valid @PathVariable Integer idAereopuerto, @RequestBody DatosAereopuertoDTO dto) {
        try {
            return AereopuertoServicio.modificarAereopuerto(idAereopuerto, dto);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return false;
        }
    }
    
    
    
     @GetMapping(value = "/traer/{idAereopuerto}")
    public aereopuerto traerIdAereopuerto(@Valid @PathVariable Integer idAereopuerto) {
        try {
            return AereopuertoServicio.traerIdAereopuerto(idAereopuerto);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return null;
        } 
    }
    
    
    
    @GetMapping(value = "/listar/")
    public List <aereopuerto> listarAereopuerto(){
        try {
            return AereopuertoServicio.listarAereopuerto();
        } catch (Exception e) {
            return null;
        }
    }
    
    

    

}
