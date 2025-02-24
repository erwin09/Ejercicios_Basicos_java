package lista_ejercicios;

import java.util.Scanner;

public class While_3 {

    int cantidadHojas, total;
    int continuar = 1;
    int cantidadDeposito = 20;

    public void tomarDatos(Scanner sc) {

        while (continuar == 1) {
            System.out.println("Ingrese la cantidad de hojas a imprimir: ");
            cantidadHojas = sc.nextInt();
            if (cantidadHojas > cantidadDeposito) {
                System.out.println("Error no hay hojas");
                break;
            }
            calcular();
            System.out.println("Desea impirmir mas hojas? \n(1.si - 2.no)");
            continuar = sc.nextInt();

            if (continuar == 2) {
                System.out.println("Cantidad de hojas en el deposito: " + cantidadDeposito);
            }

        }
    }

    public void calcular() {
        cantidadDeposito -= cantidadHojas;
        mensaje();

    }

    public void mensaje() {
        System.out.print("Imprimiendo...  \n"
                + "quedan. " + cantidadDeposito + " hojas.");
    }
}
