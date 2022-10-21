package g3vi3s.ejercicio3;

public class Alumno {
   private String nombre;
   private int edad;
   private int calificacion;
    public Alumno(){
        setNombre();
    }
    
    public Alumno(int edad, int calificacion){
        setedad(edad);
        setcalificacion(calificacion);
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(){
        nombre = "Gerardo Villicaña Espinoza";
    }
    
    public void setedad(int edad){
        this.edad = edad;
    }
    
    public void setcalificacion(int calificacion){
        this.calificacion = calificacion;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getCalificacion(){
        return calificacion;
    }
    
}
