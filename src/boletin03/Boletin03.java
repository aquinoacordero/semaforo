
package boletin03;

import java.util.Scanner;

public class Boletin03 {

  
    public static void main(String[] args) {
     //Introducir datos por teclado  
        float base, altura;
        System.out.println("Base:");
        Scanner dato = new Scanner(System.in);
        base=dato.nextFloat();
        System.out.println("altura:");
        altura=dato.nextFloat();
        System.out.println("Area="+(base*altura)+" por cierto, Aitor es gay");
    }
    
}
