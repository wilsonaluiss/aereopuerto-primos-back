/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.crud.repository;

import java.util.List;
import com.crud.crud.model.Roles;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Wilson
 */
public interface RolesRepositorio extends Repository <Roles, Integer>{
    List<Roles>findAll();
    Roles findById(int id);
    Roles save(Roles r);
    void delete(Roles r);
    
}
