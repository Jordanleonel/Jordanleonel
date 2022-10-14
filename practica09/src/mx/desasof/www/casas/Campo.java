package mx.desasof.www.casas;

public class Campo extends Casa {
    //arreglo
    float Piscina = new Piscina [2];
    
    //constructor
    public Campo(String tipo, int hab, float costo){
       super(tipo, hab, costo);
       
    }
    public Campo(String tipo) {
        super(tipo);
    }
    
    //hascode
    public int hascode(){
        return ((tipo.hashCode()*ancho[0])*largo[1]);
    }
    //equals
    public boolean equals(Object o){
		if (((tipo.equals(Casa)) && (costo== costo)) && tipo.equals(Campo)){
            return true;
        }
    } 
    public String toString(){
        return tipo + "\t" + hab + "\t" + "\t" + costo + "\t" + ancho[0] + largo[1];
    }
    
}

