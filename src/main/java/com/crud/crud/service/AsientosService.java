/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.service;

import com.crud.crud.dto.asientosDto;
import com.crud.crud.model.AsientosModel;
import com.crud.crud.repository.AsientosRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@org.springframework.transaction.annotation.Transactional
public class AsientosService  {
    
    @Autowired
    AsientosRepository asientosRepositorio;
    
    
    
     public Boolean crearAsiento(AsientosModel asiento){
       try {
           asientosRepositorio.save(asiento);
           return true;
       } catch (Exception e) {
           log.error("error"+e);
           return false;
       }

   }
    
    
    
    
    public Boolean modificarAsiento(Integer idAsiento, asientosDto dto){
        
        
       AsientosModel asiento= asientosRepositorio.findById(idAsiento).orElse(null);
        if (asiento != null) {
            asiento.setId_asiento(dto.getId_asiento());
            asiento.setNombre_asiento(dto.getNombre_asiento());
            asiento.setId_avion(dto.getId_avion());
            return true;
           
        } else {
            return false;
        }         
        
    }
    
    
    
    public List<AsientosModel> traerAsientoPorAvion(int id){
        return (List<AsientosModel>)asientosRepositorio.traerAsientoPorAvion(id);
    }
    
    
    public List<AsientosModel>traerAsientosAvion(int id){
        return (List<AsientosModel>)asientosRepositorio.traerAsientosAvion(id);
    }
    
    
}
