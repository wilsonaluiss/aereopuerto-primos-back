/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.service;

import com.crud.crud.dto.DatosRolesDto;
import com.crud.crud.model.Roles;
import com.crud.crud.repository.RolesRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Wilson
 */
@Service
@Slf4j
@org.springframework.transaction.annotation.Transactional
public class RolesService {

    final static Logger LOG = LoggerFactory.getLogger(RolesService.class);
    @Autowired
    RolesRepositorio rolesRepositorio;

    /*public Optional<Roles> getUsuarioByUserAndPass(RolesDto dto){
        return this.rolesRepositorio.usuariosInternos(dto.getUsuario(),dto.getPassword());
    }*/
    /**
     * Crea un nuevo Evento
     *
     * @param pRol {@link AccylEventos}
     * @return Objeto Evento con los valores que fueron ingresados
     */
    /*@org.springframework.transaction.annotation.Transactional(rollbackFor = {Exception.class})
    public Boolean crearRol(Roles pRol) {
        LOG.debug("Creando Evento " + pRol.toString());

        Roles rol = rolesRepositorio.findByNombreUsuario(pRol.getNombreUsuario());
        try {
            if(rol == null){
               final Roles roles = rolesRepositorio.save(
                        Roles.builder()
                .nombreUsuario(pRol.getNombreUsuario())
                .contrasena(pRol.getContrasena())
                .direccionUsuario(pRol.getDireccionUsuario())
                .estadoUsuario(pRol.getEstadoUsuario())
                .idAereopuerto(pRol.getIdAereopuerto())
                .idRol(pRol.getIdRol())
                .usuarioCrea(pRol.getUsuarioCrea())
                .usuarioModifica(pRol.getUsuarioModifica())
                .telefonoUsuario(pRol.getTelefonoUsuario())
                .build()
                ) ; 
            }else{
                return false;
            }
            LOG.debug(pRol.toString());
            return true;
            
        } catch (Exception e) {
            LOG.error("Error al Crear Usuario :" + e);
            return false;
        }
    }*/
    
    public Boolean crearRol(Roles pRol) {
        LOG.debug("Creando Evento " + pRol.toString());
        Roles rol = rolesRepositorio.findByNombreUsuario(pRol.getNombreUsuario());
        try {
            if (rol == null) {
                rolesRepositorio.save(pRol);
            }else{
                return false;
            }
            return true;
        } catch (Exception e) {
            LOG.error("ERROR" + e);
            return false;
        }
    }

    
    public Boolean modificarUsuario(Integer idUsuario ,DatosRolesDto dto){
        LOG.debug("Modificando Usuario "+ dto);
        final Roles roles = rolesRepositorio.findById(idUsuario).orElse(null);
        if(roles != null){
            roles.setNombreUsuario(dto.getNombre_usuario());
            roles.setContrasena(dto.getContrasena());
            roles.setDireccionUsuario(dto.getDireccion_usuario());
            roles.setEstadoUsuario(dto.getEstado_usuario());
            roles.setIdAereopuerto(dto.getId_aereopuerto());
            roles.setIdRol(dto.getId_rol());
            roles.setTelefonoUsuario(dto.getTelefono_usuario());
            roles.setUsuarioCrea(dto.getUsuario_crea());
            roles.setUsuarioModifica(dto.getUsuario_modifica());
            
            return true;
        }else{
            return false;
        }
    }
}
