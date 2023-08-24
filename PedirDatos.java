
import java.util.Scanner;

public class PedirDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Declarar las variables 
        int numero1, numero2, resultado;
        
        System.out.println("Señor usuario, por favor ingrese un número:");
        numero1 = teclado.nextInt();
        System.out.println("Señor usuario, por favor ingrese un número");
        numero2 = teclado.nextInt();
        
        //proceso
        
        resultado = numero1 + numero2;
        
        //mostrar resultado 
        
        System.out.println("el resultado es:"+resultado);
        
    }
}
