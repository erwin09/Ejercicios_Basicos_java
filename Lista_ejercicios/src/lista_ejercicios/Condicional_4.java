
package lista_ejercicios;

import java.util.Scanner;


public class Condicional_4 {
     int temp;

    public Condicional_4() {
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
