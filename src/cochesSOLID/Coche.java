package cochesSOLID;

//Principio de Abierto - Cerrado
//se define una interfaz común para un conjunto de algoritmos relacionados y se implementan varias clases que
// encapsulan diferentes implementaciones de estos algoritmos.
//Audi, Renault, harán uso de estos métodos descriptos abajo, a su manera..y así lo pueden hacer futuras clases
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

