package lista_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class For_5 {

    ArrayList<String> listaVentas = new ArrayList<>();
    double totalVentas = 0;
    int numProductos;

    public For_5() {

    }

    public void tomarDatos(Scanner sc) {
        System.out.print("Ingrese la cantidad de productos vendidos: ");
        while (!sc.hasNextInt()) {
            System.out.println("Entrada no válida. Debe ingresar un número entero.");
            sc.next();
        }
        numProductos = sc.nextInt();
        sc.nextLine();
    }

    public void calcular(Scanner sc) {
        tomarDatos(sc);

        for (int i = 1; i <= numProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + i + ": ");
            String producto = sc.nextLine();

            System.out.print("Ingrese el precio unitario del producto: ");
            while (!sc.hasNextDouble()) {
                System.out.println(" Entrada no válida. Debe ingresar un número.");
                sc.next();
            }
            double precio = sc.nextDouble();

            System.out.print("Ingrese la cantidad vendida: ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada no válida. Debe ingresar un número entero.");
                sc.next();
            }
            int cantidad = sc.nextInt();
            sc.nextLine();

            double totalProducto = precio * cantidad;
            totalVentas += totalProducto;

            listaVentas.add(" " + producto + " | Cantidad: " + cantidad + " | Total: $" + totalProducto);
        }

        mostrarMensaje();
    }

    public void mostrarMensaje() {
        if (!listaVentas.isEmpty()) {
            System.out.println("\n Resumen de ventas:");
            for (String venta : listaVentas) {
                System.out.println(venta);
            }
            System.out.println("\nTotal de ventas: $" + totalVentas);
        } else {
            System.out.println("No se registraron ventas.");
        }
    }

}
