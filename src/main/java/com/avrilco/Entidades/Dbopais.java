package com.avrilco.Entidades;
// Generated 11-15-2017 10:08:00 PM by Hibernate Tools 4.3.1



/**
 * Dbopais generated by hbm2java
 */
public class Dbopais  implements java.io.Serializable {


     private Integer id;
     private String nombre;

    public Dbopais() {
    }

    public Dbopais(String nombre) {
       this.nombre = nombre;
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




}


