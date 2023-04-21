package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Pablo";
        cliente.edad = 34;
        cliente.telefono = 642987445;
        cliente.credito = 2987.23;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + "€");

        trabajador.nombre = "Juan";
        trabajador.edad = 37;
        trabajador.telefono = 643558472;
        trabajador.salario = 3557.96;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");

    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
