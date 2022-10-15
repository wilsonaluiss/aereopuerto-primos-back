/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.repository;

import com.crud.crud.dto.VueloDosDto;
import com.crud.crud.dto.VueloDto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import javax.persistence.Query;

/**
 *
 * @author Wilson
 */
@Repository
public class GeneralRepository {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    
    public List<VueloDosDto> obtenerInfo(Integer idVuelo, String pUbicacion) {
        String query = "select distinct id_asiento, origen, destino, hora_salida , hora_llegada, no_placa, ubicacion_asiento\n"
            + "from vuelo \n"
            + "inner join aviones on vuelo.id_avion  = aviones.id_avion\n"
            + "inner join asientos on vuelo.id_avion  = asientos.id_avion\n"
            + "where  id_vuelo= :idVuelo  and ubicacion_asiento in(" +  pUbicacion + ")";
            Query q = entityManager.createNativeQuery(query, VueloDosDto.class);
            q.setParameter("idVuelo", idVuelo);
            return q.getResultList();
    }
    
}

