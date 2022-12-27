/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeaprendizaje.java;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
        
        Scanner leer = new Scanner (System.in);
        int num,d,t;
        double rc,rcc;
        System.out.println("Ingrese un numero entero");
        num=leer.nextInt();
        d = num*2;
        System.out.println("El doble del numero ingresado es: "+d);
        t = num*3;
        System.out.println("El triple del numero ingresado es: "+t);
        rc=Math.sqrt(num);
        System.out.println("La raiz cuadrada del numero ingresado es: "+rc);
        
    }
   
}
