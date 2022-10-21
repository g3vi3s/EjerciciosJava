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
        
        Alumno alu = new Alumno();
        
        Alumno EdadCalif = new Alumno(30, 7);
        
        
        System.out.println("Bienvenido "+alu.getNombre());
        
    }
}
