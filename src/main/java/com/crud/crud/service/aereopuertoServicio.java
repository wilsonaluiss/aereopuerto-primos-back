/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.service;

import com.crud.crud.model.aereopuerto;
import java.util.List;

/**
 *
 * @author conco
 */
public interface aereopuertoServicio {
    
    List <aereopuerto>listar();
        aereopuerto listarId(int id);
        aereopuerto add(aereopuerto a);
        aereopuerto edit(aereopuerto a);
        aereopuerto delete(int id);
    
}
