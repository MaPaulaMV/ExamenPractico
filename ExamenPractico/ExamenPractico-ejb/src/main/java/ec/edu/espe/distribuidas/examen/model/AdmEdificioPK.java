/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 19:43:18
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
public class AdmEdificioPK implements Serializable{
    
    @Column(name="COD_SEDE",nullable = false, length = 10)
    private String codigoSede;
    
    @Column(name = "COD_EDIFICIO",nullable = false,length = 10)
    private String codigoEdificio;

    public AdmEdificioPK() {
    }

    public AdmEdificioPK(String codigoSede, String codigoEdificio) {
        this.codigoSede = codigoSede;
        this.codigoEdificio = codigoEdificio;
    }

    public String getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(String codigoSede) {
        this.codigoSede = codigoSede;
    }

    public String getCodigoEdificio() {
        return codigoEdificio;
    }

    public void setCodigoEdificio(String codigoEdificio) {
        this.codigoEdificio = codigoEdificio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.codigoSede);
        hash = 67 * hash + Objects.hashCode(this.codigoEdificio);
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
        final AdmEdificioPK other = (AdmEdificioPK) obj;
        if (!Objects.equals(this.codigoSede, other.codigoSede)) {
            return false;
        }
        if (!Objects.equals(this.codigoEdificio, other.codigoEdificio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmEdificioPK{" + "codigoSede=" + codigoSede + ", codigoEdificio=" + codigoEdificio + '}';
    }
    
    
}
