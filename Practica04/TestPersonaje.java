public class TestPersonaje{
    public static void main(String[]args){
        Personaje alumno = new Personaje("Kal El");
        alumno.saludar();
        S.o.println("Nombre:"+alumno.getNombre()+"Edad:"+alumno.getEdad());
        S.o.println("Modificando el nombre" +alumno.getNombre());
        alumno.SetNombre("Michael Jordan");
        alumno.saludar();
        if(!alumno.setEdad(30)){
            S.o.println("Edad sin cambios "); 
        }
        S.o.println("Nombre:"+alumno.getNombre()+"Edad:"+alumno.getEdad());
        S.o.println("Modificado edad en 130");
        if(!alumno.setEdad(130)){
            S.o.println("Edad sin cambio ");
        }
        S.o.println("Nombre:"+alumno.getNombre()+"Edad:"+alumno.getEdad());
    }
}
