/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.service;

import com.crud.crud.dto.aereolineaDto;
import com.crud.crud.model.aereolinea;
import com.crud.crud.repository.aereolineaRepositorio;
import static com.crud.crud.service.RolesService.LOG;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author conco
 */

@Service
@Slf4j
@org.springframework.transaction.annotation.Transactional
public class aereolineaServicio {
    
    @Autowired
    aereolineaRepositorio AereolineaRepositorio;
    
    public Boolean crearAereolinea (aereolinea Aereolinea){
        try {
            AereolineaRepositorio.save(Aereolinea);
            return true;
        } catch (Exception e) {
            LOG.error("hubo un error"+e);
            return false;
        }
        
    }
    
    
    
    
    public Boolean modificarAereolinea (Integer idAereolinea, aereolineaDto dto){
        
            aereolinea Aereol = AereolineaRepositorio.findById(idAereolinea).orElse(null);
            if (Aereol != null) {
                Aereol.setId_aereolinea(dto.getId_aereolinea());
                Aereol.setNo_patente_comercio(dto.getNo_patente_comercio());
                Aereol.setNombre_aereolinea(dto.getNombre_aereolinea());
                Aereol.setAdministrador_aereolinea(dto.getAdministrador_aereolinea());
                Aereol.setEstado_aereolinea(dto.getEstado_aereolinea());
                return true;
            
        } else {
                return false;
        }

    }
    
    
    
    public List<aereolinea> listarAereolineas(){
        return(List<aereolinea>)AereolineaRepositorio.findAll();
    }
    
    
}
