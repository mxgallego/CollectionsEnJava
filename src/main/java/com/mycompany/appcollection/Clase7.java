/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appcollection;

import java.util.ArrayList;
import java.util.List;
import modelo.Alumno;
import modelo.Curso;

/**
 *
 * @author MXGALLEGO
 */
public class Clase7 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("java",30, new ArrayList<>());
       // curso1.addClase(new Aula("Arraylist"));
        //curso1.addClase(new Aula("List"));
        //curso1.addClase(new Aula("LinkedList"));
        
        List<Alumno> aulaList = curso1.getClaseList();
        //aulaList.add(new Aula("Inmutable"));
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        
        System.out.println(aulaList);
        
    }
}
