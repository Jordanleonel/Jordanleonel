package mx.desasof.www.pruebas;
import mx.desasof.www.casas.*;

public class PruebaCasa {
    public static void main(String[] args) {
        int i = 0;
        int[] casas = new int[8];
        casas[0]= new Casa("Estandar", 3, 3000000);
        casas[1]= new Campo("Cazador", 3.5f, 10f);
        casas[2]= new Urbana("Residencia", 3, 2500000, 2);
        casas[3]= new Casa("Estandar", 3, 3000000);
        casas[4]= new Campo("Cazador", 3.5f, 10);
        casas[5]= new Urbana("Residencia", 3, 2500000, 2);
        casas[6]= new Casa("Estandar");
        casas[7]= new Campo("Cazador", 4, 15000, 3f, 5f);
        casas[8]= new Urbana("Residencia", 5);
        while(i< casas.length){
            for (Casa j : casas) {
                
            }//for
        }//while
    }
    
}
