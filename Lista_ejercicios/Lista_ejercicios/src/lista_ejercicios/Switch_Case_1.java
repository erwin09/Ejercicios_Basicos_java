package lista_ejercicios;

import java.util.Scanner;

public class Switch_Case_1 {

    String opcion, producto;
    int cantidad, precio;
    double totalDesc, descuento, total, porcentaje;

    public Switch_Case_1() {

    }

    public void tomarDatos(Scanner sc) {

        System.out.print("Escoge el tipo de producto:\n"
                + "A. Alimentos \n"
                + "V. Vestimenta \n"
                + "E. Electrónicos\n");
        opcion = sc.next().toUpperCase();
        sc.nextLine();
        System.out.println("Ingrese nombre del producto: ");
        producto = sc.nextLine();

        System.out.println("Cantidades del producto: ");
        cantidad = sc.nextInt();

        System.out.println("Precio del producto: ");
        precio = sc.nextInt();

        if (cantidad > 0) {
            seleccionar();
        } else {
            System.out.println("Ingrese una cantidad");
        }

    }

    public void seleccionar() {

        switch (opcion) {
            case "A":
                porcentaje = 10;
                Calcular();
                break;
            case "V":
                porcentaje = 5;
                Calcular();
                break;
            case "E":
                porcentaje = 0;
                Calcular();
                break;
        }
    }

    public void Calcular() {
        total = precio * cantidad;
        descuento = total * (porcentaje / 100);
        totalDesc = total - descuento;
        System.out.println("Estos productos tienen el " + porcentaje + "% de descuento");
        System.out.println("Total: " + total);
        System.out.println("Total con descuento: " + totalDesc);
    }

}
