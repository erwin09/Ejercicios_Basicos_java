package lista_ejercicios;

import java.util.Scanner;

public class Lista_ejercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--------------------------------------------------");
            System.out.print("Listado de ejercicios: \n"
                    + "1. Factura \n"
                    + "2. Asensor \n"
                    + "3. Limite peso \n"
                    + "4. Sensor temperatura \n"
                    + "5. Umbral temperatura \n"
                    + "6. Asensor y temperatura \n"
                    + "7. Salir del listado\n");
            System.out.println("--------------------------------------------------");
            System.out.println("Seleccione una opción:");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println(" ");
            switch (opcion) {
                case 1:
                    Factura fac = new Factura();
                    fac.tomarDatos(sc);
                    fac.calcularDatos();
                    fac.mostrarResultados();
                    break;
                case 2:
                    asensor asensor = new asensor();
                    asensor.tomarDatos(sc);
                    asensor.calcularDatos();
                    break;
                case 3:
                    Limite_peso peso = new Limite_peso();
                    peso.tomarDatos(sc);
                    peso.calcularDatos();
                    break;
                case 4:
                    Temperatura temp = new Temperatura();
                    temp.tomarDatos(sc);
                    temp.calcularDatos();
                    break;
                case 5:
                    Umbral_temp umbral = new Umbral_temp();
                    umbral.tomarDatos(sc);
                    umbral.calcularDatos();
                    break;
                case 6:
                    Temp_asensor mover = new Temp_asensor();
                    mover.tomarDatos(sc);
                    mover.calcularDatos();
            }
        } while (opcion != 7);

        sc.close();
        System.out.println("Programa finalizado");
    }

}
