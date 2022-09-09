package edu.escuela.gamepz.personajes;
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
        if (nombre.length()>5 && nombre.length()<25){
            return true;
        }
    } 
    public String getNombre(){
        return nombre;   
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
    //nuevo metodo 
    public void getDetalle(){
        return nombre + "\t" edad;
        
    }
}
