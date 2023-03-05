package cochesSOLID;

//Principio de Segregacion de Interfaz - PcAbordo solo aplica los métodos necesarios. Si se necesitan más para otras clases, crear otas interfaces
//Java no tiene herencia multiple, pero si interfaces.
public class Audi extends Coche implements PcAbordo{
public Audi(String m){
    super(m);
}
    @Override
    public int precioMedioCoche(){
    return 20000;
}
    @Override
    public int numAsientos(){
    return 8;
}
@Override
    public String pcAbordo(){
   return "Pc abordo endencida...";
}
}
