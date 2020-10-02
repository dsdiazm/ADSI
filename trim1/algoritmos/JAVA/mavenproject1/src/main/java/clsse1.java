
import java.util.Scanner;


public class clsse1 {

 
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String nombre;
       double  cuota_inicial, cuota_mensual, precio_total;
       
       System.out.println("escriba su nombre");
       nombre=teclado.next();
       System.out.println("escriba precio de la parcela");
       precio_total=teclado.nextDouble();       
       System.out.println("escriba la cuota inicial");
       cuota_inicial=teclado.nextDouble();
       cuota_mensual=(double) (((precio_total-cuota_inicial)*1.20)/24);
       System.out.println("La cuota para el señor "+nombre+ " es de "+cuota_mensual+ " PESOS");
       
       
    }
    
}
