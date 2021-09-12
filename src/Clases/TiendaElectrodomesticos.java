
package Clases;


public class TiendaElectrodomesticos {
    
    protected String Productos;
    protected int Cantidad;
    protected double Precio;
    protected double precioExtras;
    protected String modelo;
    protected final double iva=0.12;

    public TiendaElectrodomesticos(String Productos, int Cantidad, double Precio, double precioExtras, String modelo) {
        this.Productos = Productos;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.precioExtras = precioExtras;
        this.modelo = modelo;
    }
    
    
    
    
    
    
    
}
