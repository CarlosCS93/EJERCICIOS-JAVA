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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 8. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
        usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        Nota: investigar la función Lenght() en Java.*/
        
        Scanner leer = new Scanner (System.in);
        String palabra;
        int longi;
        System.out.println("Ingrese una frase o palabra de maximo 8 caracteres");
        palabra=leer.nextLine();
        longi= (palabra.length());
        System.out.println(longi);
        if (longi ==8){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
        
        
        
        
        
        
    }
    
}
