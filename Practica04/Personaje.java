    public class Personaje {
    private String nombre;
    private int edad;
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;   
    }
    
    public void saludar(){
        System.out.println("Hola Alumno de POO "+ nombre);
        
    }
}
