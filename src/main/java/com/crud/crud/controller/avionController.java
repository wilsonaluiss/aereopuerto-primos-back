/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.controller;

import com.crud.crud.Projection.AvionProyection;
import com.crud.crud.Projection.avionesProyection;
import com.crud.crud.Projection.nombreAereolineaProyection;
import com.crud.crud.Projection.nombreAereopuertoProyection;
import static com.crud.crud.controller.AdministracionController.LOG;
import com.crud.crud.dto.DatosAereopuertoDTO;
import com.crud.crud.dto.avionesDto;
import com.crud.crud.model.aereopuerto;
import com.crud.crud.model.aviones;
import com.crud.crud.service.avionesServicio;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author conco
 */
@RestController
@RequestMapping({"/aviones"})
@CrossOrigin(origins = "http://localhost:4200/")
public class avionController {

    @Autowired
    avionesServicio AvionServicio;

    @PostMapping(path = "/creaAvion")
    public Boolean crearAvion(@Valid @RequestBody aviones Avion) {

        AvionServicio.crearAvion(Avion);
        return true;

    }

    @PutMapping(value = "/modificar/{idAvion}")
    public Boolean modificarAvion(@Valid @PathVariable Integer idAvion, @RequestBody avionesDto dto) {
        try {
            AvionServicio.modificarAvion(idAvion, dto);
            return true;
        } catch (Exception e) {
            LOG.error("error " + e);
            return false;
        }
    }

    @GetMapping(value = "/listarAviones")
    public List<avionesProyection> listarAviones() {
        return AvionServicio.traerTabla();
    }

    @GetMapping(value = "/obtenernombreAereopuerto")
    public List<nombreAereopuertoProyection> traerNombreAereopuerto() {
        return AvionServicio.traerNombreAereopuerto();
    }

    @GetMapping(value = "/obtenernombreAereolinea")
    public List<nombreAereolineaProyection> traerNombreAereolinea() {
        return AvionServicio.traerNombreAereolinea();
    }

    @GetMapping(value = "/obtenerAviones")
    public List<AvionProyection> obtenerAvion() {
        return AvionServicio.obtenerAvion();
    }
    
    @GetMapping(value = "/obtenerAvion/{idAvion}")
    public aviones obtenerAvionById(@Valid @PathVariable Integer idAvion) {
        try {
            return AvionServicio.traerAvionById(idAvion);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return null;
        }
    }
}
