/*
    1.- Desarrollar una clase que permita ingresar tres valores por teclado. Luego mostrar el mayor y el menor. La clase
    debe de tener los siguientes métodos o funciones:
        • Inicializar
        • CalcularMayor
        • CalcularMenor
    En la función del main se debe de declarar un objeto que va a ejecutar las tres funciones de la clase.
*/
package g3vi3s.ejercicio1;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main(String[] args) {
        int opt = 0;
        Scanner entrada = new Scanner(System.in);
        int [] arrayNumeros = new int [3];
        int posicion=0, n1=0, n2=0, n3=0, num_mayor, num_menor;
        for(int i=0; i<2; i++){
            System.out.println("Dame una opcion:\n1.- Ingresar valores.\n2.- Calcular cual es mayor\n3.- Calcular cual es menor.\n4.- Salir del programa.");
            opt = entrada.nextInt();
            switch(opt){
                case 1:
                    // Aqui creas el objeto.
                    numeros agregar = new numeros();
                    String arreg = "";
                    
                    // Mandas llamar la clase numeros para agregar cada uno de los numeros
                    for(int j=0;j<3;j++){
                        arrayNumeros[j]=agregar.AgregarNumeros();
                    }
                    System.out.println("Los numeros agregados son: ");
                    for(int j=0;j<3;j++){
                        System.out.print(arrayNumeros[j]+", ");
                        arreg = arreg + arrayNumeros[j]+", ";
                    }
                    System.out.println();
                    JOptionPane.showMessageDialog(null, "Los numeros agregados son: "+arreg);
                    i=0;
                    break;
                case 2:
                    for(int j:arrayNumeros){
                        if(posicion==0){
                            n1 = arrayNumeros[posicion];
                        }
                        if(posicion==1){
                            n2 = arrayNumeros[posicion];
                        }
                        if(posicion==2){
                            n3 = arrayNumeros[posicion];
                        }
                        posicion++;
                    }
                    
                    Mayorque comp = new Mayorque();
                    num_mayor = comp.mayor(n1, n2, n3);
                    JOptionPane.showMessageDialog(null,"El numero mayor es: "+num_mayor);
                    System.out.println("El numero mayor es: "+num_mayor);
                    i=0;
                    break;
                case 3:
                    for(int j:arrayNumeros){
                        if(posicion==0){
                            n1 = arrayNumeros[posicion];
                        }
                        if(posicion==1){
                            n2 = arrayNumeros[posicion];
                        }
                        if(posicion==2){
                            n3 = arrayNumeros[posicion];
                        }
                        posicion++;
                    }
                    Menorque comp2 = new Menorque();
                    num_menor = comp2.menor(n1, n2, n3);
                    JOptionPane.showMessageDialog(null,"El numero menor es: "+num_menor);
                    System.out.println("El numero mayor es: "+num_menor);
                    i=0;
                    break;
                case 4:
                    System.out.println("** GRACIAS POR USAR EL PROGRAMA **");
                    i=2;
                    break;
            }
        }
    }
}
