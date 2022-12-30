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
public class Ejericicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 14.Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("CONVERTIDOR DE MONEDA EURO ---€-- ");
        System.out.println("Ingrese la cantidad de Euros (€) para convertir");
        
        double moneda = leer.nextDouble();
        System.out.println("OPCIONES");
        System.out.println("1.libras");
        System.out.println("2.dolares");
        System.out.println("3.yenes");
        System.out.println("escoja su opcion");
        String opcion =leer.next();
        double retorno=convertir(moneda,opcion);
        cambioMoneda(opcion,retorno);
        
    }
    public static double convertir (double moneda, String opcion){
        
        double moneda2=0;
        switch (opcion) {
            case "libras" :
                moneda2 = (moneda*0.86);
                break;
            case "dolares":
                moneda2= (moneda*1.28611);
                break;
            case "yenes":
                moneda2= (moneda*129.852);
                                       
        }
        
        
        return moneda2;
        
    }
    
    public static void cambioMoneda(String opcion, double retorno){
        System.out.println("la cantidad de "+opcion+ " es: "+ retorno);
    }
}    
        
       
        
        
        
        
        
        
    
      
        
        
        
        
        
        
        
    
    
    
    
    
    
    
    



