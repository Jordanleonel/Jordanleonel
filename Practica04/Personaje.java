    public class Personaje {
    private String nombre;
    private int edad;
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    //constructor de la clase 
    public Personaje(String nombre){
        edad = 0;
    }
    public String getNombre(){
        return nombre;   
    }
    
    public void saludar(){
        System.out.println("Hola Alumno de POO "+ nombre);
        
    }
    public int setEdad(int ed) {
        return this.ed = ed;
    }
    // condicional de edad 
    public boolean setEdad(Edad){
        if(edad>0 & edad<120){
            return true;
        }else{
            return false;
        }
        
    }
}
