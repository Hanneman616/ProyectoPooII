
package Clases;


public class Televisor extends TiendaElectrodomesticos{
    
    
    protected String resolucion;
    protected int pulgadas;

    public Televisor(String resolucion, int pulgadas, String Productos, int Cantidad, double precioExtras, String modelo) {
        super(Productos, Cantidad, precioExtras, modelo);
        this.resolucion = resolucion;
        this.pulgadas = pulgadas;
    }
    
    
    public double calcularPrecio(){
      
        
        
        

        return 2;
        
        
    }
    
    



    
    
    
    
    
    
    
}
