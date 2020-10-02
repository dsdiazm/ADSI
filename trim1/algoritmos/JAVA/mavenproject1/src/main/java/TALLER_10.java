import java.util.Scanner;

public class TALLER_10 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int costotal, costo, ganancia, impuesto;      
        
        
       
        System.out.println("Ingrese el valor comercial del vehiculo");
        costo=teclado.nextInt();
           
        
        ganancia=(int) (costo*0.12); 
        impuesto=(int) (costo*0.06);
        costotal=(int) (costo-(impuesto+ganancia));
        
      
             
        System.out.println("EL VALOR TOTAL DEL VEHICULO ES DE "+costotal);
        System.out.println("EL IMPUESTO DEL VEHICULO ES DE "+impuesto);
        System.out.println("LA GANANCIA GENERADA POR EL VEHICULO ES DE "+ganancia);
        
   }
    
}
