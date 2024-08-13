package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Estudiante Susana = new Estudiante("Susana", "Eguis Muñoz", 11, 17, 5.0, "Angélica Muñoz", "Andrés Eguis", "12345678", "87654321");
        Estudiante Jeronimo = new Estudiante("Jerónimo", "Rodríguez Sepúlveda", 11, 18, 5.0, "Pepita Sepúlveda", "Pepito Rodríguez", "135797531", "246808642");
        Estudiante Carlos = new Estudiante("Carlos Augusto", "Aranzazu Jinete", 11, 40, 5.0, "Pepita Aranzazu","Pepito Jinete", "12131415", "51413121");

        Susana.imprimirDatos();
        Jeronimo.imprimirDatos();
        Carlos.imprimirDatos();

    }
}
