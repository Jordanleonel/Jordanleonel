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
        this(2,2000000f);
        habitacion= 2;
        costo= 2000000;
    }
    public int hascode(){
        return (tipo.hashCode()*hab)*(int)(costo);
    }
    
}
