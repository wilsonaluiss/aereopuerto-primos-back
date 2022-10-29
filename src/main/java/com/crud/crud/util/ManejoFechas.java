/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.crud.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Wilson
 */
public class ManejoFechas {
    
    
    public ManejoFechas() {
    }
    
  public static Date stringToDate(String pFechaString, String pFormato) {
        Date fecha = null;
        SimpleDateFormat formatter = new SimpleDateFormat(pFormato);
        try {
            fecha = formatter.parse(pFechaString);
        } catch (ParseException e) {
            System.out
                    .println("ManejoFechas-StringToDate. Error al parser fecha." + pFechaString);
        }
        return fecha;
    }
    
}
