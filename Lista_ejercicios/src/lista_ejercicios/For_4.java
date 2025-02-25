package lista_ejercicios;

import java.util.Scanner;

public class For_4 {

    int numElementos;
    double sumaTotal = 0;

    public For_4() {

    }

    public void tomarDatos(Scanner sc) {
        System.out.print("Ingrese la cantidad de números a sumar: ");
        while (!sc.hasNextInt()) {
            System.out.println("Entrada no válida. Debe ingresar un número entero.");
            sc.next();
        }
        numElementos = sc.nextInt();
    }

    public void calcular(Scanner sc) {
        tomarDatos(sc);

        for (int i = 1; i <= numElementos; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            while (!sc.hasNextDouble()) {
                System.out.println("Entrada no válida. Debe ingresar un número.");
                sc.next();
            }
            double numero = sc.nextDouble();
            sumaTotal += numero;
        }

        mostrarMensaje();
    }

    public void mostrarMensaje() {
        System.out.println("\nLa suma total de los números ingresados es: " + sumaTotal);
    }

}
