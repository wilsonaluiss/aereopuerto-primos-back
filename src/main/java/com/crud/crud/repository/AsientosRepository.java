/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.crud.repository;

import com.crud.crud.model.AsientosModel;
import com.crud.crud.model.vuelo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Wilson
 */
public interface AsientosRepository extends CrudRepository<AsientosModel, Integer> {
    
    @Query(value="select*from asientos where id_avion =:id ",nativeQuery = true)
    List<AsientosModel>traerAsientoPorAvion(@Param("id")int id);
    
    
    @Query(value=" select*from asientos a where a.id_avion =:id; ",nativeQuery = true)
    List<AsientosModel>traerAsientosAvion(@Param("id")int id);
    
}
