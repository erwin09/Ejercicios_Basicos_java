package lista_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class For_2 {

    ArrayList<String> carrito = new ArrayList<>();
    double totalCompra = 0; 
    int numProductos; 

    public For_2(){
        
    }
    
    public void tomarDatos(Scanner sc) {
        System.out.print("Ingrese la cantidad de productos que desea comprar: ");
        numProductos = sc.nextInt();
        sc.nextLine(); 
    }

    public void calcular(Scanner sc) {
        tomarDatos(sc);

        for (int i = 1; i <= numProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + i + ": ");
            String producto = sc.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = sc.nextDouble();
            sc.nextLine(); 

            carrito.add(" " + producto + " - $" + precio);
            totalCompra += precio;
        }

        mostrarMensaje();
    }

    public void mostrarMensaje() {
        if (!carrito.isEmpty()) {
            System.out.println("\n Resumen de la compra:");
            for (String item : carrito) {
                System.out.println(item);
            }
            System.out.println("\n Total de la compra: $" + totalCompra);
        } else {
            System.out.println("⚠ No se agregaron productos al carrito.");
        }
    }
}
