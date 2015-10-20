
package boletin.pkg5.ejercicio.pkg2;



    public class Satellite{
 
     private double meridiano;
     private double paralelo;
     private double distanciaTerra;

 public Satellite(){
}

public Satellite(double m,double p ,double d){

meridiano = m;
paralelo = p;
distanciaTerra = d;

}
public void verPosicion ( ) {

System.out.println("o satelite atopase  no paralelo " +paralelo + " meridiano " + meridiano +" a unha distancia da terra " + distanciaTerra );   
    
    
    
    
    
    
}
   
    
    
    }