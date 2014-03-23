/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edd4;

import java.util.ArrayList;

/**
 *
 * @author David Discua
 */
public class Planes {//inicio calse Planes
    
    private ArrayList<Clase>Clases;
    private String nombre;
    
    
      public Planes() {//inicio constructor vacio
        this.Clases=new ArrayList();
    }//fin cosntructor vacio

    public Planes(String nombre) {//inicio constructor vacio
        
        
        this.nombre=nombre;
    }//fin cosntructor vacio
    

    
    
    public ArrayList<Clase> getClases() {
        return Clases;
    }

    public void setClases(Clase Clases) {
        this.Clases.add(Clases);
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}//fin clase Planes
