package org.example;

import Objetos.Defensa;
import Objetos.Delantero;
import Objetos.Portero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Portero p1 = new Portero("Ivan",21,"Emelect",12,2,15);
        Defensa d1 = new Defensa("Joseph",18,"Liga",15);
        Delantero de1 = new Delantero("Jose",23,"Liga");

        p1.mostrarInfo();
        d1.mostrarInf();
        de1.mostrarInf();

        Portero p2 = new Portero();
        System.out.println("Ingrese el nombre del portero: ");
        p2.setNombre(input.nextLine());
        System.out.println("Ingrese la edad");
        p2.setEdad(input.nextInt());
        System.out.println("Ingrese el Equipo al que pertenece: ");
        p2.setEquipo(input.nextLine());
        System.out.println("Ingrese el Equipo el numero de atajadas: ");
        p2.setAtajadas(input.nextInt());
        System.out.println("Ingrese el Equipo el numero de goles Recibidos: ");
        p2.setGolesRecibidos(input.nextInt());
        System.out.println("Ingrese el Equipo el numero de Camiseta: ");
        p2.setNumCamiseta(input.nextInt());

        p2.mostrarInfo();

        


    }
}