
package lista_ejercicios;

import java.util.Scanner;


public class Umbral_temp {
     int temp;

    public Umbral_temp() {
    }

    public void tomarDatos(Scanner sc) {
        System.out.println("Ingrese su temperatura:");
        temp = sc.nextInt();

    }

    public void calcularDatos() {
        if (temp >= 38) {
            mensajeCorrecto();
        }else
        {
            mensajeIncorrecto();
        }
    }
    
    public void mensajeCorrecto(){
        System.out.println("La temperatura esta muy alta (" + temp +" C°)");
    }

    public void mensajeIncorrecto(){
        System.out.println("La temperatura es normal");
    }
}
