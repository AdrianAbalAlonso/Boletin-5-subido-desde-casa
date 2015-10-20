
package boletin.pkg5.ejercicio.pkg2;

import java.util.Scanner;


public class Boletin5Ejercicio2 {

    
    public static void main(String[] args) {
        
    double meridiano, paralelo,distanciaTerra ;
    Scanner obx = new Scanner(System.in);
    System.out.println("Escribe el meridiano");
    meridiano=obx.nextDouble();
    System.out.println("Escribe el paralelo");
    paralelo=obx.nextDouble();
    System.out.println("Escribe el distanciaTerra");
    distanciaTerra=obx.nextDouble();
    
    Satellite posicionsatellite = new Satellite(meridiano,paralelo,distanciaTerra);
    posicionsatellite.verPosicion();
    
    
    
    
    
    }
    
}
