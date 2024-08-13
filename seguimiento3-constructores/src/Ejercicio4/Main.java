package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        Propiedad[] propiedades = new Propiedad[3];


        propiedades[0] = new Propiedad("A100", "Carrera 1 # 11-11", 169.69, 400000.0, 3, 2, true, "Disponible");
        propiedades[1] = new Propiedad("A101", "Calle 22N # 22-2", 159.40, 300000.0, 2, 1, false, "Vendida");
        propiedades[2] = new Propiedad("A102", "Avenida 33 # 3-3", 200.50, 550000.0, 4, 3, true, "Rentada");


        for (Propiedad propiedad : propiedades) {
            propiedad.mostrarDatos();
        }

        propiedades[0].setEstado("Vendida");

        System.out.println("Después de utilizar el set para indicar la venta:");
        propiedades[0].mostrarDatos();
    }
}
