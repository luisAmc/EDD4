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

    SparseMultigraph<NodoClase, DependenciaClase> grafo;

    public PlanDeClases() {

        grafo = new SparseMultigraph<NodoClase, DependenciaClase>();
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
            this.outEdges.add(arista);
            nodo.inEdges.add(arista);
        }

        public String getCodigo() {
            return codigo;
        }

        public int getUV() {
            return uv;
        }
        
        public LinkedHashSet<DependenciaClase> getInEdges() {
            return inEdges;
        }

        public LinkedHashSet<DependenciaClase> getOutEdges() {
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

        public DependenciaClase(NodoClase partida, NodoClase llegada) {
            this.partida = partida;
            this.llegada = llegada;
        }

        @Override
        public boolean equals(Object obj) {
            DependenciaClase arista = (DependenciaClase) obj;
            return arista.partida == partida && arista.llegada == llegada;
        }
        @Override
        public String toString() {
            return partida + " -> " + llegada;
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
            
            while ((tmp = br.readLine()) != null) {
                tokens = new StringTokenizer(tmp, "@");
                
                while (tokens.hasMoreTokens()) {
                    codigoClase1 = tokens.nextToken();
//                    System.out.println("El codigo 1 es " + codigoClase1);
                    if (tokens.hasMoreTokens()) {
                        codigoClase2 = tokens.nextToken();
//                        System.out.println("El codigo 2 es " + codigoClase2);
                        for (NodoClase nodoTmp1 : grafo.getVertices()) {
                            if (nodoTmp1.codigo.equalsIgnoreCase(codigoClase1)) {
//                                System.out.println("encontre el 1");
                                for (NodoClase nodoTmp2 : grafo.getVertices()) {
                                    if (nodoTmp2.codigo.equalsIgnoreCase(codigoClase2)) {
//                                        System.out.println("encontre el 2");
//                                        System.out.println("Clase: " + nodoTmp2.nombre);
//                                        System.out.println("Suficiencia de: " + nodoTmp1.nombre + "\n");
                                        nodoTmp2.addEdge(nodoTmp1);
                                        
                                        break;
                                    }
                                }
                                break;
                            }
                        }
//                        System.out.println("");
                    }
//                    }
                    //}
                }//fin if validacion
            }
            NodoClase n1 = null;
            NodoClase n2 = null;
            for (NodoClase nodoTmp : grafo.getVertices()) {
                if (nodoTmp.codigo.equalsIgnoreCase("MAT103")) {
                    n2 = nodoTmp;
//                    System.out.println("hohoho");
                } else if (nodoTmp.nombre.equalsIgnoreCase("algebra")) {
                    n1 = nodoTmp;
//                    System.out.println("hohoho2");
                }
                if ((n1 != null) && (n2 != null)) {
                    n1.addEdge(n2);
//                    System.out.println("se hizo");
                    break;
                } else {
//                    System.out.println("no se hizo");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//Final del metodo cargarDependencias(Este une los vertices del grafo)

    public void ordenamientoTopologico() {
        for (NodoClase tmp : grafo.getVertices()) {
            System.out.println(tmp.getOutEdges().size() + " <- este es el size real");
        }
        
        ArrayList<NodoClase> listaNodos = new ArrayList<NodoClase>();
        LinkedHashSet<NodoClase> conjuntoClases = new LinkedHashSet<NodoClase>();
//        System.out.println("\nAl conjunto");
        for (NodoClase nodoTmp : grafo.getVertices()) {
            if (nodoTmp.getInEdges().size() == 0) {
                conjuntoClases.add(nodoTmp);
//                System.out.println(nodoTmp);
            }
        }
        
//        System.out.println("\nViendo la lista");
        while (!conjuntoClases.isEmpty()) {
            NodoClase nodoTmp = conjuntoClases.iterator().next();
            conjuntoClases.remove(nodoTmp);
//            System.out.println(nodoTmp);
            listaNodos.add(nodoTmp);
            System.out.println("\nSolo chequeando el size real de nuevo -> " + listaNodos.get(0).getOutEdges().size());

            for (Iterator<DependenciaClase> iterador = nodoTmp.getOutEdges().iterator(); iterador.hasNext();) {
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
        if (ciclo) {
            System.out.println("Existe un ciclo man, algo esta mal con el grafo! HAY QUE ARREGLALO! ");
        } else {
            try {
                String salida = "";
                int clasesPorTrimestre = 0;
                for (int i = 0; i < listaNodos.size(); i++) {
                    if (validacionTopologica(listaNodos, i) == 0) {
                        salida += " " + listaNodos.get(i);
                        System.out.println(0);
                        clasesPorTrimestre++;
                    } else if (validacionTopologica(listaNodos, i) == 1) {
                        salida += " " + listaNodos.get(i);
                        System.out.println(1);
                        clasesPorTrimestre += 3;
                    } else if (validacionTopologica(listaNodos, i) == 2) {
                        salida += " " + listaNodos.get(i);
                        System.out.println(2);
                        clasesPorTrimestre += 2;
                    } else if (validacionTopologica(listaNodos, i) == 3) {
                        salida += " " + listaNodos.get(i);
                        System.out.println(3);
                        clasesPorTrimestre += 1;
                    }
                    if (clasesPorTrimestre > 3) {
                        salida += "\n";
                        clasesPorTrimestre = 0;
                    }
                }
                System.out.println(salida);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    private int validacionTopologica(ArrayList<NodoClase> lista, int pos) {
        int retVal = 0;
        System.out.println(lista.get(pos).getOutEdges().size() + " <- este es el size");
        try {
            if (lista.get(pos).getOutEdges().isEmpty())
                return retVal;
            else if (!lista.get(pos).getOutEdges().isEmpty())
                if(lista.get(pos).getOutEdges().contains(lista.get(pos + 1))) {
                    retVal++;
                } else if (lista.get(pos).getOutEdges().contains(lista.get(pos + 2))) {
                    retVal++;
                } else if (lista.get(pos).getOutEdges().contains(lista.get(pos + 3))) {
                    retVal++;
                }
        } catch (Exception ex) {
        } finally {
            return retVal;
        }
    }
}
