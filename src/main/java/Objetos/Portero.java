package Objetos;

public class Portero extends Jugador {
    /*Hereda de Jugador.
    Añade dos atributos específicos: atajadas (cantidad de atajadas realizadas) y golesRecibidos (cantidad de goles recibidos).
    Metodo mostrarInfo() que sobrescribe el de la superclase para mostrar los atributos */
    private int atajadas;
    private int golesRecibidos;
    private int numCamiseta;

    public Portero(){
        super();
    }

    public Portero(String nombre, int edad, String equipo, int atajadas, int golesRecibidos, int numCamiseta) {
        super(nombre, edad, equipo);
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
        this.numCamiseta = numCamiseta;
    }

    public int getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(int atajadas) {
        this.atajadas = atajadas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public void mostrarInfo(){
        System.out.println("************************************");
        System.out.println("PORTERO");
        super.mostarInfo();
        System.out.println("El numero de atajadas es: "+atajadas+" \n EL numero de goles recibidos: "+golesRecibidos
                +" \n EL numero de camiseta: "+numCamiseta);
        System.out.println("***********************************");
    }
}
