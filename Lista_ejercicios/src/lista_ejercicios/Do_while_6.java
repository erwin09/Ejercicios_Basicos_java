package lista_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Do_while_6 {

    ArrayList<String> listaVentas = new ArrayList<>(); 
    double totalVentas = 0; 
  
    public Do_while_6(){
        
    }
    
    public void tomarDatos(Scanner sc) {
        System.out.print("Ingrese el nombre del producto vendido: ");
        String producto = sc.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        listaVentas.add(" " + producto + " - $" + precio);
        totalVentas += precio;
    }

    public void calcular(Scanner sc) {
        char continuar;

        do {
            tomarDatos(sc);

            System.out.print("¿Desea registrar otra venta? (s/n): ");
            continuar = sc.next().charAt(0);
            sc.nextLine();

        } while (continuar == 's' || continuar == 'S');

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
