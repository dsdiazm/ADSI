import java.util.Scanner;

public class TALLER_22 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int A, B;
      
        
                
        System.out.println("Ingrese valor de A");
        A=teclado.nextInt();
        System.out.println("Ingrese valor de B");
        B=teclado.nextInt();
        
        
        B=(int) A-B;
        A=(int) A-B;
        B=(int) A+B;
               
                      
        System.out.println("A ES  "+A);
        System.out.println("B ES "+B);
       
   }
    
}
