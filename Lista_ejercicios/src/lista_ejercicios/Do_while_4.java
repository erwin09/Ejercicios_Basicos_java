package lista_ejercicios;

import java.util.Scanner;

public class Do_while_4 {

    int cantidadNotas = 0;
    double sumaNotas = 0;

    public Do_while_4() {

    }

    private void ingresarNota(Scanner sc) {
        System.out.print("Ingrese la nota del examen (0.0 - 5.0): ");
        double nota = sc.nextDouble();

        if (nota >= 0.0 && nota <= 5.0) {
            sumaNotas += nota;
            cantidadNotas++;
        } else {
            System.out.println("Nota no válida. Debe estar entre 0.0 y 5.0.");
        }
    }

    public void calcularPromedio(Scanner sc) {
        char continuar;

        do {
            ingresarNota(sc);

            System.out.print("¿Desea ingresar otra nota? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        mostrarResultado();
    }

    private void mostrarResultado() {
        if (cantidadNotas > 0) {
            double promedio = sumaNotas / cantidadNotas;
            System.out.print("\nPromedio final: \n" + promedio +" \n");
            if (promedio >= 3.0) {
                System.out.println("¡Felicidades! Has aprobado.");
            } else {
                System.out.println("Lo siento, has reprobado.");
            }
        } else {
            System.out.println("No ingresaste ninguna nota válida.");
        }
    }
}
