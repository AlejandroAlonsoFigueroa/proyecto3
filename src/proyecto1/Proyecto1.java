package proyecto1;

public class Proyecto1 {

    public static void main(String[] args) {
       System.out.println("Hola Mundo!!");
       //ConexionDB.getInstance(); 
       
       Persona p = new Persona();
       p.setClave("01");
       p.setNombre("juan");
       p.setDireccion("Av1");
       p.setTelefono("271123456");
       
       DAOPersona daop = new DAOPersona();
       boolean r = daop.guardar(p);
        if (r)
            System.out.println("Se guardo correcto :D");
        else
            System.out.println("Error Al guardar");
       
    }
    
}
