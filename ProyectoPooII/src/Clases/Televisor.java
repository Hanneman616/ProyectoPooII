
package Clases;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class Televisor extends TiendaElectrodomesticos{
    
    
    protected String resolucion;
    protected int pulgadas;

    public Televisor(String resolucion, int pulgadas, String Productos, int Cantidad, double precioExtras, String modelo) {
        super(Productos, Cantidad, precioExtras, modelo);
        this.resolucion = resolucion;
        this.pulgadas = pulgadas;
    }
    

    
    public double calcularPrecio(){
      double precio=0;
        double precioFinal=0;
        
        if(modelo.equals("LG")){
            precio=500;
   
        }
        if(modelo.equals("Sony")){
           precio=300;
        }
        if(modelo.equals("Samsung")){
           precio=450;
        }
        if(modelo.equals("Philips")){
           precio=500;
        }
        
        if(resolucion.equals("HD")){
            precio+=100;
        }
        if(resolucion.equals("Full HD")){
            precio+=150;
        }
        if(resolucion.equals("4K")){
            precio+=200;
        }
        if(resolucion.equals("8K")){
            precio+=250;
        }
        
         if(pulgadas==32){
            precio+=60;  
        }
        if(pulgadas == 55){
            precio+=150;
        }
        if(pulgadas == 85){
            precio+=280;
        }
        
         
        precioFinal=(precio+precioExtras)*iva*Cantidad;
        DecimalFormat df = new DecimalFormat("#.00");
        precioFinal=((double)Math.round(precioFinal * 100d) / 100d);
        

        return precioFinal ;
  
    }  
    
}
