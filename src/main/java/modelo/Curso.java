/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MXGALLEGO
 */
public class Curso /*implements  Comparable<Curso>*/{
    
    private  String nombre;
    private  int tiempo;
    private List<Aula> claseList = new ArrayList();

    public Curso(String nombre, int codigo) {
        this.nombre = nombre;
        this.tiempo = codigo;
    }
    public Curso(String nombre, int codigo, List<Aula> claseList) {
        this.nombre = nombre;
        this.tiempo = codigo;
        this.claseList = claseList;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setCodigo(int codigo) {
        this.tiempo = codigo;
    }

    @Override
    public String toString(){
        return  this.nombre;
    }
    
    /*
    @Override
    public int compareTo(Curso o) {
        return  this.nombre.compareTo(o.getNombre());
    */

    public List<Aula> getClaseList() {
        return Collections.unmodifiableList(claseList);
    }

    public void setClaseList(List<Aula> claseList) {
        this.claseList = claseList;
    }
    
    public void addClase(Aula clase){
        this.claseList.add(clase);
    }
    
    
    
    
}
