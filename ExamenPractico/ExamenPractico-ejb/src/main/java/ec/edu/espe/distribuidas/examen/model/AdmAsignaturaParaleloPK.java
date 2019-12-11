/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 20:40:16
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.examen.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Paula
 */
@Embeddable
public class AdmAsignaturaParaleloPK implements Serializable{
    
    @Column(name="COD_ASIGNATURA",nullable = false)
    private Integer codigoAsignatura;
    
    @Column(name="PARALELO",nullable = false,length = 1)
    private String paralelo;

    public AdmAsignaturaParaleloPK() {
    }

    public AdmAsignaturaParaleloPK(Integer codigoAsignatura, String paralelo) {
        this.codigoAsignatura = codigoAsignatura;
        this.paralelo = paralelo;
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

    @Override
    public String toString() {
        return "AdmAsignaturaParaleloPK{" + "codigoAsignatura=" + codigoAsignatura + ", paralelo=" + paralelo + '}';
    }
    
    
    
}
