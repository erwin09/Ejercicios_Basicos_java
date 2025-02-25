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
                    + "12. Ejercicio While 1 \n"
                    + "13. Ejercicio While 2 \n"
                    + "14. Ejercicio While 3 \n"
                    + "15. Ejercicio While 4 \n"
                    + "16. Ejercicio While 5 \n"
                    + "17. Ejercicio While 6 \n"
                    + "18. Ejercicio Do while 1 \n"
                    + "19. Ejercicio Do while 2 \n"
                    + "20. Ejercicio Do while 3 \n"
                    + "21. Ejercicio Do while 4 \n"
                    + "22. Ejercicio Do while 5 \n"
                    + "23. Ejercicio Do while 6 \n"
                    + "24. Ejercicio For 1 \n"
                    + "25. Ejercicio For 2 \n"
                    + "26. Ejercicio For 3 \n"
                    + "27. Ejercicio For 4 \n"
                    + "28. Ejercicio For 5 \n"
                    + "29. Salir del listado\n");
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
                case 12:
                    While_1 dinero = new While_1();
                    dinero.tomarDatos(sc);
                    dinero.calcularDatos();
                    break;
                case 13:
                    While_2 tienda = new While_2();
                    tienda.tomarDatos(sc);
                    tienda.mostrarMensaje();
                    break;
                case 14:
                    While_3 hojas = new While_3();
                    hojas.tomarDatos(sc);
                    break;
                case 15:
                    While_4 viaje = new While_4();
                    viaje.tomarDatos(sc);
                    break;
                case 16:
                    While_5 cuenta = new While_5();
                    cuenta.tomarDatos(sc);
                    cuenta.calcular();
                    cuenta.mostrarMensaje();
                    break;
                case 17:
                    While_6 intento = new While_6();
                    intento.tomarDato(sc);
                    intento.calcular(sc);
                    break;
                case 18:
                    Do_while_1 libro = new Do_while_1();
                    libro.guardarLibro(sc);
                    break;
                case 19:
                    Do_while_2 pedido = new Do_while_2();
                    pedido.calcularPedido(sc);
                    break;
                case 20:
                    Do_while_3 temperatura = new Do_while_3();
                    temperatura.tomarTemperatura(sc);
                    temperatura.calcular(sc);
                    break;
                case 21:
                    Do_while_4 nota = new Do_while_4();
                    nota.calcularPromedio(sc);
                    break;
                case 22:
                    Do_while_5 tarea = new Do_while_5();
                    tarea.calcular(sc);
                    break;
                case 23:
                    Do_while_6 venta = new Do_while_6();
                    venta.calcular(sc);
                    break;
                case 24:
                    For_1 carro = new For_1();
                    carro.calcular(sc);
                    break;
                case 25:
                    For_2 articulo = new For_2();
                    articulo.calcular(sc);
                    break;
                case 26:
                    For_3 agenda = new For_3();
                    agenda.calcular(sc);
                    break;
                case 27:
                    For_4 numeros = new For_4();
                    numeros.calcular(sc);
                    break;
                case 28:
                    For_5 manofactura = new For_5();
                    manofactura.calcular(sc);
                    break;
            }
        } while (opcion != 29);

        sc.close();
        System.out.println("Programa finalizado");
    }

}
