/*
3.- Desarrollar una clase llamada Alumno y definir como atributos su nombre, edad y calificación. Deberá de tener
dos constructores, el primero deberá de inicializar el nombre del alumno y el segundo constructor deberá de
inicializar todos los atributos de la clase. Definir los siguientes métodos:
    • Imprimir los datos ingresados
    • Imprimir un mensaje si es mayor o no de edad (edad >=18)
    • Mandara un mensaje dependiendo de su promedio:
        o Si el promedio es menor a 8 mandar un mensaje de Reprobado.
        o Si el promedio es mayor a 8 pero menor a 10 un mensaje de Aprobado.
        o Si el promedio es igual a 10 un menaje de Excelente.
    • Inicializar la edad y la calificación.
En la función del main se debe de declarar dos objetos, el primer objeto debe de utilizar el primer constructor y el
segundo objeto debe de utilizar el segundo constructor. Estos objetos debe de ejecutar las siguientes funciones:
Imprimir los datos ingresados, Imprimir un mensaje si es mayor o no de edad y Mandar un mensaje dependiendo del
promedio.
*/

package g3vi3s.ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Variables a utilizar en la clase main
        int edad, calif;
        String nombre;
        
        // instanciacion la clase alumno utilizando el primer constructor
        Alumno alu = new Alumno();
        nombre=alu.getNombre();
        System.out.println("Bienvenido "+nombre);
        
        // instanciacion la clase alumno utilizando el segundo constructor
        Alumno EdadCalif = new Alumno(31, 10);
        
        edad= EdadCalif.getEdad();
        calif = EdadCalif.getCalificacion();
        
        // Comparamos si es mayor de edad o no
        if(edad >=18){
            System.out.println(nombre + " tiene "+ edad + " años por lo tanto es mayor de edad");
        }
        else{
            System.out.println(nombre + " tiene "+ edad + " años por lo tanto es menor de edad");
        }
        
        // Comparamos la calificacion para saber si esta aprobado o reprobado 
        if(calif >= 8 && calif <=10){
            System.out.println("El alumno " + nombre + " Esta Aprobado");
        }
        else if(calif < 8){
            System.out.println("El alumno " + nombre + " Esta Reprobado");
        }
        else{
            System.out.println("ERROR Calificacion no aceptada");
        }
    }
}
