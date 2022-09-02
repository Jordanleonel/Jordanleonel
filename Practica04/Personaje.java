    public class Personaje {
    private String nombre;
    private int edad;
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    public Personaje(int ed){
        edad = 0;
    }
    public String getNombre(){
        return nombre;   
    }
    
    public void saludar(){
        System.out.println("Hola Alumno de POO "+ nombre);
        
    }
    public int setEdad(int edad) {
        return this.edad = edad;
    }
    public booolean setEdad(int edad) {
        if(edad)
        
    }
}
}
