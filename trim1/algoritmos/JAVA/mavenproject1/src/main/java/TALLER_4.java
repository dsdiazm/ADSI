import java.util.Scanner;

public class TALLER_4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        String nombre;
        double horas, pago_hora, salario;
        
        System.out.println("Ingrese nombre completo del empleado");
        nombre=teclado.next();          
        System.out.println("Ingrese numero de horas");
        horas=teclado.nextDouble();
        System.out.println("Ingrese el valor de la hora");
        pago_hora=teclado.nextDouble();
                                
        salario=(double) (horas*pago_hora);
        
        System.out.println("EL SALARIO PARA EL SEÑOR "+nombre+" ES DE "+salario+" PESOS");
        
        
   }
    
}
