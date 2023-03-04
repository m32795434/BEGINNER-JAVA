package personaArgentinaProgMC;

public class Vehiculo {
    private int cantidadDeRuedas;

    public Vehiculo(int r){
    this.cantidadDeRuedas = r;
}
public int getCantidadDeRuedas(){
        return cantidadDeRuedas;
}
public void setCantidadDeRuedas(int c){
        this.cantidadDeRuedas = c;
}
public String frenar(){
        return "Frenó!";
}
}

