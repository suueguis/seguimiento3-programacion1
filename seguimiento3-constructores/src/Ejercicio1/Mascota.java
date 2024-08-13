package Ejercicio1;

public class Mascota {
    String nombre;
    int edad;
    String raza;
    String color;

    Mascota(String nombre, int edad, String raza, String color){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }

    public void Imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
    }
}


