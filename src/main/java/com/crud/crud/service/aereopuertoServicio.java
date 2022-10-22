/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.service;

import com.crud.crud.dto.DatosAereopuertoDTO;
import com.crud.crud.dto.DatosRolesDto;
import com.crud.crud.model.Roles;
import com.crud.crud.model.aereopuerto;
import com.crud.crud.repository.aereopuertoRepositorio;
import static com.crud.crud.service.RolesService.LOG;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Slf4j
@org.springframework.transaction.annotation.Transactional
public class aereopuertoServicio {

    final static Logger LOG = LoggerFactory.getLogger(aereopuertoServicio.class);
    @Autowired
    aereopuertoRepositorio AereopuertoRepositorio;
    
    

    public Boolean crearAereopuerto(aereopuerto pAereopuerto) {
        LOG.debug("Creando Evento " + pAereopuerto.toString());

        aereopuerto Aereopuerto = AereopuertoRepositorio.traerAereopuertoById(pAereopuerto.getId_aereopuerto());

        try {
            if (Aereopuerto == null) {
                AereopuertoRepositorio.save(pAereopuerto);
            } else {
                return false;
            }
            return true;
        } catch (Exception e) {
            LOG.error("ERROR" + e);
            return false;
        }
    }

    
    
    public Boolean modificarAereopuerto(Integer idAereopuerto, DatosAereopuertoDTO dto) {
        LOG.debug("Modificando Aereopuerto " + dto);
        final aereopuerto Aereopuerto = AereopuertoRepositorio.findById(idAereopuerto).orElse(null);
        if (Aereopuerto != null) {

            Aereopuerto.setNombre_aereopuerto(dto.getNombre_aereopuerto());
            Aereopuerto.setEstado(dto.getEstado());
            Aereopuerto.setUbicacion_aereopuerto(dto.getUbicacion_aereopuerto());

            return true;
        } else {
            return false;
        }

    }

    public aereopuerto traerIdAereopuerto(int idAereopuerto) {
        LOG.debug("Buscando Aereopuerto " + idAereopuerto);
        try {
            return AereopuertoRepositorio.traerAereopuertoById(idAereopuerto);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return null;
            
        }
    }

    
    public List <aereopuerto> listarAereopuerto (){
        try {
            return(List<aereopuerto> ) AereopuertoRepositorio.findAll();
        } catch (Exception e) {
            return null;
        }
        
    }
    

}
