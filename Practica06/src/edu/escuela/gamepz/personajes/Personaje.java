package com.patito.poo1pract.personajes;
public class Personaje {
    private String nombre;
    private int edad;
    //constructor 
    public  Personaje(String nombre, int edad){
        this.edad = edad;
        this.nombre =nombre;
    }
    public void SetNombre(String nombre){
        this.nombre = nombre;
        int lenght = nombre.length();
        if (nombre.length()>5 && nombre.length()<25)
            return ;
    } 
    public String getNombre(){
        return nombre;   
    }
    
    public void saludar(){
        System.out.println("Hola Alumno de POO "+ nombre);
        
    }
    //primer metodo
    public int getEdad(){
        return this.edad;
    }
    //segundo metodo
    public boolean setEdad(int edad){
        if(edad>0 && edad<120){
            this.edad = edad;
            return true;
        }else{
            return false;
        }

    }
}
