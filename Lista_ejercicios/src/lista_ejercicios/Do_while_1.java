package lista_ejercicios;

import java.util.Scanner;

public class Do_while_1 {

    String registro = "";
    boolean continuar;
    
    public Do_while_1(){
        
    }

    public void guardarLibro(Scanner sc) {

        do {
            registro += tomarDatos(sc);
            System.out.print("¿Registrar otro libro? (si/no): ");
            continuar = sc.next().equalsIgnoreCase("si");
        } while (continuar);

        mostrarMensaje(registro);
    }


    public static String tomarDatos(Scanner sc){
        sc.nextLine(); 
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Páginas: ");
        int paginas = sc.nextInt();

        return " " + titulo + " | " + autor + " |  " + paginas + " páginas\n";
    }

    public static void mostrarMensaje(String registro) {
        System.out.println("\n Libros registrados:\n" + registro);
    }
}
