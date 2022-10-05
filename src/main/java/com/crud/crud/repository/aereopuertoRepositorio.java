/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.repository;

import com.crud.crud.model.aereopuerto;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author conco
 */
public interface aereopuertoRepositorio extends Repository <aereopuerto, Integer> {
    List<aereopuerto> findAll();
    aereopuerto findById(int id);
    aereopuerto save (aereopuerto a);
    void  delete (aereopuerto a);
    
}
