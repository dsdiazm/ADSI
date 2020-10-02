import java.util.Scanner;

public class TALLER_7 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        int num1;
        double cuadrado;
        
        System.out.println("Ingrese el numero");
        num1=teclado.nextInt();
                
        cuadrado=(double) (Math.sqrt(num1));
        
        System.out.println("EL CUADRADO DE "+num1+ " ES "+cuadrado);
        
        
   }
    
}