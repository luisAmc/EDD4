/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd4;

import edd4.PlanDeClases;
import edd4.PlanDeClases;
import edu.uci.ics.jung.graph.SparseMultigraph;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luis Martinez
 */
public class main {
    public static void main(String[] args) {
        PlanDeClases p = new PlanDeClases();
        
//        System.out.println("IMPRIMIENDO CLASES");
//        System.out.println("-----------------------------------");
//        SparseMultigraph grafo = new  SparseMultigraph();
//        grafo = p.grafo;
//        Object[] V = grafo.getVertices().toArray();
//         for (int i = 0; i <V.length; i++) {//inicio for
//             System.out.println(V[i]);
//        }//fin for
         System.out.println("\nOrdenamiento ");
        p.ordenamientoTopologico();
    }
}
