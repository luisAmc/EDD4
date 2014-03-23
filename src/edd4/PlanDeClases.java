/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd4;

import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.event.GraphEvent.Edge;
import edu.uci.ics.jung.graph.util.EdgeType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Luis Martinez
 */
public class PlanDeClases {
    SparseMultigraph <NodoClase, DependenciaClase> grafo;
    class NodoClase {
        private String codigo;
        private String nombre;
        private int uv;
        private ArrayList<DependenciaClase> indegree;
        private ArrayList<DependenciaClase> outdegree;
        private boolean semestral;
        public NodoClase(String codigo, String nombre, int uv, boolean semestral) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.uv = uv;
            this.semestral = semestral;
        }
        public String getCodigo() {
            return codigo;
        }
        public int getUV() {
            return uv;
        }
        public void aumentarIndegree(DependenciaClase suficiencia) {
            indegree.add(suficiencia);
        }
        public void aumentarOutdegree(DependenciaClase dependencia) {
            outdegree.add(dependencia);
        }
        public ArrayList<DependenciaClase> getIndegree() {
            return indegree;
        }
        public ArrayList<DependenciaClase> getOutdegree() {
            return outdegree;
        }
        public String toString() {
            return codigo + " " + nombre + " u.v.: " + uv + ((semestral == true) ? "Es una clase semestral" : "No es una clase semestral");
        }
    }//Final de la clase anonima NodoClase
    class DependenciaClase {
        private NodoClase partida;
        private NodoClase llegada;
        public DependenciaClase (NodoClase partida, NodoClase llegada) {
            this.partida = partida;
            this.llegada = llegada;
        }
        @Override
        public boolean equals(Object obj) {
           DependenciaClase arista = (DependenciaClase)obj;
           return arista.partida == partida && arista.llegada == llegada;
        }
    }
    //Este metodo carga el codigo de la clase, su nombre, sus unidades valorativas y si es semestral o no
    private void cargarClases() {
        try {
            File archivo = new File("./resources/Sistemas Computacionales (Solo clases).txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String tmp, codigo, nombre, uv, semestral;
            StringTokenizer tokens = null;
            NodoClase nodo = null;
            while ((tmp = br.readLine()) != null) {
                tokens = new StringTokenizer(tmp, "@");
                while (tokens.hasMoreTokens()) {
                    codigo = tokens.nextToken();
                    nombre = tokens.nextToken();
                    uv = tokens.nextToken();
                    semestral = tokens.nextToken();
                   nodo = new NodoClase(codigo, nombre, Integer.parseInt(uv), (semestral.equalsIgnoreCase("true") ? true : false));
                   grafo.addVertex(nodo);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//Final del metodo que carga las clases (codigo, nombre, unidades valorativas, semestral)
    
    //Este metodo -cargarDependencias()- une los nodos del grafo
    private void cargarDependencias() {
        try {
            File archivo = new File("./resources/Sistemas Computacionales (Dependencias).txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String tmp, codigoClase1, codigoClase2;
            StringTokenizer tokens = null;
            NodoClase clase1 = null;
            NodoClase clase2 = null;
            Iterator iteradorClases = grafo.getVertices().iterator();
            while ((tmp = br.readLine()) != null){
                tokens = new StringTokenizer(tmp, "@");
                while (tokens.hasMoreTokens()){
                    codigoClase1 = tokens.nextToken();
                    codigoClase2 = tokens.nextToken();
                    for (NodoClase nodoTmp1 : grafo.getVertices()) {
                        if (nodoTmp1.getCodigo().equalsIgnoreCase(codigoClase1)) {
                            for (NodoClase nodoTmp2 : grafo.getVertices()) {
                                if (nodoTmp2.getCodigo().equalsIgnoreCase(codigoClase2)) {
                                    grafo.addEdge(new DependenciaClase(nodoTmp1, nodoTmp2), nodoTmp1, nodoTmp2, EdgeType.DIRECTED);
                                        nodoTmp2.aumentarIndegree(new DependenciaClase(nodoTmp1, nodoTmp2));
                                        nodoTmp1.aumentarOutdegree(new DependenciaClase(nodoTmp1, nodoTmp2));
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//Final del metodo cargarDependencias(Este une los vertices del grafo)
    private void ordenamientoTopologico() {
        ArrayList<NodoClase> listaNodos = new ArrayList<NodoClase>();
        HashSet<NodoClase> conjuntoClases = new HashSet<NodoClase>();
        for (NodoClase nodoTmp : grafo.getVertices()) {
            if (nodoTmp.getIndegree().size() == 0) {
                conjuntoClases.add(nodoTmp);
            }
        }
        
        while (!conjuntoClases.isEmpty()) {
            NodoClase nodoTmp = conjuntoClases.iterator().next();
            conjuntoClases.remove(nodoTmp);
            listaNodos.add(nodoTmp);
            
            for (Iterator<DependenciaClase> iterador = nodoTmp.getOutdegree().iterator(); iterador.hasNext();) {
                DependenciaClase dependencia = iterador.next();
                NodoClase clase = dependencia.llegada;
            }
        }
    }
}
