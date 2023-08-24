
/**
 *
 * @author luisp
 */
import java.util.Scanner;

public class TIPOSDEDATOS {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PINCHE CALCULADORA  BASICA");
        System.out.print("Ingresa el primer numero: ");
        
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo numero: ");
        
        double num2 = scanner.nextDouble();
        
        System.out.println("Elige una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        
        int operacion = scanner.nextInt();
        
        double resultado = 0;
        
        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }
        
        System.out.println("El resultado es: " + resultado);
    }
}


  