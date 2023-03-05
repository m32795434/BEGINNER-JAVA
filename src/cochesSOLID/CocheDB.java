package cochesSOLID;

//Principio de Responsabilidad Unica
//CocheDB no está dentro de Coche

public class CocheDB {
    public void guardarCocheDB(){
        System.out.println("Guardando coche en DB");
    }
    public void eliminarCocheDB(){
        System.out.println("Eliminando coche de la DB");
    }
}
