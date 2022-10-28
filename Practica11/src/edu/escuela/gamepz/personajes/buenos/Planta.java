package personajes.buenos;
import javax.xml.transform.Templates;

import personajes.Personaje;

public class Planta extends Personaje { 
    char escudo;
    //constructores
    public Planta (String nombre, int vida, char escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta (String nombre, char escudo){
        this(nombre, vida, escudo);
    }
    public Planta (String nombre, int vida){
        this(nombre, vida, 'A');
    }
    public Planta(String nombre){
        this(nombre, 3, 'A');
    }

    //metodo
    public char escudo(){
        return escudo;
    }
    //segundo metodo
    public String getDetalle(){
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
