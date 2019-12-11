/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 20:07:00
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.examen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Paula
 */
@Entity
@Table(name="ADM_ASIGNAT_PARAL_HORARIO",catalog = "distribuidasexamen",schema ="" )
public class AdmAsignatParalHorario implements Serializable{
    
    @EmbeddedId
    private AdmAsignatParalHorarioPK pk;
    
    @Column(name = "HORA_INICIO",nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    
    @Column(name = "HORA_FIN",nullable = false)
    @Temporal(TemporalType.TIME)
    private Time horaFin;
    
    @Column(name="HORAS", nullable = false,length = 1)
    private BigDecimal horas;
    
    @PrimaryKeyJoinColumns({
        @PrimaryKeyJoinColumn(name = "COD_ASIGNATURA",referencedColumnName = "COD_ASIGNATURA"),
        @PrimaryKeyJoinColumn(name = "PARALELO",referencedColumnName = "PARALELO")
    })
    @ManyToOne
    private AdmAsignaturaParalelo asignaturaParalelo;
    
    @PrimaryKeyJoinColumn(name = "COD_AULA",referencedColumnName = "COD_AULA")
    @ManyToOne
    private AdmAula aula;

    public AdmAsignatParalHorario() {
    }

    public AdmAsignatParalHorario(AdmAsignatParalHorarioPK pk) {
        this.pk = pk;
    }
    
    public AdmAsignatParalHorario(Integer codigoAsignatura,String paralelo,Integer codigoAula,String dia) {
        this.pk=new AdmAsignatParalHorarioPK(codigoAsignatura, paralelo, codigoAula, dia);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.pk);
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
        final AdmAsignatParalHorario other = (AdmAsignatParalHorario) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatParalHorario{" + "pk=" + pk + '}';
    }
    
    
    
}
