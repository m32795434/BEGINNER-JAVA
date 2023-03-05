package cochesSOLID;

public class Renault extends Coche{
    public Renault(String m){
        super(m);
    }
    @Override
    int precioMedioCoche(){
        return 18000;
    }
    @Override
    public int numAsientos(){
        return 6;
    }
}
