/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.service;

import com.crud.crud.Projection.AvionProyection;
import com.crud.crud.Projection.avionesProyection;
import com.crud.crud.Projection.nombreAereolineaProyection;
import com.crud.crud.Projection.nombreAereopuertoProyection;
import com.crud.crud.dto.avionesDto;
import com.crud.crud.model.aereopuerto;
import com.crud.crud.model.aviones;
import com.crud.crud.repository.avionesRepositorio;
import static com.crud.crud.service.aereopuertoServicio.LOG;
import static java.util.Collections.list;
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
public class avionesServicio {
    
   @Autowired
   avionesRepositorio AvionesRepositorio;
   
   public aviones crearAvion (aviones Avion){
       try {
           AvionesRepositorio.save(Avion);
           return Avion;
       } catch (Exception e) {
           log.error("error"+e);
           return null;
       }

   }
   
   
   
   
   public Boolean modificarAvion (Integer idAvion, avionesDto dto){
       aviones Avion = AvionesRepositorio.findById(idAvion).orElse(null);
       if (Avion != null) {
           Avion.setId_avion(dto.getId_avion());
           Avion.setId_aereolinea(dto.getId_aereolinea());
           Avion.setId_aereopuerto(dto.getId_aereopuerto());
           Avion.setNo_placa(dto.getNo_placa());
           Avion.setEstado_avion(dto.getEstado_avion());
           Avion.setCapacidad_asientos(dto.getCapacidad_asientos());
           Avion.setDimensiones(dto.getDimensiones());
           return true;
    
       } else {
           return false;
       }   
   }
   
   
   public List<aviones> listarAviones(){
           return (List<aviones>)AvionesRepositorio.findAll();
       }
   
   
   public List<avionesProyection> traerTabla(){
       return(List<avionesProyection>)AvionesRepositorio.traerTabla();
   }
   
   
    public List<nombreAereopuertoProyection> traerNombreAereopuerto(){
        return(List<nombreAereopuertoProyection>)AvionesRepositorio.traerNombreAereopuerto();
    }
    
    public List<nombreAereolineaProyection> traerNombreAereolinea(){
        return(List<nombreAereolineaProyection>)AvionesRepositorio.traerNombreAereolinea();
    }
    
    public List<AvionProyection> obtenerAvion(){
        return(List<AvionProyection>)AvionesRepositorio.obtenerAvion();
    }
    
    public aviones traerAvionById(int idAvion) {
        LOG.debug("Buscando Avion " + idAvion);
        try {
            return AvionesRepositorio.traerAvionById(idAvion);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return null;
        }
    }
}
