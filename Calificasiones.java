package NuevaClase;

import java.util.Scanner;

public class Calificasiones{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Pedir datos 
        System.out.println("Ingrese la primera calificación:");
        double calificacion1 = scanner.nextDouble();

        System.out.println("Ingrese la segunda calificación:");
        double calificacion2 = scanner.nextDouble();

        System.out.println("Ingrese la tercera calificación:");
        double calificacion3 = scanner.nextDouble();

        System.out.println("Ingrese la cuarta calificación:");
        double calificacion4 = scanner.nextDouble();
//resultados 
        double sumaCalificaciones = calificacion1 + calificacion2 + calificacion3 + calificacion4;

        System.out.println("La suma de las calificaciones es: " + sumaCalificaciones);

        scanner.close();
    }
}