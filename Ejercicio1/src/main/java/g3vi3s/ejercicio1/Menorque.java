/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g3vi3s.ejercicio1;
public class Menorque {
    public int menor(int n1, int n2, int n3){
        int [] numeros = new int[3];
        numeros[0]= n1;
        numeros[1]= n2;
        numeros[2]= n3;
        int res = 0;
        for(int i=0; i<2; i++){
            if(numeros[i]<numeros[i+1]){
                res=numeros[i];
                numeros[i]=numeros[i+1];
                numeros[i+1]=res; 
            }
            else{
                res=numeros[i+1];
            }
        }
        return res;
    }
}
