/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import modelo.Alumno;

/**
 *
 * @author MXGALLEGO
 */
public class Clase13 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Luis Miguel",10);
        Alumno alumno2 = new Alumno("pepito los palotes",20);
        Alumno alumno3 = new Alumno("Juan Carlos",30);
        Alumno alumno4 = new Alumno("Pedro Pedrito",40);
        Alumno alumno5 = new Alumno("Gustavo Sanchez",50);
        Alumno alumno6 = new Alumno("Marcia Maria",80);
        
        Collection<Alumno> listaAlumnos = new ArrayList<>();
        
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        
        Alumno alumnoNuevo = new Alumno("Luis Miguel", 80);
        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumno1));
    }
}
