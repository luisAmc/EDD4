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
public class Clase {//inicio clase

    private String nombre;
    private String codigo;
    private int unidades;
    private ArrayList<Clase> Requisitos;

    public Clase() {//inicio constructor vacio
    }//fi cosntructor Vacio

    public Clase(String nombre, String codigo, int unidades) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.unidades = unidades;
        this.Requisitos =new ArrayList();
    }//fin constructor sobrecargado

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public ArrayList<Clase> getRequisitos() {
        return Requisitos;
    }

    public void setRequisitos(Clase Requisitos) {
        /*Vamos seteando las clases que son requisitos para esta clase*/
        this.Requisitos.add(Requisitos);
        
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}//fin clase
