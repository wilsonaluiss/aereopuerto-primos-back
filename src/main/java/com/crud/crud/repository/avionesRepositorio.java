/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crud.repository;

import com.crud.crud.Projection.AvionProyection;
import com.crud.crud.Projection.avionesProyection;
import com.crud.crud.Projection.nombreAereolineaProyection;
import com.crud.crud.Projection.nombreAereopuertoProyection;
import com.crud.crud.model.aviones;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author conco
 */
public interface avionesRepositorio extends CrudRepository<aviones, Integer> {

    @Query(value = "select a.id_avion, a.no_placa, a.capacidad_asientos , a.estado_avion , a.dimensiones, a2.nombre_aereolinea,a3.nombre_aereopuerto \n"
            + "            from public.aviones a \n"
            + "            inner join public.aereolinea a2 on  a2.id_aereolinea = a.id_aereolinea \n"
            + "            inner join public.aereopuerto a3  on  a3.id_aereopuerto = a.id_aereopuerto", nativeQuery = true)
    List<avionesProyection> traerTabla();

    @Query(value = "select id_aereopuerto, nombre_aereopuerto from aereopuerto ", nativeQuery = true)
    List<nombreAereopuertoProyection> traerNombreAereopuerto();

    @Query(value = "select id_aereolinea , nombre_aereolinea  from aereolinea ", nativeQuery = true)
    List<nombreAereolineaProyection> traerNombreAereolinea();

    @Query(value = "select id_avion, no_placa from aviones ", nativeQuery = true)
    List<AvionProyection> obtenerAvion();
}
