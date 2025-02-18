
package lista_ejercicios;

import java.util.Scanner;


public class asensor {
    
    public asensor(){
        
    }
    int cant_piso = 8;
    int piso;
    
    public void tomarDatos(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa el piso que desea ir: ");
        piso = teclado.nextInt();
    }
}
