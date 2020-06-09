package proyecto1;

import uv.principios.utils.ConexionDB;

public class DAOPersona {
    public boolean guardar(Persona p){
        boolean res = false;
        ConexionDB con = ConexionDB.getInstance();
        String sql="insert into persona (clave,nombre,direccion,telefono) values('"+p.getClave()+"','"+p.getNombre()+"','"+p.getDireccion()+"','"+p.getTelefono()+"')";
        res = con.execute(sql);
        
        return res;
        
        
    }
    public void funcionPrueba() {
        System.out.println("Imprime algo");
    }
}
