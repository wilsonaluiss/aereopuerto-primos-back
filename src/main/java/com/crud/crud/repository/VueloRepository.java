/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.crud.repository;

import com.crud.crud.model.ClienteModel;
import com.crud.crud.model.VueloModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import projection.VueloProjection;

/**
 *
 * @author Wilson
 */
public interface VueloRepository extends CrudRepository<VueloModel, Integer> {

   

}
