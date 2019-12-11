/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 20:15:38
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.examen.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Paula
 */
@Embeddable
public class AdmAsignatParalHorarioPK implements Serializable{
    
    @Column(name = "COD_ASIGNATURA",nullable = false)
    private Integer codigoAsignatura;
    
    @Column(name = "PARALELO",nullable = false,length = 1)
    private String paralelo;
    
    @Column(name = "COD_AULA",nullable = false)
    private Integer codigoAula;
    
    @Column(name = "DIA",nullable = false, length = 3)
    private String dia;

    public AdmAsignatParalHorarioPK() {
    }

    public AdmAsignatParalHorarioPK(Integer codigoAsignatura, String paralelo, Integer codigoAula, String dia) {
        this.codigoAsignatura = codigoAsignatura;
        this.paralelo = paralelo;
        this.codigoAula = codigoAula;
        this.dia = dia;
    }

    public Integer getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(Integer codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public Integer getCodigoAula() {
        return codigoAula;
    }

    public void setCodigoAula(Integer codigoAula) {
        this.codigoAula = codigoAula;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.codigoAsignatura);
        hash = 83 * hash + Objects.hashCode(this.paralelo);
        hash = 83 * hash + Objects.hashCode(this.codigoAula);
        hash = 83 * hash + Objects.hashCode(this.dia);
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
        final AdmAsignatParalHorarioPK other = (AdmAsignatParalHorarioPK) obj;
        if (!Objects.equals(this.paralelo, other.paralelo)) {
            return false;
        }
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        if (!Objects.equals(this.codigoAsignatura, other.codigoAsignatura)) {
            return false;
        }
        if (!Objects.equals(this.codigoAula, other.codigoAula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatParalHorarioPK{" + "codigoAsignatura=" + codigoAsignatura + ", paralelo=" + paralelo + ", codigoAula=" + codigoAula + ", dia=" + dia + '}';
    }
        
}
