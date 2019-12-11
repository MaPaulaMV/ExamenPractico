/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 20:08:55
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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Paula
 */
@Entity
@Table(name="ADM_ASIGNATURA",catalog = "distribuidasexamen",schema ="" )
public class AdmAsignatura implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Column(name="NOMBRE",nullable = false,length = 100)
    private String nombre;
    
    @Column(name = "CREDITOS",nullable = false,length = 2)
    private BigDecimal creditos;
    
    @OneToMany(mappedBy = "asignatura",fetch = FetchType.LAZY)
    private List<AdmAsignaturaParalelo> asignaturasParalelos;

    public AdmAsignatura() {
    }

    public AdmAsignatura(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getCreditos() {
        return creditos;
    }

    public void setCreditos(BigDecimal creditos) {
        this.creditos = creditos;
    }

    public List<AdmAsignaturaParalelo> getAsignaturasParalelos() {
        return asignaturasParalelos;
    }

    public void setAsignaturasParalelos(List<AdmAsignaturaParalelo> asignaturasParalelos) {
        this.asignaturasParalelos = asignaturasParalelos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.codigo);
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
        final AdmAsignatura other = (AdmAsignatura) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatura{" + "codigo=" + codigo + '}';
    }
 
}
