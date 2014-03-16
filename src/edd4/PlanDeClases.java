/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd4;

import edu.uci.ics.jung.graph.SparseMultigraph;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Luis Martinez
 */
public class PlanDeClases {
    SparseMultigraph <NodoClase, String> grafo;
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
        try {
            File archivo = new File("./resources/Sistemas Computacionales.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String tmp;
            while ((tmp = br.readLine()) != null) {
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
