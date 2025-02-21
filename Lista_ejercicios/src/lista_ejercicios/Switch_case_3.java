package lista_ejercicios;

import java.util.Scanner;

public class Switch_case_3 {

    int edad, rango;

    public Switch_case_3() {

    }

    public void tomarDatos(Scanner sc) {

        System.out.println("Por favor ingrese su edad: ");
        edad = sc.nextInt();

    }

    public void calcularDatos() {
        rango = (edad < 7) ? 1 : (edad < 17) ? 2 : (edad < 30) ? 3 : 4;
    }

    public void mostrarMensaje() {
        switch (rango) {
            case 1:
                System.out.print("La clasificación para tu edad es de peliculas animadas y educativas: \n"
                        + "1. Buscando a nemo \n"
                        + "2. Wall-E \n"
                        + "3. El lorax \n"
                        + "4. Coco \n");
                break;
            case 2:
                System.out.print("La clasificación para tu edad es de peliculas aventura y comedia: \n"
                        + "1. Harry Potter \n"
                        + "2. Las Crónicas de Narnia \n"
                        + "3. Spider-Man: Un nuevo universo \n"
                        + "4. Jumanji \n"
                        + "5. Paddington \n"
                        + "6. Avatar: ");
                break;
            case 3:
                System.out.print("La clasificación para tu edad es de peliculas acción, comedia y drama: \n"
                        + "1. John Wick \n"
                        + "2. Misión Imposible \n"
                        + "3. Deadpool \n"
                        + "4. Joker \n");
                break;
            case 4:
                System.out.print("La clasificación para tu edad es de peliculas clasicas y drama: \n"
                        + "1. El Padrino \n"
                        + "2. Forrest Gump \n"
                        + "3. Titanic \n"
                        + "4. Volver al futuro \n"
                        + "5. La vida es bella  \n"
                        + "6. Rocky \n");
                break;
        }
    }
}
