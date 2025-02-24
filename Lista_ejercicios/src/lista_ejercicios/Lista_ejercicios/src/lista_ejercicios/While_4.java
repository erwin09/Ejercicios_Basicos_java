package lista_ejercicios;

import java.util.Scanner;

public class While_4 {

    double tiempo, distancia, velocidad;
    int continuar = 1;

    public While_4() {

    }

    public void tomarDatos(Scanner sc) {

        while (continuar == 1) {
            System.out.print("\nIngrese la distancia del viaje (km): ");
            distancia = sc.nextDouble();
            System.out.print("Ingrese la velocidad promedio del coche (km/h): ");
            velocidad = sc.nextDouble();
            calcularTiempo();
            mostrarMensaje();
            System.out.print("\n¿Desea simular otro viaje? (1. Sí - 2. No): ");
            continuar = sc.nextInt();
        }

    }

    public void calcularTiempo() {
        if (velocidad > 0) {
            tiempo = distancia / velocidad;
        } else {
            System.out.println("Error: La velocidad debe ser mayor a 0.");
            tiempo = -1;
        }
    }

    public void mostrarMensaje() {
        if (tiempo >= 0) {
            System.out.println(" Tiempo estimado de viaje: " + tiempo + " horas.");
        }
    }
}
