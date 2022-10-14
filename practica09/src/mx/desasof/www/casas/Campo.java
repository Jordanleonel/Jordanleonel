package mx.desasof.www.casas;

public class Campo extends Casa {
    //arreglo

     float[] piscina = new float[1];    
    //constructor
    public Campo(String tipo, int hab, float costo){
       super(tipo, hab, costo);
       
       
    }
    public Campo(String tipo, float ancho,float largo) {
        super(tipo);
        piscina[0]= ancho;
        piscina[1]= largo;
       
    }
    
    //hashcode
    public int hashcode(){
        return (tipo.hashCode()*(int)(piscina[1]));
    }
    //equals
    public boolean equals(Object ob){
        return super.equals(ob) && ob instanceof Campo;
    }
    public String toString(){
        return tipo + "\t" + hab + "\t" + "\t" + costo;
    }
    
}

