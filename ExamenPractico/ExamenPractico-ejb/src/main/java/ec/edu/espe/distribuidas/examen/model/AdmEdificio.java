/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 19:42:14
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.examen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Paula
 */
@Entity
@Table(name="ADM_EDIFICIO",catalog = "distribuidasexamen",schema ="" )
public class AdmEdificio implements Serializable{
    
    @EmbeddedId
    private AdmEdificioPK pk;
    
    @Column(name="NOMBRE",nullable = false,length =100)
    private String nombre;
    
    @Column(name = "LATITUD",nullable = false, length = 10, precision = 7)
    private BigDecimal latitud;
    
    @Column(name = "LONGITUD",nullable = false, length = 10, precision = 7)
    private BigDecimal longitud;
    
    @PrimaryKeyJoinColumn(name = "COD_SEDE",referencedColumnName = "COD_SEDE")
    @ManyToOne
    private AdmSede admSede;
    
    @OneToMany(mappedBy = "edificio",fetch = FetchType.LAZY)
    private List<AdmAula> aulas;

    public AdmEdificio() {
    }

    public AdmEdificio(AdmEdificioPK pk) {
        this.pk = pk;
    }
    
    public AdmEdificio(String codigoSede,String codigoEdificio) {
        this.pk=new AdmEdificioPK(codigoSede, codigoEdificio);
    }

    public AdmEdificioPK getPk() {
        return pk;
    }

    public void setPk(AdmEdificioPK pk) {
        this.pk = pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public AdmSede getAdmSede() {
        return admSede;
    }

    public void setAdmSede(AdmSede admSede) {
        this.admSede = admSede;
    }

    public List<AdmAula> getAulas() {
        return aulas;
    }

    public void setAulas(List<AdmAula> aulas) {
        this.aulas = aulas;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.pk);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdmEdificio other = (AdmEdificio) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmEdificio{" + "pk=" + pk + '}';
    }    
    
}
