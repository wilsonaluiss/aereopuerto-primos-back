/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.controller;

import static com.crud.crud.controller.AdministracionController.LOG;
import com.crud.crud.dto.aereolineaDto;
import com.crud.crud.model.aereolinea;
import com.crud.crud.service.aereolineaServicio;
import java.util.List;
import javax.validation.Valid;
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


@RestController
@RequestMapping({"/aereolineas"})
@CrossOrigin(origins = "http://localhost:4200/")
public class aereolineaController {
    
    @Autowired
    aereolineaServicio AereolineaServicio;
    
    
    @PostMapping(path="/crearAereolinea")
    public Boolean crearAereolinea(@Valid @RequestBody aereolinea Aereolinea){
        AereolineaServicio.crearAereolinea(Aereolinea);
        return true;
    }
    
    
    @PutMapping(path="/modificar/{idAereolinea}")
    public Boolean modificarAereolinea(@Valid @PathVariable Integer idAereolinea,@RequestBody aereolineaDto dto){
            try {
                AereolineaServicio.modificarAereolinea(idAereolinea, dto);
                return true;
            } catch (Exception e) {
                LOG.error("hubo un error"+e);
                return false;
                
            }
    }
    
    @GetMapping(path="/listarAereolinea")
    public List<aereolinea> listarAereolineas(){
        return AereolineaServicio.listarAereolineas();
        
    }
            
            
            
            
            
}
