package cochesSOLID;

public class Principal {
    public static void main(String[] args) {
    Coche[] arrayCoches = {new Audi("Audi"), new Renault("Renault")};
    imprimirPrecioMedioCoche(arrayCoches);
    impirmirNumeroDeAsientos(arrayCoches);
    //pcAbordo-->metodo aportado por una interfaz
    Audi a1 = new Audi("Audi");
        System.out.println(a1.pcAbordo());

//AccesoADatos: costructor genérico de cualquier tipo de conexion.
// Llamo al "Objeto de tipo de la interfaz".getDatos(). Como el Principio de Sustituibilidad con una clase padre👇.
        AccesoADatos ADApi = new AccesoADatos(new ApiService());
        System.out.println("Retornando datos?..."+ADApi.getDatos());
    }

//    Principio de Sustituibilidad - Gracias a Abstract + Override + polimorfismo
    //Digo Coche[], no Audi[] o Renault[] por separado. Reemplazo por la clase padre abstracta. Mismo que con la interfaz arriba☝️, pero con una clase.
    public static void imprimirPrecioMedioCoche(Coche[] arrayCoches){
    for(Coche coche : arrayCoches){
        System.out.println("Este coche es de marca: " + coche.getMarcaCoche()+" y tiene un precio de: "+coche.precioMedioCoche());
}
    }
    public static void impirmirNumeroDeAsientos(Coche[] array){
        for(Coche coche : array){
            System.out.println("En un " + coche.getMarcaCoche() + " hay " + coche.numAsientos() + " asientos");
        }
    }
}
