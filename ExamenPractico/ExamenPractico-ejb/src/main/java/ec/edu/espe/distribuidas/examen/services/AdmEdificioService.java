/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ExamenPractico-ejb
 * 
 * Creado: 10/12/2019 - 21:07:13
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.examen.services;

import ec.edu.espe.distribuidas.examen.dao.AdmEdificioDAO;
import ec.edu.espe.distribuidas.examen.model.AdmEdificio;
import ec.edu.espe.distribuidas.examen.model.AdmEdificioPK;
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
public class AdmEdificioService {
    
    @EJB
    private AdmEdificioDAO dao;
    
    public AdmEdificio obtenerPorPK(AdmEdificioPK pk)
    {
        return dao.find(pk);
    }
    
    public List<AdmEdificio> obtenerTodos()
    {
        return dao.findAll();
    }
    
    public List<AdmEdificio> obtenerEdificiosPorSede(String codigoSede){
        return dao.findEdificiosBySede(codigoSede);
    }
    
    public void crear (AdmEdificio edificio)
    {
        dao.create(edificio);
    }
    
    public void actualizar (AdmEdificio edificio){
        dao.edit(edificio);
    }
    
     public void eliminar (AdmEdificio edificio)
    {
        dao.remove(edificio);
    }
    
    
    
}
