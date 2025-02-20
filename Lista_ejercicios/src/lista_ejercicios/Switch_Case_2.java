package lista_ejercicios;

import java.util.Scanner;

public class Switch_Case_2 {

    double peso, altura, imc;
    int opcion;

    public Switch_Case_2() {

    }

    public void tomarDatos(Scanner sc) {

        System.out.println("-----CALCULAR INDICE DE MASA MUSCULAR-----");
        System.out.println("Ingrese su peso:");
        peso = sc.nextDouble();
        System.out.println("Ingrese su altura");
        altura = sc.nextDouble();
    }

    public void calcularIMC() {

        if (imc <= 18.5) {
            opcion = 1;
        }
        if (imc > 18.5 || imc <= 24.9) {
            opcion = 2;
        }
        if (imc > 24.5 || imc <= 29.9) {
            opcion = 3;
        }else{
            opcion = 4;
        }

        switch (opcion) {
            case 1:

        }
    }
}
