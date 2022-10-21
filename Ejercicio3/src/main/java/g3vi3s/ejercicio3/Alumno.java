package g3vi3s.ejercicio3;

public class Alumno {
   private String nombre;
   private int edad;
   private int calificacion;
    public Alumno(){
        setNombre();
    }
    
    public Alumno(int edad, int calificacion){
        this.edad = edad;
        this.calificacion = calificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(){
        nombre = "Gerardo Villicaña Espinoza";
    }
    
}
