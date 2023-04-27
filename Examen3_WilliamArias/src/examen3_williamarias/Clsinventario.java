/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3_williamarias;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Clsinventario {
   static ArrayList<String>  codigo  = new ArrayList<>();
   static ArrayList<String> descripcion  = new ArrayList<>();
   static ArrayList<Integer> cantidad  = new ArrayList<>();
   static ArrayList<String> tipo  = new ArrayList<>();
   static ArrayList<Boolean> activo  = new ArrayList<>();
   static ArrayList<Integer> precio  = new ArrayList<>();
   static int Activosi, Activono;
   
public  Clsinventario() { 
    Activosi = 0;
    Activono = 0;
   }
   public static void BuscarCodigo( String Nombre){
        
        Boolean encontrado = false;
        String bolenoactivo = "No";
        for (int i = 0; i < Clsinventario.codigo.size(); i++) 
        {
            
            if (Clsinventario.codigo.get(i).toLowerCase().equals(Nombre.toLowerCase())) 
            {
                encontrado = true;
                if ( Clsinventario.activo.get(i)) {
                    bolenoactivo = "Si";
                }
               JOptionPane.showMessageDialog(null, "Codigo: " + Clsinventario.codigo.get(i) +  "\n\nDescripcion: " + Clsinventario.descripcion.get(i) + "\n\nCantidad: " + cantidad + "\n\nTipo: "+ Clsinventario.tipo.get(i)+"\n\nActivo: "+ Clsinventario.activo.get(i)+
                 "Precio: " + Clsinventario.precio.get(i));
                
               
               break;
            }
           
        }
                 if (!encontrado) JOptionPane.showMessageDialog(null, "NO existe");
    }

public static  int getActivono() {
        return Activono;
    }
    public void SetSalvarInfo(String Codigo, Boolean Activo, int Cantidad,int Precio,String Descripcion,String Tipo) 
    {
        codigo.add(Codigo); 
        activo.add(Activo);
        cantidad.add(Cantidad);
        precio.add(Precio);
        descripcion.add(Descripcion);
        tipo.add(Tipo);
    }

}
