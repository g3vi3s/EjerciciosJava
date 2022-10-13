/*
2.- Desarrollar un programa que permita ingresar los lados de un triángulo e implemente los siguientes métodos:
• Inicializar los atributos
• Imprimir el valor del lado mayor
• Un método para mostrar un mensaje si es equilátero o no.
En la función del main se debe de declarar un objeto que va a ejecutar las tres funciones de la clase.
*/
package com.g3vi3s.ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        int opt = 0;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.print("Dame una opcion: \n1.- Agregar la logitud de los lados\n2.- Cual de los lados es mayor? \n3.- Es equilatero?\n4.-Salir");
            opt=entrada.nextInt();
            
            if(opt == 1){
                
            }
            else if(opt == 2){
            
            }
            else if(opt == 3){
                
            }
            else{
                System.out.println("GRACIAS POR USAR ESTE MINI PROGRAMA");
            }
            
        }while(opt!=4);
    }
}
