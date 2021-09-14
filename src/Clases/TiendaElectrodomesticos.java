
package Clases;

import java.util.ArrayList;


public class TiendaElectrodomesticos {
    
    protected String Producto;
    protected int Cantidad;
    protected double PrecioFinal;
    protected double precioExtras;
    protected String modelo;
    protected final double iva=1.12;
    
    public static ArrayList<TiendaElectrodomesticos> tiendaArray= new ArrayList<>();

    public TiendaElectrodomesticos(String Producto, int Cantidad,  double precioExtras, String modelo) {
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.precioExtras = precioExtras;
        this.modelo = modelo;
    }

  

    public void setPrecioFinal(double PrecioFinal) {
        this.PrecioFinal = PrecioFinal;
    }
    
    
    @Override
    public String toString(){
        return Producto + Cantidad + PrecioFinal + precioExtras + modelo;
    }
    
    
    
    
}
