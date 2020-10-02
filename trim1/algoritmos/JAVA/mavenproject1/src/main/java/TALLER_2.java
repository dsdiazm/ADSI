import java.util.Scanner;

public class TALLER_2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        int num1;
        double raiz;
        
        System.out.println("Ingrese el numero");
        num1=teclado.nextInt();
                
        raiz=(double) (Math.sqrt(num1));
        
        System.out.println("LA RAIZ CUADRADA DE "+num1+ " ES "+raiz);
        
        
   }
    
}