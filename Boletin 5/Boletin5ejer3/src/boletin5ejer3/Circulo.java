package boletin5ejer3;



/**
 *
 * @author aabalalonso
 */
public class Circulo {
    double radio ;
    final double PI=3.14;
    
    //constructores
    public Circulo(){
    
    }
    
    public Circulo (double r){
        radio=r;
    }
    
    //métodos de acceso
    
    public double calcularArea(){
    return Math.pow(radio, 2)*PI;
    }
    public double calcularLongitud(){
        return 2*PI*radio;
    
    }
    
}

