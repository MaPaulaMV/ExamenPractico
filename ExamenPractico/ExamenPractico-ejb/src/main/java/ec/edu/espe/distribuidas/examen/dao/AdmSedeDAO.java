/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 20:49:33
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.examen.dao;

import ec.edu.espe.distribuidas.examen.model.AdmSede;

/**
 *
 * @author Paula
 */
public class AdmSedeDAO extends AbstractDAO<AdmSede>{
    
    public AdmSedeDAO(){
        super(AdmSede.class);
    }

    @Override
    public void remove(AdmSede entity) {
        throw new UnsupportedOperationException("Invocacion de método no permitida");
    }
    
    
    

}
