
package boletin5ejer3;

import java.util.Scanner;


public class Boletin5ejer3 {

    
    public static void main(String[] args) {
        
    
    double radio ;
     System.out.println("Introduzca el radio");
     Scanner obx=new Scanner (System.in);
     radio=obx.nextDouble();
     
    Circulo hayarArea = new Circulo(radio);
    System.out.println("El area sera "+hayarArea.calcularArea());
    Circulo hayarLongitud = new Circulo(radio);
    System.out.println("La longitud del círculo sera "+hayarLongitud.calcularLongitud());
    
    
    
    
    
    
    
    
    }  
    
    
        
    }
    

