
package vector;
import java.util.Scanner;

public class Vector_5 {
      public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n;
        double acumulador=0;
        
        System.out.println("ingrese la longitud del vector");
        n=leer.nextInt();
        
        
        int numero[]=new int [n];
        
        
        
        for(int i = 0; i < numero.length; i++){
            System.out.println("Ingresar el numero");
            numero[i]=leer.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            if(i%2==0 && i!=0){
                acumulador=acumulador+numero[i];
        }
               
    }
        System.out.println("La suma de los numeros pares"+acumulador);
  }
    
}
