/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.crud.service;

import java.util.List;
import com.crud.crud.model.Roles;

/**
 *
 * @author Wilson
 */
public interface RolesServicio {
    
    List<Roles>listar();
    Roles listarId(int id);
    Roles add(Roles r);
    Roles edit(Roles r);
    Roles delete(int id);
    
}
