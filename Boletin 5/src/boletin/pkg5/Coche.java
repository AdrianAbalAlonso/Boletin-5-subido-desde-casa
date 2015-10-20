
package boletin.pkg5;


public class Coche {
    private int velocidad ;
    //constructores
public Coche(){
    velocidad=0;

    
    }
//puntos de acceso
public int getvelocidad(){
    return velocidad ;
}
public void acelerar (int valor){
velocidad+=valor;
}
public void frenar (int menos){
velocidad-=menos;    
}


















}