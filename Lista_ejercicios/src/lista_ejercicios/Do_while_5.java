package lista_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Do_while_5 {

    ArrayList<String> listaTareas = new ArrayList<>(); // Lista para almacenar tareas

    public Do_while_5() {

    }

    public void tomarDatos(Scanner sc) {
        System.out.print("Ingrese la descripción de la tarea: ");
        String descripcion = sc.nextLine();

        System.out.print("Ingrese la fecha de vencimiento (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        listaTareas.add(" " + descripcion + " - Vence el: " + fecha);
    }

    public void calcular(Scanner sc) {
        char continuar;

        do {
            tomarDatos(sc);

            System.out.print("¿Desea agregar otra tarea? (s/n): ");
            continuar = sc.next().charAt(0);
            sc.nextLine();

        } while (continuar == 's' || continuar == 'S');

        mostrarMensaje();
    }

    public void mostrarMensaje() {
        if (!listaTareas.isEmpty()) {
            System.out.println("\n Lista de tareas:");
            for (String tarea : listaTareas) {
                System.out.println(tarea);
            }
        } else {
            System.out.println("No ingresaste ninguna tarea.");
        }
    }
}
