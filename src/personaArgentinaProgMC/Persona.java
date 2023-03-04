package personaArgentinaProgMC;

public class Persona {
    private Vehiculo vehiculo;
    private String nombre;
    private String apellido;
    private int DNI = 0;
    private String materia;

    public Persona(String nombre, String apellido, int dni, String materia){
        this.DNI = dni;
        this.nombre = nombre;
        this.materia = materia;
        this.apellido = apellido;
    }
    public void setVehiculo(Vehiculo newVehi){
        vehiculo = newVehi;
    }
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String newApellido){
        this.apellido = newApellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setDNI(int newDni){
        this.DNI = newDni;
    }
    public int getDNI(){
        return DNI;
    }
    public void setMateria(String newMateria){
        this.materia = newMateria;
    }
    public String getMateria(){
        return materia;
    }
    public Boolean pagaCoop(Float monto){
        return false;
    }
}
