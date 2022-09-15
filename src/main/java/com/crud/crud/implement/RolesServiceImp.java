/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.implement;

import java.util.List;
import com.crud.crud.model.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.crud.repository.RolesRepositorio;
import com.crud.crud.service.RolesServicio;

/**
 *
 * @author Wilson
 */

@Service
public class RolesServiceImp implements RolesServicio {
    @Autowired
    private RolesRepositorio rolesRepositorio;

    @Override
    public List<Roles> listar() {
        return rolesRepositorio.findAll();
    }

    @Override
    public Roles listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Roles add(Roles r) {
        return rolesRepositorio.save(r);
    }

    @Override
    public Roles edit(Roles r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Roles delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
