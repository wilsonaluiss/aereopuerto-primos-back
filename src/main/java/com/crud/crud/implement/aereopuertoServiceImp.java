/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.implement;

import com.crud.crud.model.aereopuerto;
import com.crud.crud.repository.aereopuertoRepositorio;
import com.crud.crud.service.aereopuertoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 @Service
public class aereopuertoServiceImp implements aereopuertoServicio {
    
       @Autowired
    private aereopuertoRepositorio AereopuertoRepositorio;
    
    public List <aereopuerto> listar(){
        return AereopuertoRepositorio.findAll();
    }
    
    @Override
    public aereopuerto listarId(int id){
     return AereopuertoRepositorio.findById(id);
    }
    
    @Override
    public aereopuerto add(aereopuerto a){
        return AereopuertoRepositorio.save(a);
    }
    
    @Override
    public aereopuerto edit (aereopuerto a){
        return AereopuertoRepositorio.save(a);
    }
    
    @Override
    public aereopuerto delete (int id){
        aereopuerto a= AereopuertoRepositorio.findById(id);
        a.setEstado("inactivo");
        return AereopuertoRepositorio.save(a);
    }
    
}
