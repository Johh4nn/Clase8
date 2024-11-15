package Objetos;

public class Jugador {
   /* Atributos comunes a todos los jugadores: nombre, edad, y equipo.
Constructor para inicializar estos atributos. */
    // Metodo mostrarInfo() para mostrar la información común de un jugador.

    protected String nombre;
    protected int edad;
    protected String equipo;


    public Jugador() {
    }

    public Jugador(String nombre, int edad, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void mostarInfo(){

        System.out.println("DATOS DEL JUGADOR");
        System.out.println("Nombre: "+nombre+" Edad: "+edad+" Equipo: "+equipo);
    }
}
