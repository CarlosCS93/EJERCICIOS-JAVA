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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6. Crear un programa que dado un numero determine si es par o impar.
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int num =leer.nextInt();
        if (num %2 ==0){
            System.out.println("El numero es par");
            
        }else {
            System.out.println("El numero es impar");
        }
                    
        
      }
    
}
