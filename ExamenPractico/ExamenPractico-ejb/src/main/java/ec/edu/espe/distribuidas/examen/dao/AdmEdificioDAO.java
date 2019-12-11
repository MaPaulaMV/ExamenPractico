/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 20:49:42
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.examen.dao;

import ec.edu.espe.distribuidas.examen.model.AdmEdificio;
import java.util.List;

/**
 *
 * @author Paula
 */
public class AdmEdificioDAO extends AbstractDAO<AdmEdificio>{
    
    public AdmEdificioDAO()
    {
        super(AdmEdificio.class);
    }
    
    public List<AdmEdificio> findEdificiosBySede(String codigoSede){
        return this.finder( 
                "SELECT e FROM AdmEdificio e WHERE e.admSede.codigo=?1",
                new Object[]{
                    codigoSede
                }
        );
    }
    
    
}
