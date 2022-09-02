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
    //constructor 
    public  Personaje(String nombre){
        this.edad = 0;
        this.nombre =nombre;
    }
    //primer metodo
    public int getEdad(){
        return this.edad;
    }
    //segundo metodo
    public boolean setEdad(int edad){
        if(edad>0 && edad<120){
            this.edad = edad;
            return true;
        }else{
            return false;
        }

    }
}
