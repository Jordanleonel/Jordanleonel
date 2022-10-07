package personajes.buenos;
import personajes.Personaje;

public class Planta extends Personaje {
    private static final char A = 0;
    char escudo;
    //constructores
    public Planta (String nombre, int vida, char escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta (String nombre, char escudo){
        super(nombre);
        vida = 3;
        this.escudo = escudo;
    }
    public Planta (String nombre, int vida){
        super(nombre, vida){
            char A;
            escudo = A;
        }
    }
    public Planta(String nombre){
    super(nombre, vida);
    escudo= A;
    vida = 3;
    }

    //metodo
    public char escudo(){
        return escudo;
    }
    //segundo metodo
    public String getDetalle(){
		return nombre + "\t" + vida + "\t" + escudo; 
	}
    
}
