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
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Luis Martinez
 */
public class PlanDeClases {
    SparseMultigraph <NodoClase, DependenciaClase> grafo;
    
    public PlanDeClases(){
    
        grafo = new SparseMultigraph <NodoClase, DependenciaClase>();
        cargarClases();
        cargarDependencias();
    }//fin plan de clases
    
    
    class NodoClase {
        private String codigo;
        private String nombre;
        private int uv;
        private LinkedHashSet<DependenciaClase> inEdges;
        private LinkedHashSet<DependenciaClase> outEdges;
        private boolean semestral;
        public NodoClase(String codigo, String nombre, int uv, boolean semestral) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.uv = uv;
            this.semestral = semestral;
            inEdges = new LinkedHashSet<DependenciaClase>();
            outEdges = new LinkedHashSet<DependenciaClase>();
        }
        public void addEdge(NodoClase nodo) {
            DependenciaClase arista = new DependenciaClase(this, nodo);
            outEdges.add(arista);
            nodo.inEdges.add(arista);
        }
        public String getCodigo() {
            return codigo;
        }
        public int getUV() {
            return uv;
        }
        public void aumentarIndegree(DependenciaClase suficiencia) {
            try {
                inEdges.add(suficiencia);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        public void aumentarOutdegree(DependenciaClase dependencia) {
            outEdges.add(dependencia);
        }
        public LinkedHashSet<DependenciaClase> getIndegree() {
            return inEdges;
        }
        public LinkedHashSet<DependenciaClase> getOutdegree() {
            return outEdges;
        }
        @Override
        public String toString() {
            return codigo + " " + nombre + " u.v.: " + uv;
             //+ ((semestral == true) ? " Es una clase semestral" : " No es una clase semestral")
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
            File archivo = new File("./src/resources/Sistemas Computacionales (Solo clases).txt");
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
                   grafo.addVertex(new NodoClase(codigo, nombre, Integer.parseInt(uv), (semestral.equalsIgnoreCase("true") ? true : false)));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//Final del metodo que carga las clases (codigo, nombre, unidades valorativas, semestral)
    
    //Este metodo -cargarDependencias()- une los nodos del grafo
    private void cargarDependencias() {
        try {
            File archivo = new File("./src/resources/Sistemas Computacionales (Dependencias).txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String tmp, codigoClase1, codigoClase2;
            StringTokenizer tokens = null;
            DependenciaClase dependenciaTmp = null;
            Iterator iteradorClases = grafo.getVertices().iterator();
            while ((tmp = br.readLine()) != null){
                tokens = new StringTokenizer(tmp, "@");
                while (tokens.hasMoreTokens()){
                    codigoClase1 = tokens.nextToken();
                    System.out.println("\nSoy yo + " + codigoClase1 + " \n\n");
                    if(tokens.hasMoreTokens()){
                    codigoClase2 = tokens.nextToken();
                        System.out.println("soy yo " + codigoClase2);
                    for (NodoClase nodoTmp1 : grafo.getVertices()) {
                        if (nodoTmp1.getCodigo().equalsIgnoreCase(codigoClase1)) {
//                            if (codigoClase2.equalsIgnoreCase("null")) {
//                                System.out.println("->-> " + nodoTmp1.nombre + " puede ser una clase inicial");
//                            } else 
//                            {
                                for (NodoClase nodoTmp2 : grafo.getVertices()) {
                                    if (nodoTmp2.getCodigo().equalsIgnoreCase(codigoClase2)) {
                                        System.out.println("entre");
                                        
                                        nodoTmp1.addEdge(nodoTmp2);
                                        
//                                        dependenciaTmp = new DependenciaClase(nodoTmp2, nodoTmp1);
//                                        grafo.addEdge(dependenciaTmp, nodoTmp2, nodoTmp1, EdgeType.DIRECTED);
//                                        nodoTmp1.aumentarIndegree(dependenciaTmp);
//                                        nodoTmp2.aumentarOutdegree(dependenciaTmp);
                                        System.out.println("-> " + nodoTmp1.nombre + " depende de " + nodoTmp2.nombre);
//                                        if (nodoTmp1.codigo.equalsIgnoreCase("MAT103")) {
                                            System.out.println("\n\nAqui Esta!\n\n");
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                        }
//                    }
                //}
                }//fin if validacion
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//Final del metodo cargarDependencias(Este une los vertices del grafo)
    public void ordenamientoTopologico() {
        ArrayList<NodoClase> listaNodos = new ArrayList<NodoClase>();
        LinkedHashSet<NodoClase> conjuntoClases = new LinkedHashSet<NodoClase>();
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
                iterador.remove();
                clase.inEdges.remove(dependencia);
                
                if (clase.inEdges.isEmpty()) {
                    conjuntoClases.add(clase);
                }
            }
        }
        boolean ciclo = false;
        for (NodoClase nodoTmp : grafo.getVertices()) {
            if (!nodoTmp.inEdges.isEmpty()) {
                ciclo = true;
                break;
            }
        }
        if (ciclo)
            System.out.println("Existe un ciclo man, algo esta mal con el grafo! HAY QUE ARREGLALO!");
        else {
            int j = 0;
            for (int i = listaNodos.size() - 1; i >= 0; i--) {
                System.out.print(listaNodos.get(i) + "\t |||| \t");
                j++;
                if (j == 3) {
                    System.out.println("");
                    j = 0;
                }
            }
        }
    }
}
