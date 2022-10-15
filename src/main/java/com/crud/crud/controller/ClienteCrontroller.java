/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.controller;

import static com.crud.crud.controller.AdministracionController.LOG;
import com.crud.crud.dto.ClienteDto;
import com.crud.crud.dto.DatosRolesDto;
import com.crud.crud.model.ClienteModel;
import com.crud.crud.model.Roles;
import com.crud.crud.service.ClienteService;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Wilson
 */
@RestController
public class ClienteCrontroller {
    
    final static Logger LOG = LoggerFactory.getLogger(ClienteCrontroller.class);
    
    @Autowired
    ClienteService clienteService;
    
    @PostMapping(path = "/creaCliente")
    public Boolean crearRoless (@Valid @RequestBody ClienteModel cliente){
        try {
            return clienteService.crearCliente(cliente);
        } catch (Exception e) {
            LOG.error("Error" + e);
            return false;
        }
    }
    
    @PostMapping(value = "/modificarCliente/{idCliente}")
    public Boolean actualizarCliente(@Valid @PathVariable Integer idCliente, @RequestBody ClienteDto dto) {
        try {
            return clienteService.modificarCliente(idCliente, dto);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return false;
        }
    }
    
}
