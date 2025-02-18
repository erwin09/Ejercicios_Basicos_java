package lista_ejercicios;

import java.util.Scanner;

public class Limite_peso {

    int limitePeso = 360;
    int cant_piso = 10;
    int peso, piso;

    public Limite_peso() {
    }

    public void tomarDatos(Scanner tecla) {
        
        System.out.println("Digite su peso:");
        peso = tecla.nextInt();
        System.out.println("Ingrese al piso que desea ir: ");
        piso = tecla.nextInt();

    }

    public void calcularDatos() {

        if (peso <= limitePeso) {
            if (piso > 0 && piso <= cant_piso) {
                mostrarMensaje();
            }else{
                mostrarError();
            }
        } else {
            sobrePeso();
        }
    }
     public void mostrarMensaje() {
        System.out.println("El asensor se dirige a " + piso);

    }

    public void mostrarError() {
        System.out.println("ERROR, mala selección");
    }
    
    public void sobrePeso(){
            System.out.println("El asensor esta en sobrecargado, no se puede mover");
}
}
