package com.avrilco.Model;
// Generated 12-24-2017 12:58:51 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,catalog="siac"
)
public class Usuario  implements java.io.Serializable {


     private Integer idusuario;
     private Empleado empleado;
     private String susuario;
     private String scontrasena;
     private Boolean bestado;

    public Usuario() {
    }

	
    public Usuario(Empleado empleado) {
        this.empleado = empleado;
    }
    public Usuario(Empleado empleado, String susuario, String scontrasena, Boolean bestado) {
       this.empleado = empleado;
       this.susuario = susuario;
       this.scontrasena = scontrasena;
       this.bestado = bestado;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="IDUSUARIO", unique=true, nullable=false)
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDEMPLEADO", nullable=false)
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    
    @Column(name="SUSUARIO", length=20)
    public String getSusuario() {
        return this.susuario;
    }
    
    public void setSusuario(String susuario) {
        this.susuario = susuario;
    }

    
    @Column(name="SCONTRASENA", length=65535)
    public String getScontrasena() {
        return this.scontrasena;
    }
    
    public void setScontrasena(String scontrasena) {
        this.scontrasena = scontrasena;
    }

    
    @Column(name="BESTADO")
    public Boolean getBestado() {
        return this.bestado;
    }
    
    public void setBestado(Boolean bestado) {
        this.bestado = bestado;
    }




}


