package lista_ejercicios;

import java.util.Scanner;

public class Lista_ejercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("  ");
            System.out.println("--------------------------------------------------");
            System.out.print("Listado de ejercicios: \n"
                    + "1. Ejercicio Factura \n"
                    + "2. Ejercicio Condicional 1 \n"
                    + "3. Ejercicio Condicional 2 \n"
                    + "4. Ejercicio Condicional 3\n"
                    + "5. Ejercicio Condicional 4 \n"
                    + "6. Ejercicio Condicional 5 \n"
                    + "7. Ejercicio Switch-case 1 \n"
                    + "8. Ejercicio Switch-case 2 \n"
                    + "9. Ejercicio Switch-case 3 \n"
                    + "10. Ejercicio Switch-case 4 \n"
                    + "11. Ejercicio switch-case 5 \n"
                    + "20. Salir del listado\n");
            System.out.println("--------------------------------------------------");
            System.out.println("Seleccione una opción:");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println(" ");
            switch (opcion) {
                case 1:
                    Ejercicio_Factura fac = new Ejercicio_Factura();
                    fac.tomarDatos(sc);
                    fac.calcularDatos();
                    fac.mostrarResultados();
                    break;
                case 2:
                    Condicional_1 asensor = new Condicional_1();
                    asensor.tomarDatos(sc);
                    asensor.calcularDatos();
                    break;
                case 3:
                    Condicional_2 peso = new Condicional_2();
                    peso.tomarDatos(sc);
                    peso.calcularDatos();
                    break;
                case 4:
                    Condicional_3 temp = new Condicional_3();
                    temp.tomarDatos(sc);
                    temp.calcularDatos();
                    break;
                case 5:
                    Condicional_4 umbral = new Condicional_4();
                    umbral.tomarDatos(sc);
                    umbral.calcularDatos();
                    break;
                case 6:
                    condicional_5 mover = new condicional_5();
                    mover.tomarDatos(sc);
                    mover.calcularDatos();
                    break;
                case 7:
                    Switch_Case_1 productos = new Switch_Case_1();
                    productos.tomarDatos(sc);
                    break;
                case 8:
                    Switch_Case_2 imc = new Switch_Case_2();
                    imc.tomarDatos(sc);
                    imc.calcularIMC();
                    imc.mostrarMensaje();
                    break;
                case 9:
                    Switch_case_3 pelicula = new Switch_case_3();
                    pelicula.tomarDatos(sc);
                    pelicula.calcularDatos();
                    pelicula.mostrarMensaje();
                    break;
                case 10: 
                    Switch_case_4 resultado = new Switch_case_4();
                    resultado.tomarDatos(sc);
                    resultado.actulizarDatos();
                    resultado.mostrarDatos();
                    break;
                case 11:
                    Switch_case_5 restaurante = new Switch_case_5();
                    restaurante.tomarDatos(sc);
                    restaurante.calcularDatos();
                    restaurante.mostrarDato();
                    break;

            }
        } while (opcion != 20);

        sc.close();
        System.out.println("Programa finalizado");
    }

}
