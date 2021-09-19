/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Juanpaa
 */
public class Informe {
    
    private String NombreCliente;
    private String telefono;
    private String correo;
    private String fechaCompra;
    private String productosComprados;
    private double totalGastado;

    public Informe(String NombreCliente, String telefono, String correo, String fechaCompra, String productosComprados, double totalGastado) {
        this.NombreCliente = NombreCliente;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaCompra = fechaCompra;
        this.productosComprados = productosComprados;
        this.totalGastado = totalGastado;
    }
    
    public static ArrayList<Informe> informe = new ArrayList<>();

    public String getNombreCliente() {
        return NombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public String getProductosComprados() {
        return productosComprados;
    }

    public double getTotalGastado() {
        return totalGastado;
    }
    
    
    
    
    
    
    
    
    
    
}
