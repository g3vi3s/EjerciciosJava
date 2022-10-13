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
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        int opt = 0, l1 = 0, l2 = 0, l3 = 0;
        String mayor = "";
        Scanner entrada = new Scanner(System.in);
        addLados lado = new addLados();
        do{
            System.out.println("Dame una opcion: \n1.- Agregar la logitud de los lados\n2.- ¿Cual de los lados es mayor? \n3.- Salir.");
            opt=entrada.nextInt();
            switch (opt) {
                case 1:
                    l1 = lado.addlado();
                    System.out.println("El primer lado es: "+l1);
                    l2 = lado.addlado();
                    System.out.println("El segundo lado es: "+l2);
                    l3 = lado.addlado();
                    System.out.println("El tercer lado es: "+l3);
                    break;
                case 2:
                    if(l1!=0){
                        mayor = lado.ladomayor(l1, l2, l3);
                        System.out.println(mayor);
                    }
                    else{
                        System.out.println("¡AVISO! Para realizar esta opcion primero debe de ingresar los valores de los lados del triangulo");
                    }   break;
                case 3:
                    System.out.println("GRACIAS POR USAR ESTE MINI PROGRAMA");
                    break;
                default:
                    System.out.println("ERROR DAME UNA OPCION VALIDA");
                    break;
            }
            
        }while(opt!=3);
    }
}
