package com.avrilco.Entidades;
// Generated 11-15-2017 10:08:00 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Dbouser generated by hbm2java
 */
public class Dbouser  implements java.io.Serializable {


     private String dui;
     private String nombre;
     private String correo;
     private String usuario;
     private String pass;
     private Date fecha;
     private int cargo;
     private int estado;
     private String foto;
     private String sucursal;

    public Dbouser() {
    }

    public Dbouser(String dui, String nombre, String correo, String usuario, String pass, Date fecha, int cargo, int estado, String foto, String sucursal) {
       this.dui = dui;
       this.nombre = nombre;
       this.correo = correo;
       this.usuario = usuario;
       this.pass = pass;
       this.fecha = fecha;
       this.cargo = cargo;
       this.estado = estado;
       this.foto = foto;
       this.sucursal = sucursal;
    }
   
    public String getDui() {
        return this.dui;
    }
    
    public void setDui(String dui) {
        this.dui = dui;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getCargo() {
        return this.cargo;
    }
    
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }




}


