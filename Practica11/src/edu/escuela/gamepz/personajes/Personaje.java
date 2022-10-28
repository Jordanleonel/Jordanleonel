package personajes; 

public abstract class Personaje{
	protected  String nombre;
	private  int vida;
	protected int i;
    public int decVida;
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
	public String toString(){
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
	public abstract void decVida();
	//segundos metodos del paso 3 de la practica 08 
	public abstract void addVida();
		
	
}
