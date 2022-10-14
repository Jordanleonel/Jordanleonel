package mx.desasof.www.casas;

public class Urbana extends Casa {
    int bannos;
    public Urbana(String tipo, int hab, float costo,int bannos){
        super(tipo, hab, costo);
        this.bannos= bannos;
    }
    public Urbana(String tipo){
        super(tipo);
        this.bannos= bannos;
    }
    public int hascode(){
        return (((getTipo.hascode)*bannos)*23);

    }
}
