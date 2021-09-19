/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Juanpaa
 */
public class Validador {
    
    public boolean validarId(String id){
       int suma=0;
       int mod;
       int verificador;
       int[]cedula = new int[10];
       String ID = String.valueOf(id);
       
        for(int i = 0; i < id.length(); i++) {
            cedula[i]=Integer.parseInt(id.substring(i,i+1));
            System.out.println(cedula[i]);
        }
        
        //posiciones impares y suma de impares
        for (int i=0; i<9 ; i=i+2){
            
            cedula[i]=cedula[i]*2;
            if (cedula[i]>9){
                cedula[i]=cedula[i]-9;
            }
            
            suma+=cedula[i];
   
        }      
        for (int i=1; i<8; i=i+2){  
            suma+=cedula[i];
            
        
        }
        System.out.println(suma);
        mod=suma%10;
        if (mod==0){
            verificador=mod;
        }
         
        verificador=10-mod;
        if (verificador==cedula[9]){
            JOptionPane.showMessageDialog(null,"La cedula se ha validado correctamente", "Validacion cedula" , 3);
            
            return true;
            
        }else{
            
            return false;
        }    

    }
    
    public static boolean validarNombreApellido(String nombre){
        return nombre.matches("[A-Za-z|ñ|N]+"); //inicia con mayuscula seguido de una o mas letras minusculas
    }
    
    public static boolean validarTelefono(String id){
        return id.matches("[\\d]{10}");
    }

    public static boolean validarCorreo(String correo){
        return correo.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"  );
    }
    
}
