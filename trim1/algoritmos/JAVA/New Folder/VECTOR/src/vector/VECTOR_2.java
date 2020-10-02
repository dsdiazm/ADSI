
package vector;

import java.util.Scanner;

public class VECTOR_2 {
   
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);

        String[] nombre=new String[5];


for (int i=0; i < nombre.length; i++){
    System.out.println("ingrese nombre:");
    nombre[i]=leer.next();
        }
      System.out.println("***********");
      System.out.println("lista de los nombres"); 
      for (int i=0; i < nombre.length; i++){
        System.out.println(nombre[i]+"En la posicion "+i);
        
        }
    }
    
}
