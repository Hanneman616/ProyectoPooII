
package Clases;


public class Computador extends TiendaElectrodomesticos{
    
    protected String tipo;
    

    public Computador(String tipo, String Productos, int Cantidad, double Precio, double precioExtras, String modelo) {
        super(Productos, Cantidad, Precio, precioExtras, modelo);
        this.tipo = tipo;
    }
    
    
    
    public double calcularPrecio(){
        double precio=0;
        
        if(tipo.equals("Laptop")){
            precio=500;
        }
        if(tipo.equals("Escritorio")){
            precio=600;
        }
        
        
        
        
        
        
        
        

        return 2;
        
        
    }
    
    
    
    
    
    
    
}
