package lista_ejercicios;

import java.util.Scanner;

public class While_1 {

    int retiro, saldo;

    public While_1() {

    }

    public void tomarDatos(Scanner sc) {

        System.out.println("saldo: $350.000");
        System.out.println("Ingrese el monto que desea retirar: ");
        retiro = sc.nextInt();
    }

    public void calcularDatos() {
        while (retiro <= 350000) {
            System.out.println("Contando el dinero_____&&");
            saldo = 350000 - retiro;
            System.out.println("Su saldo es: $" + saldo);
            break;
        }

        if (retiro > 350000) {
            System.out.println("¡Saldo insuficiente!");
        }
    }
}
