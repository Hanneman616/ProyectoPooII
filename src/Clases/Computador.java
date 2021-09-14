
package Clases;

import java.text.DecimalFormat;


public class Computador extends TiendaElectrodomesticos{
    
    protected String tipo;
    

    public Computador(String tipo, String Productos, int Cantidad, double precioExtras, String modelo) {
        super(Productos, Cantidad, precioExtras, modelo);
        this.tipo = tipo;
    }
    
    
    

    public double calcularPrecio(){
        double precio=0;
        double precioFinal=0;
        
        if(tipo.equals("Laptop")){
            precio=500;
            if(modelo.equals("Lenovo")){
            precio+=110;
        }
        if(modelo.equals("Asus")){
            precio+=130;
        }
        if(modelo.equals("Hp")){
            precio+=122;
        }
        if(modelo.equals("Dell")){
            precio+=115;
        }
        
        }
        
        ////////////////////////////////
        
        
        if(tipo.equals("Escritorio")){
            precio=600;
            if(modelo.equals("Lenovo")){
            precio+=130;
        }
        if(modelo.equals("Asus")){
            precio+=143;
        }
        if(modelo.equals("Hp")){
            precio+=123;
        }
        if(modelo.equals("Dell")){
            precio+=113;
        }
        }
        
        //En esta parte solo todo dos decimales del Precio final.
        
        precioFinal=(precio+precioExtras)*iva*Cantidad;
        DecimalFormat df = new DecimalFormat("#.00");
        precioFinal=((double)Math.round(precioFinal * 100d) / 100d);
        

        return precioFinal ;
        
        
    }
    
    
    
    
    
    
    
}
