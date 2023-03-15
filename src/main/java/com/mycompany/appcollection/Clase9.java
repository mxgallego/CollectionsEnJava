package com.mycompany.appcollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import modelo.Curso;
import modelo.Curso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import modelo.Aula;

/**
 *
 * @author MXGALLEGO
 */
public class Clase9 {
    public static void main(String[] args) {
    Curso curso1 = new Curso("Historia",30);
    Curso curso2 = new Curso("Algebra",10);
    Curso curso3 = new Curso("Aritmetica",20);
    Curso curso4 = new Curso("matematicas",30);
    Curso curso5 = new Curso("fisica",10);
    Curso curso6 = new Curso("quimica",20);
    
    ArrayList<Curso> cursos = new ArrayList<>();
   
    cursos.add(curso1);
    cursos.add(curso2);
    cursos.add(curso3);
    cursos.add(curso4);
    cursos.add(curso5);
    cursos.add(curso6);
    
    Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
    
    int tiempo = 0;
        for (Curso curso : cursos) {
            tiempo +=curso.getTiempo();
        }
        System.out.println(tiempo);
        
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
        
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
        
        Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
        
        groupCurso.forEach((key, value)->System.out.println(key + " - "+ value.size()));
     
        System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
    }
    
}
