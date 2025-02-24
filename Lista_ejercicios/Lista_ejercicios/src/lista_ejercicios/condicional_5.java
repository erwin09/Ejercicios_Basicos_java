package lista_ejercicios;

import java.util.Scanner;

public class condicional_5 {

    int temp, piso;
    int cant_piso = 12;

    public condicional_5() {
    }

    public void tomarDatos(Scanner sc) {
        System.out.println("Ingresa el piso que desea ir: ");
        piso = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su temperatura:");
        temp = sc.nextInt();

    }

    public void calcularDatos() {
        if (temp >= 18 && temp <= 25) {
            if (piso > 0 && piso <= cant_piso) {
                mensajeCorrecto();              
            } else{
                mostrarError();
            }
            }else {
                mensajeIncorrecto();
        }
    }
    

    public void mensajeCorrecto() {
        System.out.println("El asensor se dirige al " + piso + "° piso");
    }

    public void mensajeIncorrecto() {
        System.out.println("la temperatura no es adecuada y no permite el movimiento del ascensor");
    }
    public static void mostrarError() {
        System.out.println("ERROR, piso no encontrado");
    }
}
