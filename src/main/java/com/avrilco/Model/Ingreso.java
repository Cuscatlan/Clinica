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
 * Ingreso generated by hbm2java
 */
@Entity
@Table(name="ingreso"
    ,catalog="siac"
)
public class Ingreso  implements java.io.Serializable {


     private Integer idingreso;
     private Cliente cliente;
     private String snombre;
     private Float vmonto;
     private String srazon;
     private Boolean bestado;

    public Ingreso() {
    }

	
    public Ingreso(Cliente cliente) {
        this.cliente = cliente;
    }
    public Ingreso(Cliente cliente, String snombre, Float vmonto, String srazon, Boolean bestado) {
       this.cliente = cliente;
       this.snombre = snombre;
       this.vmonto = vmonto;
       this.srazon = srazon;
       this.bestado = bestado;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="IDINGRESO", unique=true, nullable=false)
    public Integer getIdingreso() {
        return this.idingreso;
    }
    
    public void setIdingreso(Integer idingreso) {
        this.idingreso = idingreso;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDCLIENTE", nullable=false)
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    @Column(name="SNOMBRE", length=50)
    public String getSnombre() {
        return this.snombre;
    }
    
    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    
    @Column(name="VMONTO", precision=10)
    public Float getVmonto() {
        return this.vmonto;
    }
    
    public void setVmonto(Float vmonto) {
        this.vmonto = vmonto;
    }

    
    @Column(name="SRAZON", length=65535)
    public String getSrazon() {
        return this.srazon;
    }
    
    public void setSrazon(String srazon) {
        this.srazon = srazon;
    }

    
    @Column(name="BESTADO")
    public Boolean getBestado() {
        return this.bestado;
    }
    
    public void setBestado(Boolean bestado) {
        this.bestado = bestado;
    }




}

