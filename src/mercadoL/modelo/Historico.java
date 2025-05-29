/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoL.modelo;

import java.util.Date;

public class Historico {
    private String numeroFatura;
    private Date fecha;
    private Integer cantidad;
    private Zapatilla zapatilla;

    public Historico(String numeroFatura, Date fecha, Integer cantidad, Zapatilla zapatilla) {
        this.numeroFatura = numeroFatura;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.zapatilla = zapatilla;
    }

    public Historico() {
    }
    
    public String getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(String numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Zapatilla getZapatilla() {
        return zapatilla;
    }

    public void setZapatilla(Zapatilla zapatilla) {
        this.zapatilla = zapatilla;
    }
    
    
}
