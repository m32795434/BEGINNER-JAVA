package cochesSOLID;

//Principio de inversion de dependencias + polimorfismo
//Al constructor pasa la conexion que sea, y se llama al método que para todas tiene el mismo nombre. Polimorfismo.
//El módulo de alto nivel, depende de abstracciones --> depende de Conexion, la interface.
public class AccesoADatos {
    private Conexion conexion;
    public AccesoADatos(Conexion conex){
        this.conexion = conex;
    }
    public String getDatos(){
        return conexion.getDatos();
    }
    public void setDatos(){
        conexion.setDatos();
    }
}
