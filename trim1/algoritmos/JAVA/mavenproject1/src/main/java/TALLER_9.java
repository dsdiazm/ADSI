import java.util.Scanner;

public class TALLER_9 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        
        double pulg, pie, num1;
        
        System.out.println("Ingrese la altura en centimetros");
        num1=teclado.nextDouble();
                
        pulg=(double) (num1/2.54);
        pie=(double) (num1/30.48);
        
        System.out.println("LA ALTURA ES DE "+pulg+ " PULGADAS O "+pie+ " PIES");
        
        
   }
    
}