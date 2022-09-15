package com.crud.crud.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.List;
import com.crud.crud.model.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.crud.service.RolesServicio;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 *
 * @author Wilson
 */
@Api (tags = "Roles administrativos")
@RestController
@RequestMapping({"/usuarios"})

public class AdministracionController {
    
    @Autowired
    RolesServicio rolesServicio;
    
    @GetMapping
    @ApiOperation(value = "asdfasfda", notes = "afdasdfasfd")
    public List<Roles>listar(){
        return rolesServicio.listar();
    }
    
    @PostMapping
    public Roles agregar(@RequestBody Roles r){
        return rolesServicio.add(r);
    }
    
    

}

