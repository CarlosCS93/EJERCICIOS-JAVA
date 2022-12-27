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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos. El programa deberá después mostrar el resultado de la suma*/
    
        Scanner leer =new Scanner(System.in);
        System.out.println("Ejercicio one ");
        System.out.println("Ingrese dos numero enteros");
        int num,num2,sum;
        num=leer.nextInt();
        num2=leer.nextInt();
        sum=num+num2;
        System.out.println("El resultados de la suma de los numeros ingresados es: "+ sum);
        

    }
    
}
