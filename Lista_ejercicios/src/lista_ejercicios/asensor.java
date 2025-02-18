package lista_ejercicios;

import java.util.Scanner;

public class asensor {

    int cant_piso = 8;
    int piso;

    public asensor() {
    }

    public void tomarDatos(Scanner teclado) {

        System.out.println("Ingresa el piso que desea ir: ");
        piso = teclado.nextInt();

    }

    public void calcularDatos() {
        if (piso > 0 && piso <= cant_piso) {
            mostrarMensaje();
        } else {
            mostrarError();
        }
    }

    public void mostrarMensaje() {
        System.out.println("El asensor se dirige al " + piso+"° piso");

    }

    public static void mostrarError() {
        System.out.println("ERROR, piso no encontrado");
    }
}
