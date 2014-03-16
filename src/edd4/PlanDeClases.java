/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd4;

/**
 *
 * @author Luis Martinez
 */
public class PlanDeClases {
    class NodoClase {
        private String codigo;
        private String nombre;
        public NodoClase(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
        }
        public String toString() {
            return codigo + " " + nombre;
        }
    }//Final de la clase anonimo NodoClase
    private void cargarClases() {   
    }
    private void cargarDependencias() {
    
    }
}
