package com.mycompany.appcollection;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MXGALLEGO
 */
public class Clase11 {
    //Todo
    public static void main(String[] args) {
        
        String alumno1 = "Luis Miguel";
        String alumno2 = "pepito los palotes";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Pedrito";
        String alumno5 = "Gustavo Sanchez";
        String alumno6 = "Marcia Maria";
        
        Set<String> listaAlumnos = new HashSet<>();
        
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        
        for (String listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno);
        }
        
        listaAlumnos.forEach(alumno->{System.out.println(alumno);});  
    }
}
