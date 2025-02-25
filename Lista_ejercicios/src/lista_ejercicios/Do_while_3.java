package lista_ejercicios;

import java.util.Scanner;

public class Do_while_3 {

    int temperatura;

    public Do_while_3() {

    }

    public void tomarTemperatura(Scanner sc) {
        System.out.println("Ingrese la temperatura actual en °C: ");
        temperatura = sc.nextInt();
    }

    public void calcular(Scanner sc) {

        do {

            if (temperatura <= 18 || temperatura >= 25) {
                System.out.println("Alerta: Temperatura fuera del rango aceptable (18°C - 25°C).");
                System.out.println("Por favor, ingrese una nueva temperatura.\n");
                tomarTemperatura(sc);
            }

        } while (temperatura <= 18 || temperatura >= 25);
        mostrarMensaje();
    }

    public void mostrarMensaje() {
        System.out.println("Temperatura en rango aceptable. ¡Sistema estable!");
    }
}
