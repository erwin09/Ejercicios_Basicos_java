package lista_ejercicios;

import java.util.Scanner;

public class Switch_Case_2 {

    double peso, altura, imc;
    int opcion;

    public Switch_Case_2() {

    }

    public void tomarDatos(Scanner sc) {

        System.out.println("-----CALCULAR INDICE DE MASA MUSCULAR-----");
        System.out.println("Ingrese su peso Kg:");
        peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros:");
        altura = sc.nextDouble();
    }

    public void calcularIMC() {
        
        imc = peso/(altura*altura);

        opcion = (imc < 18.5) ? 1 : (imc < 24.9) ? 2 : (imc < 29.9) ? 3 : 4;
        
    }
    public void mostrarMensaje(){
        switch (opcion) {
            case 1:
                System.out.println("Bajo peso");
                break;
            case 2:
                System.out.println("Peso normal");
                break;
            case 3:
                System.out.println("Sobrepeso");
                break;
            default:
                System.out.println("Obesidad");
                break;
        }
    }
}
