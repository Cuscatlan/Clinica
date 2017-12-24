package com.avrilco.Model;
// Generated 12-24-2017 12:58:51 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Persona generated by hbm2java
 */
@Entity
@Table(name="persona"
    ,catalog="siac"
)
public class Persona  implements java.io.Serializable {


     private Integer idpersona;
     private String snombre;
     private String sapellido;
     private String scargo;
     private String sdui;
     private Date dfechanacimiento;
     private Set clientes = new HashSet(0);
     private Set empleados = new HashSet(0);
     private Set telefonos = new HashSet(0);
     private Set direccions = new HashSet(0);

    public Persona() {
    }

    public Persona(String snombre, String sapellido, String scargo, String sdui, Date dfechanacimiento, Set clientes, Set empleados, Set telefonos, Set direccions) {
       this.snombre = snombre;
       this.sapellido = sapellido;
       this.scargo = scargo;
       this.sdui = sdui;
       this.dfechanacimiento = dfechanacimiento;
       this.clientes = clientes;
       this.empleados = empleados;
       this.telefonos = telefonos;
       this.direccions = direccions;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="IDPERSONA", unique=true, nullable=false)
    public Integer getIdpersona() {
        return this.idpersona;
    }
    
    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    
    @Column(name="SNOMBRE", length=50)
    public String getSnombre() {
        return this.snombre;
    }
    
    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    
    @Column(name="SAPELLIDO", length=50)
    public String getSapellido() {
        return this.sapellido;
    }
    
    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    
    @Column(name="SCARGO", length=30)
    public String getScargo() {
        return this.scargo;
    }
    
    public void setScargo(String scargo) {
        this.scargo = scargo;
    }

    
    @Column(name="SDUI", length=10)
    public String getSdui() {
        return this.sdui;
    }
    
    public void setSdui(String sdui) {
        this.sdui = sdui;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DFECHANACIMIENTO", length=10)
    public Date getDfechanacimiento() {
        return this.dfechanacimiento;
    }
    
    public void setDfechanacimiento(Date dfechanacimiento) {
        this.dfechanacimiento = dfechanacimiento;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set getTelefonos() {
        return this.telefonos;
    }
    
    public void setTelefonos(Set telefonos) {
        this.telefonos = telefonos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set getDireccions() {
        return this.direccions;
    }
    
    public void setDireccions(Set direccions) {
        this.direccions = direccions;
    }




}


