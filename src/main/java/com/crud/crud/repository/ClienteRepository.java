/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.crud.repository;

import com.crud.crud.model.ClienteModel;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wilson
 */
public interface ClienteRepository extends CrudRepository<ClienteModel, Integer> {
    
    ClienteModel findByPasaporteClientes(String pPasaporteClientes);
}
