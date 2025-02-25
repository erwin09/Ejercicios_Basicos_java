package lista_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class For_1 {

    ArrayList<String> listaVehiculos = new ArrayList<>();
    int numVehiculos;

    public For_1() {

    }

    public void tomarDatos(Scanner sc) {
        System.out.print("Ingrese el número de vehículos a registrar: ");
        numVehiculos = sc.nextInt();
        sc.nextLine();
    }

    public void calcular(Scanner sc) {
        tomarDatos(sc);

        for (int i = 1; i <= numVehiculos; i++) {
            System.out.print("Ingrese la placa del vehículo " + i + ": ");
            String placa = sc.nextLine();

            System.out.print("Ingrese la hora de ingreso (HH:mm): ");
            String horaIngreso = sc.nextLine();

            listaVehiculos.add(" Placa: " + placa + " - Hora de ingreso: " + horaIngreso);
        }

        mostrarMensaje();
    }

    public void mostrarMensaje() {
        if (!listaVehiculos.isEmpty()) {
            System.out.println("\nResumen de vehículos registrados:");
            for (String vehiculo : listaVehiculos) {
                System.out.println(vehiculo);
            }
        } else {
            System.out.println("No se registraron vehículos.");
        }
    }
}
