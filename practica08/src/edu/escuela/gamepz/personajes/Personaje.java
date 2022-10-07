package edu.escuela.gamepz.personajes; 

public class Personaje{
	private String nombre;
	private int edad;
	public Personaje (String nombre){
		this.nombre = nombre;
		this.edad = edad; 
	}
	public void setNombre(String nombre){
		int length = nombre.length();
		if(length >5 && length <25)
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void saludar(){
		System.out.println("Hola alumno de POO" +  nombre);
		}
	public int getEdad(){
		return edad;
	}
	
	public String getDetalle(){
		return nombre + "\t" + edad; 
	}
	public boolean setEdad(int e){
		if (e>0 && e<120){
			this.edad = e;
			return true;
		}else{
			return false;
		} 
	}
}