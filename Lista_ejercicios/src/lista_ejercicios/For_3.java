package lista_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class For_3 {

    ArrayList<String> listaContactos = new ArrayList<>();
    int numContactos;

    public For_3() {

    }

    public void tomarDatos(Scanner sc) {
        System.out.print("Ingrese la cantidad de contactos a registrar: ");
        numContactos = sc.nextInt();
        sc.nextLine();
    }

    public void calcular(Scanner sc) {
        tomarDatos(sc);

        for (int i = 1; i <= numContactos; i++) {
            System.out.print("Ingrese el nombre del contacto " + i + ": ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el número de teléfono: ");
            String telefono = sc.nextLine();

            listaContactos.add(" " + nombre + " - " + telefono);
        }

        mostrarMensaje();
    }

    public void mostrarMensaje() {
        if (!listaContactos.isEmpty()) {
            System.out.println("\n Lista de contactos registrados:");
            for (String contacto : listaContactos) {
                System.out.println(contacto);
            }
        } else {
            System.out.println("No se registraron contactos.");
        }
    }
}
