import java.util.Scanner;

public class TALLER_13 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
      
        
        double salario, deduccion, bonificacion, salario_final;
        
                       
        System.out.println("Ingrese el salario total");
        salario=teclado.nextDouble();     
       
        deduccion=(double) (salario*0.02);
        bonificacion=(double) (salario*0.10);
        salario_final=(double) (salario-(deduccion+bonificacion));
             
        System.out.println("EL SALARIO FINAL ES DE "+salario_final);
       
        
   }
    
}