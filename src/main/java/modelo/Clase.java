/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author MXGALLEGO
 */
public class Clase /*implements  Comparable<Curso>*/{
    
    private  String nombre;
    //private  int codigo;
    
    public Clase(String nombre) {
        this.nombre = nombre;
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    
    
    
}
