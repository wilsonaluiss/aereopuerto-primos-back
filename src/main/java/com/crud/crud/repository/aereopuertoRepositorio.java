/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.repository;

import com.crud.crud.dto.DatosAereopuertoDTO;
import com.crud.crud.model.aereopuerto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author conco
 */
public interface aereopuertoRepositorio extends CrudRepository<aereopuerto, Integer> {
    

    /*
    aereopuerto findByNombre_aereopuerto(String pAereopuerto);
    */
    
   @Query(value ="select *from aereopuerto \n" +
"    where id_aereopuerto = :id_aereopuerto", nativeQuery = true) 
   aereopuerto traerAereopuertoById(
       @Param("id_aereopuerto")  int id_aereopuerto  
   );
   
   
    
    
}
