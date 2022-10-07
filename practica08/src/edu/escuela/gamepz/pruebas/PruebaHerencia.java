package pruebas;

import personajes.Personaje;
import personajes.buenos.Planta;

public class PruebaHerencia {
    public static void main(String[] args) {
        Personaje per01 = new Personaje(David, 100," "," ");
        Personaje per02 = new Personaje(Bianca," "," "," ");
        Planta plan01 = new Planta(Fabian, 10, 'B', " ");
        Planta plan02 = new Planta(Almendra, 50," "," ");
    }
    
}
