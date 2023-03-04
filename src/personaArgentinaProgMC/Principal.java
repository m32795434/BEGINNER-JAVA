package personaArgentinaProgMC;

public class Principal {
    public static void main(String[] args) {
        Docente docente1 = new Docente("Manuel", "Bravard", 35, "Logica");
        Estudiante est1 = new Estudiante("Pepe", "Argento", 50, "Logica");
        System.out.println("El estudiante 1 estudia la materia: "+ est1.getMateria());
        Auto a1 = new Auto(4);
        docente1.setVehiculo(a1);
        System.out.println("Actividad del Vehiculo del docente: "+ docente1.getVehiculo().frenar());
    }
}
