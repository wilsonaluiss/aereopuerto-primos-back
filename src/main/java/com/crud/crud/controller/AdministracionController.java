package com.crud.crud.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.crud.crud.dto.DatosRolesDto;
import com.crud.crud.dto.RolesDto;
import java.util.List;
import com.crud.crud.model.Roles;
import com.crud.crud.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.crud.service.RolesServicio;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Wilson
 */
//@Api (tags = "Roles administrativos")
@RestController
@RequestMapping({"/usuarios"})

public class AdministracionController {
    
    final static Logger LOG = LoggerFactory.getLogger(AdministracionController.class);
    
    @Autowired
    RolesService rolesService;
    
    /*@Autowired
    RolesServicio rolesServicio;*/
    
    /*@GetMapping()
    public List<Roles>listar(){
        return rolesServicio.listar();
    }
    
    @PostMapping
    public Roles agregar(@RequestBody Roles r){
        return rolesServicio.add(r);
    }
    
    @GetMapping(path ={"/{id}"})
    public Roles listarId(@PathVariable("id") int id){
        return rolesServicio.listarId(id);
    }
    
    @PutMapping(path ={"/actualizar/{id}"})
    public Roles edit(@RequestBody Roles r, @PathVariable("id") int id){
        r.setId_usuario(id);
        return rolesServicio.edit(r);
    }
    
    @PutMapping(path ={"/eliminar/{id}"})
    public Roles eliminar(@PathVariable("id") int id){
        return rolesServicio.delete(id);
    }*/
    
    
    /*@PostMapping(path = "/login")
    @ResponseStatus(HttpStatus.OK)
    //@ApiOperation(value = "Obtiene detalle de los eventos", notes = "")
    public ResponseEntity<Optional<Roles>> obtenerAsuetosCreados(@RequestBody RolesDto dto) {
        return ResponseEntity.ok(rolesService.getUsuarioByUserAndPass(dto));
    }*/
    
      
    //Ingres datos en la tabla de usuarios_internos
    @PostMapping(path = "/creaRol")
    public Boolean crearRoless (@Valid @RequestBody Roles roles){
        try {
            return rolesService.crearRol(roles);
        } catch (Exception e) {
            LOG.error("Error" + e);
            return null;
        }
    }
    
    /*@PostMapping(path = "/modificaUsuarios")
    public Boolean modificarUsuarios(){
        
    }*/
    
    @PutMapping(value = "/modificar/{idUsuario}")
    public Boolean actualizarAerolinea(@Valid @PathVariable Integer idUsuario, @RequestBody DatosRolesDto dto) {
        try {
            return rolesService.modificarUsuario(idUsuario, dto);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return false;
        }
    }
    
    
    
    

}

