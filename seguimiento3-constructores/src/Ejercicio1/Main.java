package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Michi", 3, "Callejero", "Blanco");
        Mascota m2 = new Mascota("Tiger", 1, "Bengalí", "Café rayado");
        Mascota m3 = new Mascota("Noir", 4, "Rottweiler", "Negro");

        m1.Imprimir();
        m2.Imprimir();
        m3.Imprimir();
    }
}
