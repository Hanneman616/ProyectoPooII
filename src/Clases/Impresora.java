
package Clases;

import java.text.DecimalFormat;



public class Impresora extends TiendaElectrodomesticos {
    
String tipoTinta="";
    


    public Impresora(String Productos, int Cantidad, double precioExtras, String modelo, String tipoTinta) {
        super(Productos, Cantidad, precioExtras, modelo);
        this.tipoTinta=tipoTinta;

    }

    public double calcularPrecio(){
        double precio = 0;
        double precioTinta = 0;
        double precioFinal = 0;
        
        if(modelo.equals("Hp")){
            precio=200;
        }
        if(modelo.equals("Canon")){
            precio=180;
        }
        if(modelo.equals("Epson")){
            precio=225;
        }

        if(tipoTinta.equals("Tinta Recargable")){
            precioTinta=40;
        }else{
            precioTinta=65;
        }

        precioFinal =(precio + precioExtras+precioTinta) * iva * Cantidad;
        DecimalFormat df = new DecimalFormat("#.00");
        precioFinal=((double)Math.round(precioFinal * 100d) / 100d);

        return precioFinal;

    }
    
    
    
    
    
    
    
    
}
