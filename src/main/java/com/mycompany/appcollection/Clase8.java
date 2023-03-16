/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appcollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import modelo.Alumno;
import modelo.Curso;

/**
 *
 * @author MXGALLEGO
 */
public class Clase8 {
    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }  
    };
    public static void main(String[] args) {
       
        for (List<Integer> lista : listas) {
            final String nombreImplementacion = lista.getClass().getSimpleName();
            //add
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                lista.add(i);
            }
            long fin = System.currentTimeMillis();
            long duracion = fin - inicio;
            System.out.println(nombreImplementacion+" add: "+duracion);
            
            //get
            inicio = System.currentTimeMillis();
            for (int i = 9999; i < 1000000; i++) {
                lista.get(i);
            }
            fin = System.currentTimeMillis();
            duracion = fin - inicio;
            System.out.println(nombreImplementacion+" add: "+duracion);
            
            //remove
            inicio = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                lista.remove(i);
            }
            fin = System.currentTimeMillis();
            duracion = fin - inicio;
            System.out.println(nombreImplementacion+" remove: "+duracion);
        }
    }
}
