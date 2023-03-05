package cochesSOLID;

public class ApiService implements Conexion{
    @Override
    public String getDatos(){
        return "Retornando data de la Api";
    }
    @Override
    public void setDatos(){
        System.out.println("Setting data to the Api");
    }
}
