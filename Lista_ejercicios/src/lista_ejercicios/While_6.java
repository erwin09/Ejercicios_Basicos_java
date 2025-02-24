package lista_ejercicios;

import java.util.Random;
import java.util.Scanner;

public class While_6 {

    Random aletorio = new Random();

    int numeroSecreto = aletorio.nextInt(100) + 1;
    int intento;

    public While_6() {

    }

    public void tomarDato(Scanner sc) {
        System.out.print("Adivina el número (entre 1 y 100): ");
        intento = sc.nextInt();
    }

    public void calcular(Scanner sc) {
        while (intento != numeroSecreto) {
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
            tomarDato(sc);
        }
        mostrarMensaje();
    }

    public void mostrarMensaje() {
        System.out.println("¡Felicidades! Adivinaste el número " + numeroSecreto);
    }
}
