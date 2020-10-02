import java.util.Scanner;

public class TALLER_5 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        double base, altura, area;
        
                
        System.out.println("Ingrese la base");
        base=teclado.nextDouble();
        System.out.println("Ingrese la altura");
        altura=teclado.nextDouble();
                                
        area=(double) ((base*altura)/2);
        
        System.out.println("EL AREA DEL TRIANGULO ES DE "+area+" cms2.");
        
        
   }
    
}
