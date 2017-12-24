package com.avrilco.Model;
// Generated 12-24-2017 12:58:51 PM by Hibernate Tools 4.3.1


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

/**
 * Tiposolicitud generated by hbm2java
 */
@Entity
@Table(name="tiposolicitud"
    ,catalog="siac"
)
public class Tiposolicitud  implements java.io.Serializable {


     private Integer idtiposolicitud;
     private String snombre;
     private Boolean bestado;
     private Set solicituds = new HashSet(0);

    public Tiposolicitud() {
    }

    public Tiposolicitud(String snombre, Boolean bestado, Set solicituds) {
       this.snombre = snombre;
       this.bestado = bestado;
       this.solicituds = solicituds;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="IDTIPOSOLICITUD", unique=true, nullable=false)
    public Integer getIdtiposolicitud() {
        return this.idtiposolicitud;
    }
    
    public void setIdtiposolicitud(Integer idtiposolicitud) {
        this.idtiposolicitud = idtiposolicitud;
    }

    
    @Column(name="SNOMBRE", length=50)
    public String getSnombre() {
        return this.snombre;
    }
    
    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    
    @Column(name="BESTADO")
    public Boolean getBestado() {
        return this.bestado;
    }
    
    public void setBestado(Boolean bestado) {
        this.bestado = bestado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tiposolicitud")
    public Set getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set solicituds) {
        this.solicituds = solicituds;
    }




}


