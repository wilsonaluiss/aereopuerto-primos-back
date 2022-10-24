/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.controller;

import static com.crud.crud.controller.AdministracionController.LOG;
import com.crud.crud.dto.asientosDto;
import com.crud.crud.dto.avionesDto;
import com.crud.crud.model.AsientosModel;
import com.crud.crud.model.aviones;
import com.crud.crud.service.AsientosService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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


@RestController
@RequestMapping({"/asientos"})
@CrossOrigin(origins = "http://localhost:4200/")
public class asientoController {
    
    
    
    @Autowired
    AsientosService asientoServicio;
    
    @PutMapping(value = "/modificar/{idAsiento}")
    public Boolean modificarAsiento(@Valid @PathVariable Integer idAsiento, @RequestBody asientosDto dto) {
        try {
            asientoServicio.modificarAsiento(idAsiento, dto);
            return true;
        } catch (Exception e) {
            LOG.error("error " + e);
            return false;
        }
    }
    
    
    /**/
        @PostMapping(path = "/crearAsiento/{idAvion}/{cantidadAsientos}")
    public void crearAsiento(@Valid @PathVariable Integer idAvion,  @PathVariable Integer cantidadAsientos, @RequestBody AsientosModel asiento) {

            for (int i = 0; i < cantidadAsientos; i++) {
                AsientosModel asientos= new AsientosModel(0,i+1+"",idAvion); 
                asientos.toString();
                asientoServicio.crearAsiento(asientos);
            }
            
        
        
    }
    
    
    
    
    
}
