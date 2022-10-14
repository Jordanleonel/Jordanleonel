package mx.desasof.www.casas;

public class Urbana extends Campo {
    int bannos;
    public Urbana(String tipo, int hab, float costo,int bannos){
        super(tipo, hab, costo);
        this.bannos= bannos;
    }
    public Urbana(String tipo){
        super(tipo);

    }
    public int hashcode(){
        return (tipo.hashCode()*hab)*(int)(costo)*(bannos)*(23);

    }
}
