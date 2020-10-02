import java.util.Scanner;

public class TALLER_15 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
      
        
        double F, C;
        
                       
        System.out.println("Ingrese la temperatura en celcius C°");
        C=teclado.nextDouble();     
       
        F=(double) (((C*9)/5)+32);
        
             
        System.out.println("La temperatura en grados Fahrenheit "+F);
       
        
   }
    
}