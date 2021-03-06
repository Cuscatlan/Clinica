package net.cuscatlan.clinica.model;
// Generated 12-12-2017 11:03:56 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pago generated by hbm2java
 */
@Entity
@Table(name="pago"
    ,catalog="sirac_bd"
)
public class Pago  implements java.io.Serializable {


     private int idpago;
     private Citas citas;
     private Float montopago;
     private String formadepago;
     private Date fechalimitepago;
     private Float bancopago;
     private String numeroreservapago;

    public Pago() {
    }

	
    public Pago(int idpago) {
        this.idpago = idpago;
    }
    public Pago(int idpago, Citas citas, Float montopago, String formadepago, Date fechalimitepago, Float bancopago, String numeroreservapago) {
       this.idpago = idpago;
       this.citas = citas;
       this.montopago = montopago;
       this.formadepago = formadepago;
       this.fechalimitepago = fechalimitepago;
       this.bancopago = bancopago;
       this.numeroreservapago = numeroreservapago;
    }
   
     @Id 

    
    @Column(name="IDPAGO", unique=true, nullable=false)
    public int getIdpago() {
        return this.idpago;
    }
    
    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDCITAS")
    public Citas getCitas() {
        return this.citas;
    }
    
    public void setCitas(Citas citas) {
        this.citas = citas;
    }

    
    @Column(name="MONTOPAGO", precision=8)
    public Float getMontopago() {
        return this.montopago;
    }
    
    public void setMontopago(Float montopago) {
        this.montopago = montopago;
    }

    
    @Column(name="FORMADEPAGO", length=25)
    public String getFormadepago() {
        return this.formadepago;
    }
    
    public void setFormadepago(String formadepago) {
        this.formadepago = formadepago;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHALIMITEPAGO", length=10)
    public Date getFechalimitepago() {
        return this.fechalimitepago;
    }
    
    public void setFechalimitepago(Date fechalimitepago) {
        this.fechalimitepago = fechalimitepago;
    }

    
    @Column(name="BANCOPAGO", precision=8)
    public Float getBancopago() {
        return this.bancopago;
    }
    
    public void setBancopago(Float bancopago) {
        this.bancopago = bancopago;
    }

    
    @Column(name="NUMERORESERVAPAGO", length=10)
    public String getNumeroreservapago() {
        return this.numeroreservapago;
    }
    
    public void setNumeroreservapago(String numeroreservapago) {
        this.numeroreservapago = numeroreservapago;
    }




}


