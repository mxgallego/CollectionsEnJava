/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author MXGALLEGO
 */
public class Alumno /*implements  Comparable<Curso>*/{
    
    private  String nombre;
    private  int codigo;

    public Alumno(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
        
    

   

   

    @Override
    public String toString(){
        return  this.nombre;
    }
    @Override
    public boolean equals(Object obj){
        Alumno alumno = (Alumno)obj;
        return super.equals(alumno.getNombre());
    }
    
    /*
    @Override
    public int compareTo(Curso o) {
        return  this.nombre.compareTo(o.getNombre());
    */
    
    
    
    
}
