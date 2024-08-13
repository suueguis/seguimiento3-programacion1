package Ejercicio2;

public class Estudiante {
       String nombres;
       String apellidos;
       int grado;
       int edad;
       double promedioAcademico;
       String nombreMadre;
       String nombrePadre;
       String telefono1;
       String telefono2;

       Estudiante(String nombres, String apellidos, int grado, int edad, double promedioAcademico, String nombreMadre, String nombrePadre) {
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.grado = grado;
            this.edad = edad;
            this.promedioAcademico = promedioAcademico;
            this.nombreMadre = nombreMadre;
            this.nombrePadre = nombrePadre;

        }

        Estudiante(String nombres, String apellidos, int grado, int edad, double promedioAcademico, String nombreMadre, String nombrePadre, String telefono1) {
            this(nombres, apellidos, grado, edad, promedioAcademico, nombreMadre, nombrePadre);
            this.telefono1 = telefono1;
        }

        Estudiante(String nombres, String apellidos, int grado, int edad, double promedioAcademico, String nombreMadre, String nombrePadre, String telefono1, String telefono2) {
            this(nombres, apellidos, grado, edad, promedioAcademico, nombreMadre, nombrePadre, telefono1);
            this.telefono2 = telefono2;
        }

        public void imprimirDatos() {
            System.out.println("Nombres: " + nombres);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Grado: " + grado);
            System.out.println("Edad: " + edad);
            System.out.println("Promedio Académico: " + promedioAcademico);
            System.out.println("Nombre de la Madre: " + nombreMadre);
            System.out.println("Nombre del Padre: " + nombrePadre);
            System.out.println("Teléfono 1: " + telefono1);
            System.out.println("Teléfono 2: " + telefono2);
            System.out.println();
        }
}
