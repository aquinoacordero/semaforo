
package boletin03;

import java.util.Scanner;

public class Boletin03 {

  
    public static void main(String[] args) {
     //Introducir datos por teclado  
        System.out.println("¿Esta usted ansioso por saber el área de su rectángulo?\n ¿Es usted de los que el cálculo les espanta?\n Pues use esta aplicación:");
        float base, altura;
        System.out.println(" Base:");
        Scanner dato = new Scanner(System.in);
        base=dato.nextFloat();
        System.out.println("altura:");
        altura=dato.nextFloat();
        System.out.println("Area="+(base*altura));
    }
    
}
