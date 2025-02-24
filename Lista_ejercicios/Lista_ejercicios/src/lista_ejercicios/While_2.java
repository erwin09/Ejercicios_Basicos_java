package lista_ejercicios;

import java.util.Scanner;

public class While_2 {

    double precio, cantidad, subtotal, total;
    String continuar;

    public While_2() {

    }

    public void tomarDatos(Scanner sc) {
        
        while (true) {
            System.out.println("Ingrese precio del producto: ");
            precio = sc.nextDouble();
            System.out.println("Ingrese cantidad del producto: ");
            cantidad = sc.nextDouble();
            
            Calcular();
             
            System.out.println("¿Desea ingresar otro producto: s/n?");
            continuar = sc.next().toLowerCase();

            if (continuar.equals("n")) {
                break;
            }
        }

    }

    public void Calcular() {
        subtotal = precio * cantidad;
        total += subtotal;

    }
    
    public void mostrarMensaje(){
        System.out.println("El total de la compra es: " + total);
    }
}
