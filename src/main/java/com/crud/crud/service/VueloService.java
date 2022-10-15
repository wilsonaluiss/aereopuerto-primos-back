/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.service;

import com.crud.crud.dto.VueloDosDto;
import com.crud.crud.dto.VueloDto;
import com.crud.crud.model.AsientosModel;
import com.crud.crud.model.VueloModel;
import com.crud.crud.repository.AsientosRepository;
import com.crud.crud.repository.GeneralRepository;
import com.crud.crud.repository.VueloRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projection.VueloProjection;

/**
 *
 * @author Wilson
 */
@Service
@Slf4j
@org.springframework.transaction.annotation.Transactional
public class VueloService {

    final static Logger LOG = LoggerFactory.getLogger(VueloService.class);
    @Autowired
    VueloRepository vueloRepository;

    @Autowired
    AsientosRepository asientosRepository;

    
    @Autowired
    GeneralRepository generalRepository;

    /*public Boolean crearVuelod(VueloModel pVuelo) {
        LOG.debug("Creando vuelo " + pVuelo.toString());
        //Optional<VueloModel> vuelo = vueloRepository.findById(pVuelo.getIdVuelo());
        try {
            vueloRepository.save(pVuelo);
            return true;
        } catch (Exception e) {
            LOG.error("ERROR" + e);
            return false;
        }
    }*/
    public Boolean crearVuelo(VueloDto pVuelo) {
        LOG.debug("Creando vuelo " + pVuelo.toString());
        VueloModel vuelo = new VueloModel();
        //AsientosModel asiento = new AsientosModel();
        try {
            vuelo.setOrigen(pVuelo.getOrigen());
            vuelo.setDestino(pVuelo.getDestino());
            vuelo.setHoraSalida(pVuelo.getHoraSalida());
            vuelo.setHoraLlegada(pVuelo.getHoraLlegada());
            vuelo.setCostoAsientos(pVuelo.getCostoAsientos());
            vuelo.setEstadoVuelo(pVuelo.getEstadoVuelo());
            vuelo.setUsuarioCrea(pVuelo.getUsuarioCrea());
            vuelo.setUsuarioModifica(pVuelo.getUsuarioModifica());
            vuelo.setIdAvion(pVuelo.getIdAvion());
            vuelo.setIdTripulacion(pVuelo.getIdTripulacion());
            final VueloModel vuelos = vueloRepository.save(vuelo);

            pVuelo.getUbicacionAsiento().forEach(ubicacion -> {
                AsientosModel asiento = new AsientosModel();
                asiento.setNombreAsiento(pVuelo.getNombreAsiento());
                asiento.setUbicacionAsiento(ubicacion);
                asiento.setIdAvion(pVuelo.getIdAvion());
                asientosRepository.save(asiento);

            });

            return true;
        } catch (Exception e) {
            LOG.error("ERROR" + e);
            return false;
        }
    }
    
    
    
    public List<VueloDosDto> obtenerInfo(Integer idVuelo, String pUbicacion) {
        
        List<VueloDosDto> listResultado = generalRepository.obtenerInfo(idVuelo,pUbicacion);
        return listResultado;
    }
}
