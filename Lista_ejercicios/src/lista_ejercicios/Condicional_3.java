package lista_ejercicios;

import java.util.Scanner;

public class Condicional_3 {

    int temp;

    public Condicional_3() {
    }

    public void tomarDatos(Scanner sc) {
        System.out.println("Ingrese su temperatura:");
        temp = sc.nextInt();

    }

    public void calcularDatos() {
        if (temp >= 18 && temp <= 25) {
            mensajeCorrecto();
        }else
        {
            mensajeIncorrecto();
        }
    }
    
    public void mensajeCorrecto(){
        System.out.println("Si se encuentradentro del rango");
    }

    public void mensajeIncorrecto(){
        System.out.println("La temperatura esta fuera del rango deseado");
    }
}
