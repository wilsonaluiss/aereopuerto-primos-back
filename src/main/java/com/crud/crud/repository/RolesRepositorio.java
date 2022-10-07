/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.crud.repository;

import com.crud.crud.model.Roles;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wilson
 */
public interface RolesRepositorio extends CrudRepository<Roles, Integer>{
    
    /*@Query(value= "select * from usuarios_internos u where u.nombre_usuario = :usuario and u.contrasena = :contrasena", nativeQuery = true )
    Optional<Roles> usuariosInternos (@Param ("usuario")String usuario, @Param ("contrasena")String contraseña);*/
    
    Roles findByNombreUsuario(String pUsuario);
    
    
}
