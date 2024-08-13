package Ejercicio3;
import java.util.Scanner;

public class CuentaBancaria {

        String numeroCuenta;
        double saldo;
        boolean estado;
        String claveSeguridad;

      CuentaBancaria(String numeroCuenta, double saldoInicial, boolean estadoInicial) {
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldoInicial;
            this.estado = estadoInicial;
            this.claveSeguridad = "4444";
        }

        public void consultarSaldo() {
            System.out.println("Tu saldo es de: $" + saldo);
        }

        public void retirarEfectivo(double valor) {
            if (estado) {
                if (saldo >= valor) {
                    saldo -= valor;
                    System.out.println("Se ha retirado: $" + valor);
                    System.out.println("Ahora tu saldo es de: $" + saldo);
                } else {
                    System.out.println("Fondos insuficientes.");
                }
            } else {
                System.out.println("La cuenta no se encuentra activa, por tanto, no se ha podido realizar el retiro.");
            }
      }

    public void consignarEfectivo(double valor) {
        if (estado) {
            saldo += valor;
            System.out.println("Se ha consignado: $" + valor);
            System.out.println("Ahora tu nuevo saldo es de: $" + saldo);
        } else {
            System.out.println("La cuenta no se encuentra activa, por tanto, no se ha podido realizar la consignación.");
        }
    }

    public void cambiarClave() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la clave actual.");
        String claveActual = scanner.nextLine();

        if (claveActual.equals(claveSeguridad)) {
            System.out.print("Ingrese la nueva clave.");
            String nuevaClave = scanner.nextLine();
            claveSeguridad = nuevaClave;
            System.out.println("Su clave ha sido cambiada exitosamente.");
        } else {
            System.out.println("No es posible cambiar la clave.");
        }
    }
}
