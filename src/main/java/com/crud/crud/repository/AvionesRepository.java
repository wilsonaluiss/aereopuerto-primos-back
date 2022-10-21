/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.crud.repository;

import com.crud.crud.model.AvionesModelo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wilson
 */
public interface AvionesRepository extends CrudRepository<AvionesModelo, Integer > {
    
    AvionesModelo findByNoPlaca (String noPlaca);
}
