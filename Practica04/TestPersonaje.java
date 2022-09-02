public class TestPersonaje{
    public static void main(String[]args){
        Personaje alumno = new Personaje();
        alumno.SetNombre("Kobie Bryant");
        alumno.saludar();
        System.out.println("Modificando el nombre" + alumno.getNombre());
        alumno.SetNombre("Michael Jordan");
        alumno.saludar();
    }
}
