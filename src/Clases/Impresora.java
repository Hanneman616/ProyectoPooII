
package Clases;



public class Impresora extends TiendaElectrodomesticos {
    
    String tipoTinta="";
    

    public Impresora(String Productos, int Cantidad, double precioExtras, String modelo, String tipoTinta) {
        super(Productos, Cantidad, precioExtras, modelo);
        this.tipoTinta=tipoTinta;

    }

  
    
    public double calcularPrecio(){
        double precio=0;
        double precioTinta=0;
        
        if(modelo.equals("Hp")){
            precio=200;
        }
        if(modelo.equals("Canon")){
            precio=180;
        }
        if(modelo.equals("Epson")){
            precio=225;
        }
 
        if(tipoTinta.equals("TintaRecargable")){
            precioTinta=40;
        }else{
            precioTinta=65;
        }
        
        precioFinal =(precio + precioExtras) * iva * Cantidad;
        
        return 0;
        
        
    }
    
    
    
    
    
    
    
    
    
}
