package mx.desasof.www.casas;

public class Casa {
    String tipo;
    int hab;
    float costo;
    public Casa(String tipo, int hab, float costo){
        this.tipo= tipo;
        this.hab=hab;
        this.costo=costo;
    }
    public Casa(String tipo){
        this(tipo, 2, 2000000f);
        
    }
    public int hascode(){
        return (tipo.hashCode()*hab)*((int)(costo));
    }
    public boolean equals(Object o){
		if ((tipo.equals(tipo)) && (costo== costo)){
            return true;
        }
        return false;
	}
    public String toString(){
        return tipo + "\t" + hab + "\t" + "\t" + costo;
    }
}
