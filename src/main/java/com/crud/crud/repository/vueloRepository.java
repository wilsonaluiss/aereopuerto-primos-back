/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.repository;

import com.crud.crud.model.AsientosModel;
import com.crud.crud.model.vuelo;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author conco
 */
public interface vueloRepository extends CrudRepository<vuelo, Integer>{
    
    @Query(value="select * from vuelo where fecha_salida =:fecha_salida",nativeQuery = true)
    List<vuelo>obtenerFecha(@Param("fecha_salida")Date fecha_salida);
    
    
        
}
