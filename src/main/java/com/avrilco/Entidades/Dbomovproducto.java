package com.avrilco.Entidades;
// Generated 11-15-2017 10:08:00 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Dbomovproducto generated by hbm2java
 */
public class Dbomovproducto  implements java.io.Serializable {


     private Integer id;
     private String codigo;
     private int cantidad;
     private BigDecimal precioFinal;
     private int razon;
     private Date fecha;
     private String crea;
     private String sucursal;
     private String almacen;
     private String tipo;

    public Dbomovproducto() {
    }

    public Dbomovproducto(String codigo, int cantidad, BigDecimal precioFinal, int razon, Date fecha, String crea, String sucursal, String almacen, String tipo) {
       this.codigo = codigo;
       this.cantidad = cantidad;
       this.precioFinal = precioFinal;
       this.razon = razon;
       this.fecha = fecha;
       this.crea = crea;
       this.sucursal = sucursal;
       this.almacen = almacen;
       this.tipo = tipo;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getPrecioFinal() {
        return this.precioFinal;
    }
    
    public void setPrecioFinal(BigDecimal precioFinal) {
        this.precioFinal = precioFinal;
    }
    public int getRazon() {
        return this.razon;
    }
    
    public void setRazon(int razon) {
        this.razon = razon;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getCrea() {
        return this.crea;
    }
    
    public void setCrea(String crea) {
        this.crea = crea;
    }
    public String getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    public String getAlmacen() {
        return this.almacen;
    }
    
    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




}


