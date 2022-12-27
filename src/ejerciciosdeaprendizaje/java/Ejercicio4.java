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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    Scanner leer = new Scanner(System.in);
    int grados,f;
        System.out.println("Convertidor de temperatura de ºC --> ºF");
        System.out.println("Ingrese la temperatura en grados Celsius");
        grados=leer.nextInt();
        f=32 + (9 * grados / 5);
        System.out.println("La temperatura en grados Fahrenheit es " + f +"ºF");
        
        
    
    
    
    }
    
}
