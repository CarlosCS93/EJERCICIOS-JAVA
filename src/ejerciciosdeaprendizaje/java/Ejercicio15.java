/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeaprendizaje.java;

/**
 *
 * @author Usuario
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        muestre por pantalla en orden descendente.*/
        int [] vector = new int [100];
        
        for (int i =0 ; i < 100; i++) {
            
            vector[i]=100-i;
        }
        for (int i =0 ; i < 100; i++) {
            
            System.out.println("["+vector[i]+"]");
        }
        
        System.out.println(" ");
    }
    

}