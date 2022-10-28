package edu.escuela.gamepz.personajes.buenos;

public class Planta extends Personaje { 
    private Escudo escudo;
    //constructores
    public Planta (String nombre, int vida, Escudo escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta (String nombre, Escudo escudo){
        super(nombre);
        this.escudo=escudo;
    }
    public Planta (String nombre, int vida){
        this(nombre, vida);
        Escudo nivel = Escudo.NULO;
    }
    public Planta(String nombre){
        this(nombre, 3);
        Escudo nivel = escudo.NULO;
    }

    //metodo
    public Escudo escudo(){
        return escudo;
    }
    //segundo metodo
    public String toString(){
		return nombre + "\t" + vida + "\t" + escudo; 
	}
    public void decVida(){
        
    }
    public void decVida(int es ){
        if(escudo = A){
        }
    }
    public void addVida(){

    }
    
}
