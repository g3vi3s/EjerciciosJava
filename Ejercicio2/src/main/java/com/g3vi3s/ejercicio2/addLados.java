/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g3vi3s.ejercicio2;
import java.util.Scanner;
public class addLados {
    
    public int addlado(){
        int lad=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame el valor de la logintud del lado:");
        lad = entrada.nextInt();
        return lad;
    }
    public String ladomayor(int l1, int l2, int l3){
        String mensaje="";
       
        if(l1>l2 && l1>l3){
            mensaje="El lado 1 es el mayor";
        }
        if(l2>l1 && l2>l3){
            mensaje="El lado 2 es el mayor";
        }
        if(l3>l1 && l3>l2){
            mensaje="El lado 3 es mayor";
        }
        else if(l1==l2 && l2==l3){
            mensaje="Todos los lados son iguales por lo tanto es un TRIANGULO EQUILATERO";   
        }
        
        return mensaje;
    }
}
