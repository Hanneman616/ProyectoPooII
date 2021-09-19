/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpoo;

import Clases.TiendaElectrodomesticos;
import java.util.ArrayList;

/**
 *
 * @author Juanpaa
 */
public class Array {

    public Array() {
    }
    
    
    
    public static ArrayList<TiendaElectrodomesticos> tiendaArray= new ArrayList<>();
  
    public void agregarArray(TiendaElectrodomesticos c){
        tiendaArray.add(c);
        
    }
    
    public void imprimir(){
        System.out.println(tiendaArray);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
