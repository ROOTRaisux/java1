
package com.mycompany.agosto240823;

/**
 *
 * @author luisp
 */
public class Agosto240823 {

    public static void main(String[] args) {
    double a = 5.5, b= 4;
    
    double raiz = Math.sqrt(b);
    System.out.println("laraiz es "+raiz);
    
    long redondo = Math.round(a);
    System.out.println("Numero redondo"+redondo);
    
    double c = 5, d = 3;
    
    double elevado = Math.pow(c, d);
    
    System.out.println("Elevado "+elevado);
    
    double aleatorio = Math.random()*10+1;
    int numero=(int) aleatorio;
    System.out.println("numero Aleatorio:"+numero);
    
    double valorPI = Math.PI;
        System.out.printf("%.4f",valorPI);
    }
}
