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
    public int hashcode(){
        return (tipo.hashCode()*hab)*(int)(costo);
    }
    public boolean equals(Object o){
		if (o != null && o instanceof Casa) {
			Casa cas = (Casa) o;

			if (tipo.equals(cas.tipo) && (costo == cas.costo)) {
				return true;
			}
		}
		return false;
	}
    public String toString(){
        return tipo + "\t" + hab + "\t" + "\t" + costo;
    }
}
