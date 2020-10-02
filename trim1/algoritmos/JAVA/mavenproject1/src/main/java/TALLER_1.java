import java.util.Scanner;

public class TALLER_1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        int num1, num2, num3, sum;
        double div;
        
        System.out.println("Ingrese el primer numero");
        num1=teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=teclado.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3=teclado.nextInt();
        
        sum=(int) (num1+num2);
        div=(double) (sum/num3);
        
        System.out.println("LA SUMA DEL NUMERO 1 Y EL NUMERO 2 ES "+sum);
        System.out.println("EL RESULTADO DE LA DIVISION ENTRE LA SUMA DE LOS DOS NUMERO Y EL TERCER NUMERO ES "+div);
                
         

    }
    
}
