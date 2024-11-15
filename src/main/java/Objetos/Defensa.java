package Objetos;

public class Defensa extends Jugador {
    /*Hereda de Jugador.
    Añade un atributo específico: bloqueos (cantidad de bloqueos realizados).
    Metodo mostrarInfo() que sobrescribe el de la superclase para mostrar el atributo adicional.
    */
    private int bloqueos;

    public Defensa(String nombre, int edad, String equipo, int bloqueos) {
        super(nombre, edad, equipo);
        this.bloqueos = bloqueos;
    }

    public void mostrarInf(){
        System.out.println("***********************************");
        System.out.println("DEFENSA");
        super.mostarInfo();
        System.out.println("EL numero de bloqueos :"+bloqueos);
        System.out.println("***********************************");
    }
}
