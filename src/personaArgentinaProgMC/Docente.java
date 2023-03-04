package personaArgentinaProgMC;

public class Docente extends Persona{
    private String asignatura;

    public Docente(String n, String a, int i, String m) {
        super(n, a, i, m);
    }


    public void setAsignatura(String newAsig){
    asignatura = newAsig;
}


public String getAsignatura() {
    return asignatura; };

    public void poneNota(){

}
}
