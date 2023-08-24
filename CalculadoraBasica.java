/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NuevaClase;

import javax.swing.JOptionPane;

/**
 *
 * @author luisp
 */
public class CalculadoraBasica {
    public static void main(String[] args) {
        //declaracion de varaiable 
        int n1,n2,suma,resta,multi,div,mod;
    
  //Pedir datos 
    n1 = Integer.parseInt(JOptionPane.showInputDialog("escriva un numero"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("escrive otro NUMERO"));
    
    //PROSESO
    
    suma = n1 + n2;
    resta = n1 - n2;
    multi = n1 * n2;
    div = n1 / n2;
    mod = n1 % n2;
    
    
    //Muestra el resultado 25
    
   JOptionPane.showMessageDialog(null,"la suma es: "+suma+"\n la resta es: "+resta+"\n la multi es: "+multi+"\n la div es: "+div+"\n el mod es: "+mod);
    
 }  
}
