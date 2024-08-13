package Ejercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria("1092852993", 1000000.0, true); // Crear una cuenta con saldo inicial de 1000 y activa

        int opcion;

        do {
            System.out.println("\n--- Menú Cajero Electrónico ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar efectivo");
            System.out.println("3. Consignar efectivo");
            System.out.println("4. Cambiar clave");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Ingrese el valor que desea retirar: ");
                    double valorRetiro = scanner.nextDouble();
                    cuenta.retirarEfectivo(valorRetiro);
                    break;
                case 3:
                    System.out.print("Ingrese el valor que desea consignar: ");
                    double valorConsignacion = scanner.nextDouble();
                    cuenta.consignarEfectivo(valorConsignacion);
                    break;
                case 4:
                    cuenta.cambiarClave();
                    break;
                case 5:
                    System.out.println("Gracias por usar el cajero electrónico. Vuelva pronto.");
                    break;
                default:
                    System.out.println("Por favor, selecciona una opción válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}