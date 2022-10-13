package g3vi3s.ejercicio1;
import java.util.Scanner;
public class numeros {
    public int AgregarNumeros(){
        int n1;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Dame el un numero: ");
        n1 = entrada.nextInt();
        
        return n1;
    }
}
