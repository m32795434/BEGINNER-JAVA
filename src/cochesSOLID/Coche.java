package cochesSOLID;

//Principio de Abierto - Cerrado
public abstract class Coche {
protected String marca;
abstract int precioMedioCoche();
abstract int numAsientos();

protected Coche(String m){
    this.marca = m;
}
protected String getMarcaCoche(){
    return this.marca;
}
}

