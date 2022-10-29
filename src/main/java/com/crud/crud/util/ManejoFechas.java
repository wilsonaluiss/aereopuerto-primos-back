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
    
    public static String dateToString(Date pFechaDate) {
        if (pFechaDate != null) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fechaString = dateFormat.format(pFechaDate);
            return fechaString;
        } else {
            return "";
        }
    }
    
    
    public static Date stringToDate(String pFechaString) {
        Date fecha = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fecha = formatter.parse(pFechaString);
        } catch (ParseException e) {
            System.out
                    .println("ManejoFechas-StringToDate. Error al parser fecha." + pFechaString);
        }
        return fecha;
    }
    
}
