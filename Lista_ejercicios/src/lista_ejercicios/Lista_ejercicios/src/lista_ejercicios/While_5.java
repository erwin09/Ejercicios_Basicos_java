package lista_ejercicios;

import java.util.Scanner;

public class While_5 {
    int numero;
    
    public While_5(){
        
    }
    
    public void tomarDatos(Scanner sc){
        System.out.println("Ingrese un numero positivo: ");
        numero = sc.nextInt();
        System.out.println("  ");
    }
    
    public void calcular(){
        while (numero >= 0) {            
            System.out.println(numero);
            numero--;
        }
    }
    
    public void mostrarMensaje(){
        System.out.println("¡Tiempo cumplido!");
    }
}
