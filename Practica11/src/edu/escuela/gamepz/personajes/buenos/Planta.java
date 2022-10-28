package personajes.buenos;
import personajes.Personaje;
import utils.Escudo;

public class Planta extends Personaje { 
    private Escudo escudo;
    //constructores
    public Planta (String nombre, int vida, Escudo escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta (String nombre, Escudo escudo){
        this(nombre, escudo);
    }
    public Planta (String nombre, int vida){
        this(nombre, vida);
        int nivel = escudo.NULO;
    }
    public Planta(String nombre){
        this(nombre, 3);
        int nivel = escudo.NULO;
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
        if(escudo == A){
            super.decVida*2;
        }
    }
    public void decVida(int es ){
        if(escudo = A){
        }
    }
    public void addVida(){

    }
    public void addVida(int){

    }
}
