/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.controller;

import com.crud.crud.dto.boletoDto;
import com.crud.crud.model.boleto;
import com.crud.crud.service.boletoServicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author conco
 */


@RestController
@RequestMapping({"/boleto"})
@CrossOrigin(origins = "http://localhost:4200/")
public class boletoController {
    
    @Autowired
    boletoServicio BoletoServicio;
    
    
    
    @PostMapping(path="/crearBoleto")
    public Boolean crearBoleto( @RequestBody List<boletoDto> Boleto){
        
       BoletoServicio.crearBoleto(Boleto);
       return true;
    }
    
    
    
    
    
}
