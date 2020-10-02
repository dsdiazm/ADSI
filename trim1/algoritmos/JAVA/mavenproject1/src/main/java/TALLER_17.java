import java.util.Scanner;

public class TALLER_17 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        Double met, cen;
        
                
        System.out.println("Ingrese el nombre la medida en metros");
        met=teclado.nextDouble();
                
        cen=(double) (met*100);
        
             
        System.out.println("LA MEDIDA TIENE "+cen+" CENTIMETROS ");
               
   }
    
}