package lista_ejercicios;

import java.util.Scanner;

public class Switch_case_5 {

    int opcionComida, opcionBebida, opcionPago;

    double comida, bebida, subtotal, total, descuento, porcentaje;

    public Switch_case_5() {

    }

    public void tomarDatos(Scanner sc) {
        System.out.print("\n MENÚ RESTAURANTE:  \n"
                + "\n1. Desayuno - $12.000 \n"
                + "2. Almuerzo - $18.000 \n"
                + "3. Cena - $13.000 \n"
                + "Ingrese el plato que desea. \n");

        opcionComida = sc.nextInt();

        System.out.print("\n MENÚ BEBIDA:  \n"
                + "\n1. Agua o Agua con gas - $2.000 \n"
                + "2. Gaseossa - $5.000 \n"
                + "3. Jugo natural - $8.000 \n"
                + "Ingrese el plato que desea. \n");

        opcionBebida = sc.nextInt();

        System.out.print("Seleccione metodo de pago: \n"
                + "1. Efectivo - 15% de descuento \n"
                + "2. Tarjeta o cheque - 10% de descuento \n");

        opcionPago = sc.nextInt();

    }

    public void calcularDatos() {
        switch (opcionComida) {
            case 1:
                comida = 12000;
                break;
            case 2:
                comida = 18000;
                break;
            case 3:
                comida = 13000;
                break;
            default:
                System.out.println("Entrada invalida");
        }

        switch (opcionBebida) {
            case 1:
                bebida = 2000;
                break;
            case 2:
                bebida = 5000;
                break;
            case 3:
                bebida = 8000;
                break;
            default:
                System.out.println("Entrada invalida");
        }

        switch (opcionPago) {
            case 1:
                porcentaje = 0.15;
                break;

            case 2:
                porcentaje = 0.10;
                break;
            default:
                System.out.println("Opción invalida");
        }

        subtotal = comida + bebida;
        descuento = subtotal * porcentaje;
        total = subtotal - descuento;

    }

    public void mostrarDato() {
        System.out.println("El total de la compra es: " + subtotal + " con el descuento le queda en: " + total);
    }
}
