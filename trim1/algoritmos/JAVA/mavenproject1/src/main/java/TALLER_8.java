import java.util.Scanner;

public class TALLER_8 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        double num1, num2, num3, num4, sum, prom;
                
        System.out.println("Ingrese el primer numero");
        num1=teclado.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2=teclado.nextDouble();
        System.out.println("Ingrese el tercer numero");
        num3=teclado.nextDouble();
        System.out.println("Ingrese el cuarto numero");
        num4=teclado.nextDouble();
        
        sum=(double)  (num1+num2+num3+num4);
        prom=(double) (sum/4);
        
        System.out.println("LA SUMA DE LOS CUATRO NUMEROS ES "+sum+" Y EL PROMEDIO DE LOD MISMOS ES "+prom);
        
        
   }
    
}