package personajes.malos;

import personajes.Personaje;

public class Zombie extends Personaje {
    protected static boolean ataque;
    //constructores
    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre, vida);
        this.ataque = ataque;
    }
    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre, 3, ataque);
    }
    public boolean Ataque(){
        return ataque;
    }
    
}
