import java.util.Scanner;

public class TALLER_3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        double not1, not2, not3, prom;
                
        System.out.println("Ingrese la primera nota");
        not1=teclado.nextDouble();
        System.out.println("Ingrese la segunda nota");
        not2=teclado.nextDouble();
        System.out.println("Ingrese la tercera nota");
        not3=teclado.nextDouble();
                        
        prom=(double) ((not1+not2+not3)/3);
        
        System.out.println("EL PROMEDIO DE LA NOTA ES  "+prom);
        
        
   }
    
}