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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
        es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
        diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
        la función Substring y equals() de Java.*/
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese una frase o palabra");
        String palabra =leer.nextLine();
        System.out.println(palabra.substring(0,1 ));
        String caracter = palabra.substring(0, 1);
        if (caracter.equals("A")|| (caracter.equals("a"))){
            System.out.println("CORRECTO");
        }else {
            System.out.println("Incorrecto");
        }
        
        
        
        
    }
    
}
