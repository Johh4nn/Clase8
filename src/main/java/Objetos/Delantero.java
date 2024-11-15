package Objetos;

public class Delantero extends Jugador{
    public Delantero(String nombre, int edad, String equipo) {
        super(nombre, edad, equipo);
    }

    public void mostrarInf(){
        System.out.println("***********************************");
        System.out.println("DELANTERO");
        super.mostarInfo();
        System.out.println("***********************************");
    }
}
