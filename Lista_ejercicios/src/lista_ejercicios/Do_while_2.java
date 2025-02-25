package lista_ejercicios;

import java.util.Scanner;

public class Do_while_2 {

    double total = 0;
    int opcion;

    public Do_while_2() {

    }

    public void tomarDato(Scanner sc) {

        System.out.println("\n--- MENÚ DE COMIDAS RÁPIDAS ---");
        System.out.println("1. Hamburguesa - $25.000");
        System.out.println("2. Perro Caliente - $13.500");
        System.out.println("3. Pizza - $4.000");
        System.out.println("4. Papas Fritas - $8.000");
        System.out.println("5. Gaseosa - $4.000");
        System.out.println("6. Finalizar pedido");
        System.out.print("Seleccione una opción (1-6): ");
        opcion = sc.nextInt();

    }

    public void calcularPedido(Scanner sc) {
        do {
            tomarDato(sc);
            switch (opcion) {
                case 1:
                    total += 25000;
                    System.out.println("\nAgregaste una Hamburguesa.");
                    break;
                case 2:
                    total += 13500;
                    System.out.println("\nAgregaste un Perro Caliente.");
                    break;
                case 3:
                    total += 4000;
                    System.out.println("\nAgregaste una Pizza.");
                    break;
                case 4:
                    total += 8000;
                    System.out.println("\nAgregaste Papas Fritas.");
                    break;
                case 5:
                    total += 4000;
                    System.out.println("\nAgregaste una Gaseosa.");
                    break;
                case 6:
                    mostrarMensaje();
                    break;
                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

    }

    private void mostrarMensaje() {
        System.out.printf("\nTotal a pagar: \n"+ total);
        System.out.println("¡Gracias por tu compra!");
    }
}
