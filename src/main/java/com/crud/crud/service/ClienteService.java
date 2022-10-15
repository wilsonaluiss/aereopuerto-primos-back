/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.service;

import com.crud.crud.dto.ClienteDto;
import com.crud.crud.dto.DatosRolesDto;
import com.crud.crud.model.ClienteModel;
import com.crud.crud.model.Roles;
import com.crud.crud.repository.ClienteRepository;
import static com.crud.crud.service.RolesService.LOG;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Wilson
 */
@Service
@Slf4j
@org.springframework.transaction.annotation.Transactional
public class ClienteService {
    
    final static Logger LOG = LoggerFactory.getLogger(ClienteService.class);
    @Autowired
    ClienteRepository clienteRepository;
    
    
    
    public Boolean crearCliente(ClienteModel pCliente) {
        LOG.debug("Creando Cliente " + pCliente.toString());
        ClienteModel cliente = clienteRepository.findByPasaporteClientes(pCliente.getPasaporteClientes());
        try {
            if (cliente == null) {
                clienteRepository.save(pCliente);
            }else{
                return false;
            }
            return true;
        } catch (Exception e) {
            LOG.error("ERROR" + e);
            return false;
        }
    }
    
     public Boolean modificarCliente(Integer idCliente ,ClienteDto dto){
        LOG.debug("Modificando Cliente "+ dto);
        final ClienteModel cliente = clienteRepository.findById(idCliente).orElse(null);
        if(cliente != null){
            cliente.setNombreCliente(dto.getNombreCliente());
            cliente.setDireccionCliente(dto.getDireccionCliente());
            cliente.setEmailCliente(dto.getEmailCliente());
            cliente.setTelefonoCliente(dto.getTelefonoCliente());
            cliente.setTelEmergenciaCliente(dto.getTelEmergenciaCliente());
            cliente.setIdRol(dto.getIdRol());
            return true;
        }else{
            return false;
        }
    }
    
}
