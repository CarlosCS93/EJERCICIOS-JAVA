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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("| SISTEMA DE OPERACIONES MATEMATICAS BASICAS |");
        System.out.println("Ingrese dos valores");
        int num =leer.nextInt();
        int num2 =leer.nextInt();
        boolean i= false;
        boolean j=true;
        
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija la opcion: ");
            int opcion =leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Resultado = "+(num+num2));
                    i=true;
                    break;
                case 2:
                    System.out.println("Resultado = " + (num-num2));
                    i=true;
                    break;
                case 3:
                    System.out.println("Resultado = "+(num*num2));
                    i=true;
                    break;
                case 4:
                    System.out.println("Resultado = "+(num/num2));
                    i=true;
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa (Si/No)? ");
                    Scanner leerr = new Scanner(System.in);
                    String opcion2 = leerr.nextLine();
                    switch (opcion2) {
                        case "Si":
                            i=false;
                            break;
                        case "No":
                            i=true;
                            break;
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    i=true;
            }
                     
        }while (i == j);
        System.out.println("Gracias por usar nuestro sistema");
        
    
        
        
        
        
        
        
        
        
    }
    
}
