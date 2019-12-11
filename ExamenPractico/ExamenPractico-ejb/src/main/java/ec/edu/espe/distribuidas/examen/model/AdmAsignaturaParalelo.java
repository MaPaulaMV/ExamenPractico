/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 20:12:51
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.examen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Paula
 */
@Entity
@Table(name="ADM_ASIGNATURA_PARALELO",catalog = "distribuidasexamen",schema ="" )
public class AdmAsignaturaParalelo implements Serializable{
    
    @EmbeddedId
    private AdmAsignaturaParaleloPK pk;
    
    @Column(name="ALUMNOS",nullable = false,length = 2)
    private BigDecimal alumnos;
    
    @Column(name="ESTADO",nullable = false,length = 3)
    private String estado;
    
    @PrimaryKeyJoinColumn(name = "COD_ASIGNATURA",referencedColumnName = "COD_ASIGNATURA")
    @ManyToOne
    private AdmAsignatura asignatura;

    public AdmAsignaturaParalelo() {
    }

    public AdmAsignaturaParalelo(AdmAsignaturaParaleloPK pk) {
        this.pk = pk;
    }
    
    public AdmAsignaturaParalelo(Integer codigoAsignatura,String paralelo) {
        this.pk=new AdmAsignaturaParaleloPK(codigoAsignatura, paralelo);
    }

    public AdmAsignaturaParaleloPK getPk() {
        return pk;
    }

    public void setPk(AdmAsignaturaParaleloPK pk) {
        this.pk = pk;
    }

    public BigDecimal getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(BigDecimal alumnos) {
        this.alumnos = alumnos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public AdmAsignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(AdmAsignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.pk);
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
        final AdmAsignaturaParalelo other = (AdmAsignaturaParalelo) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignaturaParalelo{" + "pk=" + pk + '}';
    }
    
    
}
