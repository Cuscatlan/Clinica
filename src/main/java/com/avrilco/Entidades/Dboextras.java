package com.avrilco.Entidades;
// Generated 11-15-2017 10:08:00 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Dboextras generated by hbm2java
 */
public class Dboextras  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private int cantidad;
     private BigDecimal precioCompra;
     private BigDecimal precioVenta;
     private int stock;
     private Date fecha;
     private String estado;

    public Dboextras() {
    }

    public Dboextras(String nombre, int cantidad, BigDecimal precioCompra, BigDecimal precioVenta, int stock, Date fecha, String estado) {
       this.nombre = nombre;
       this.cantidad = cantidad;
       this.precioCompra = precioCompra;
       this.precioVenta = precioVenta;
       this.stock = stock;
       this.fecha = fecha;
       this.estado = estado;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getPrecioCompra() {
        return this.precioCompra;
    }
    
    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }
    public BigDecimal getPrecioVenta() {
        return this.precioVenta;
    }
    
    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


