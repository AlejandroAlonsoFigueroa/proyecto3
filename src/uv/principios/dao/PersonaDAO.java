/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.principios.dao;

import uv.principios.utils.ConexionDB;

/**
 *
 * @author gaddiel
 */
public class PersonaDAO implements IDAOGeneral<Persona>{

    @Override
    public boolean guardar(Persona pojo) {
        boolean res = false;
        ConexionDB con = ConexionDB.getInstance();
        String sql="insert into persona (clave,nombre,direccion,telefono,departamento) values('"+pojo.getClave()+ "','" +pojo.getNombre()+"','"+pojo.getDireccion()+"','"+pojo.getTelefono() +
               "','" + pojo.getD() + "')";
        res = con.execute(sql);
        return res;
    }
    
//    public class DAOPersona {
//    public boolean guardar(proyecto1.Persona p){
//        boolean res = false;
//        ConexionDB con = ConexionDB.getInstance();
//        String sql="insert into persona (clave,nombre,direccion,telefono) values('"+p.getClave()+"','"+p.getNombre()+"','"+p.getDireccion()+"','"+p.getTelefono()+"')";
//        res = con.execute(sql);
//        return res;
//    }
//}
    
}
