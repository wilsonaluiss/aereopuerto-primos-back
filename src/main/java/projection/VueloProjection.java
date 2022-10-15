/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package projection;

import java.util.Date;

/**
 *
 * @author Wilson
 */
public interface VueloProjection {
    
    public String getOrigen();
    public String getDestino();
    public Date getHoraSalida();
    public Date getHoraLlegada();
    public float getCostoAsientos();
    public String getUsuarioCrea();
    public String getUsuarioModifica();
    public int	getIdAvion();
    public int	getIdTripulacion();
    public String getNombreAsiento();
    public String getUbicacionAsiento();
    public String getEstadoVuelo();
}
