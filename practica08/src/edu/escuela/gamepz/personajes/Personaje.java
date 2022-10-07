package personajes; 

public class Personaje{
	protected String nombre;
	protected static int vida;
	protected int i;
	//constructores 
	public Personaje (String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida; 
	}
	public Personaje (String nombre){
		this.nombre = nombre;
		vida = 3; 
	}
	//metodos 
	public void setNombre(String nombre){
		int length = nombre.length();
		if(length >5 && length <25)
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	/*public void saludar(){
		System.out.println("Hola alumno de POO" +  nombre);
		}
	public int getVida(){
		return vida;
	}
	*/
	public String getDetalle(){
		return nombre + "\t" + vida; 
	}
	public boolean setVida(int e){
		if (e>0 && e<99){
			this.vida = e;
			return true;
		}else{
			return false;
		} 
	}
	//primeros metodos del paso 3 de la practica 08 
	public void decVida(){
		if(vida>0 && vida<99){
			vida = vida-1;
		}else{
			System.out.println("No esta dentro de los valores permitidos");
		}
		
	}
	public void decVida(int i){
		if(vida>0 && vida<99){
			vida= vida - i;
		}else{
			System.out.println("No esta dentro de los valores permitidos");
		}
	}
	//segundos metodos del paso 3 de la practica 08 
	public void addVida(){
		if(vida>0 && vida<99){
			vida = vida + 1;
		}else{
			System.out.println("No esta dentro de los valores permitidos");
		}
	}
	public void addVida(int i){
		if(vida>0 && vida<99){
			vida = vida + i;
		}else{
			System.out.println("No esta dentro de los valores permitidos");
		}
	}
}
