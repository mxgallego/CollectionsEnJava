/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appcollection;

import modelo.Curso;
import java.util.ArrayList;
import modelo.Alumno;

/**
 *
 * @author MXGALLEGO
 */
public class AppCollection {

    public static void main(String[] args) {
        /*
        Curso curso1 = new Curso("java",30);
        Curso curso2 = new Curso("javaScript",10);
        Curso curso3 = new Curso("Php",20);
        Curso curso4 = new Curso("Ruby",50);
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        
        System.out.println(cursos);
        
       // Collections.sort(cursos, Collections.reverseOrder());
       // List<Curso> listaCurso = cursos.stream().sorted(Comparator.comparing(Curso::getTiempo)).Collect(Collections.List));
        System.out.println(cursos);
        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
        System.out.println(cursoList);
        */
        Curso curso1 = new Curso("java",30, new ArrayList<>());
        /*curso1.addClase(new Aula("Arraylist"));
        curso1.addClase(new Aula("List"));
        curso1.addClase(new Aula("LinkedList"));*/
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        
        System.out.println(cursos.get(0).getClaseList());
        
    }
}
