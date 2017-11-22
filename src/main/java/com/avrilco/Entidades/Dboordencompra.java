package com.avrilco.Entidades;
// Generated 11-15-2017 10:08:00 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Dboordencompra generated by hbm2java
 */
public class Dboordencompra  implements java.io.Serializable {


     private Integer id;
     private int nunOrden;
     private Date fecha;
     private int proveedor;
     private BigDecimal monto;
     private String crea;
     private String sucursal;
     private String observacion;
     private int estado;

    public Dboordencompra() {
    }

	
    public Dboordencompra(int nunOrden, Date fecha, int proveedor, BigDecimal monto, String crea, String sucursal, int estado) {
        this.nunOrden = nunOrden;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.monto = monto;
        this.crea = crea;
        this.sucursal = sucursal;
        this.estado = estado;
    }
    public Dboordencompra(int nunOrden, Date fecha, int proveedor, BigDecimal monto, String crea, String sucursal, String observacion, int estado) {
       this.nunOrden = nunOrden;
       this.fecha = fecha;
       this.proveedor = proveedor;
       this.monto = monto;
       this.crea = crea;
       this.sucursal = sucursal;
       this.observacion = observacion;
       this.estado = estado;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getNunOrden() {
        return this.nunOrden;
    }
    
    public void setNunOrden(int nunOrden) {
        this.nunOrden = nunOrden;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
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
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }




}


