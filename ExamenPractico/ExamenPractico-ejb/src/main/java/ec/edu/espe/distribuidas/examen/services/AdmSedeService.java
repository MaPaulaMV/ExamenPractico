/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 21:07:02
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.examen.services;

import ec.edu.espe.distribuidas.examen.dao.AdmSedeDAO;
import ec.edu.espe.distribuidas.examen.model.AdmSede;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Paula
 */
@Stateless
@LocalBean
public class AdmSedeService {
    
    @EJB
    private AdmSedeDAO dao;
    
    public AdmSede obtenerPorPK(String codigoSede)
    {
        return dao.find(codigoSede);
    }
    
    public List<AdmSede> obtenerTodos()
    {
        return dao.findAll();
    }
    
    public void crear (AdmSede sede)
    {
        dao.create(sede);
    }
    
    public void actualizar (AdmSede sede){
        dao.edit(sede);
    }
}
