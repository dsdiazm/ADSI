import java.util.Scanner;

public class TALLER_21 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int A, B, AUX;
      
        
                
        System.out.println("Ingrese valor de A");
        A=teclado.nextInt();
        System.out.println("Ingrese valor de B");
        B=teclado.nextInt();
        
        
        AUX=(int) A;
        A=(int) B;
        B=(int) AUX;
               
                      
        System.out.println("A ES  "+A);
        System.out.println("B ES "+B);
       
   }
    
}

