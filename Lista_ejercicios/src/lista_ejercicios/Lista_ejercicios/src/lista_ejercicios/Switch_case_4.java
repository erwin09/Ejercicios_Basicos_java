package lista_ejercicios;

import java.util.Scanner;

public class Switch_case_4 {

    String nombre, resultado;
    int partidos_jugados = 5;
    int ganados = 2;
    int perdidos = 1;
    int empatados = 2;
    int puntos = 7;

    public Switch_case_4() {
    }

    public void tomarDatos(Scanner sc) {
        System.out.println("Ingrese el nombre del equipo: ");
        nombre = sc.nextLine();

        System.out.println("\n Ingrese el resultado del partido: ganado, empatado o perdido");
        resultado = sc.next().toUpperCase();
    }

    public void actulizarDatos() {
        switch (resultado) {
            case "GANADO":
                partidos_jugados++;
                ganados++;
                puntos += 3;
                break;
            case "PERDIDO":
                partidos_jugados++;
                perdidos++;
                puntos += 1;
                break;
            case "EMPATADO":
                partidos_jugados++;
                empatados++;
                break;
            default:
                System.out.println("¡El dato ingresado es incorrecto!");
        }
    }

    public void mostrarDatos() {
        System.out.print("\n ----Tabla de puntajes----  \n"
                + "Partidos jugados: " + partidos_jugados + " \n"
                + "Partidos ganados: " + ganados + " \n"
                + "Partidos perdidos: " + perdidos + " \n"
                + "Partidos empatados: " + empatados + " \n"
                + "Total puntos: " + puntos);
    }
}
