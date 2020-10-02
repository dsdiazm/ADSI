import java.util.Scanner;

public class TALLER_16 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        double num1, num2, num3, div;
        
        System.out.println("Ingrese el primer numero");
        num1=teclado.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2=teclado.nextDouble();
        System.out.println("Ingrese el tercero numero");
        num3=teclado.nextDouble();
        
        
        div=(double) ((num1+num2+num3)/5);
         
          
        System.out.println("LA QUINTA PARTE DE LA SUMA ES "+div);
        
        
   }
    
}

