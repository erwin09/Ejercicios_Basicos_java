package lista_ejercicios;

import java.util.Scanner;

public class Ejercicio_Factura {

    String nombre_cliente, producto, porcentaje;
    char tipo_cliente;
    int cantidades, estudiante;
    Double precio, subtotal, impuesto, total;

    public Ejercicio_Factura() {
    }

    public void tomarDatos(Scanner sc) {
        //Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba su nombre: ");
        sc.nextLine();
        nombre_cliente = sc.nextLine();
        
        System.out.println("Tipo de cliente: A, B o C");
        tipo_cliente = sc.next().charAt(0);
        
        System.out.println("Digite 1 si es estudiante o 0 si no es estudiante");
        estudiante = sc.nextInt();
        
        System.out.println("Escriba el producto: ");
        producto = sc.next();
        
        System.out.println("Digite cantidades del producto: ");
        cantidades = sc.nextInt();
        
        System.out.println("Digite precio del producto: ");
        precio = sc.nextDouble();
        

    }

    public void calcularDatos() {
        subtotal = cantidades * precio;

        
        if (estudiante == 1) {
            porcentaje = "5%";
            impuesto = subtotal * 0.05;
        } else {
            porcentaje = "13%";
            impuesto = subtotal * 0.13;
        }

        total = subtotal + impuesto;
        
       
    }
    public void mostrarResultados(){
        System.out.println("FACTURA DE VENTA");
        System.out.println("Nombre: " + nombre_cliente);
        System.out.println("Tipo cliente: " + tipo_cliente);
        System.out.println("------------------Información de la venta------------------");
        System.out.println("Cantidades: " + cantidades + " Producto: " + producto + " Precio unitario: " + precio);
        System.out.println("Subtotal de la compra: " + subtotal);
        System.out.println("El impuesto que manejara es del " + porcentaje + " el impuesto es: " + impuesto);
        System.out.println("El total de la compra es: " + total);
    }
}
