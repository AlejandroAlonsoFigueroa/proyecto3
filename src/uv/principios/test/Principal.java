/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.principios.test;

import uv.principios.dao.Persona;
import uv.principios.dao.Departamento;
import uv.principios.dao.FactoryDAO;
import uv.principios.dao.IDAOGeneral;

/**
 *
 * @author gaddiel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IDAOGeneral daop = FactoryDAO.create(FactoryDAO.TypeDAO.PERSONA);
        
        Persona p = new Persona();
        
        p.setClave("01");
        p.setNombre("Juan");
        p.setDireccion("av. 1");
        p.setTelefono("777");
        
        Departamento d = new Departamento();
        d.setClave("01");
        
        p.setD(d);
        
//        p.setD(new Departamento().setClave("dd"));
        
        daop.guardar(p);
                
        
    }
    
}
