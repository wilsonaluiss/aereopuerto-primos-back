/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.controller;

import com.crud.crud.dto.VueloDosDto;
import com.crud.crud.dto.VueloDto;
import com.crud.crud.model.VueloModel;
import com.crud.crud.service.VueloService;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import projection.VueloProjection;

/**
 *
 * @author Wilson
 */
@RestController
public class VueloController {

    final static Logger LOG = LoggerFactory.getLogger(VueloController.class);
    @Autowired
    VueloService vueloService;

    @PostMapping(path = "/crearVuelo")
    public Boolean crearVuelo(@Valid @RequestBody VueloDto vuelos) {
        try {
            return vueloService.crearVuelo(vuelos);
        } catch (Exception e) {
            LOG.error("Error" + e);
            return false;
        }
    }

    @GetMapping(value = "/vuelo/info/{idVuelo}/{pUbicacion}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<VueloDosDto>> obtenerInfo(@Valid @PathVariable Integer idVuelo,@PathVariable String pUbicacion) {
        LOG.info("consultado...");
        VueloProjection vuelo;

        List<VueloDosDto> vuelodetalle = vueloService.obtenerInfo(idVuelo, pUbicacion);
        if (vuelodetalle == null || vuelodetalle.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(vuelodetalle);
    }

}
