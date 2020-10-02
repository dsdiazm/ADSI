import java.util.Scanner;

public class TALLER_20 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int segt, mint, hort, horas, min, seg, segt2, segt3;
      
        
                
        System.out.println("Ingrese la cantidad de horas");
        horas=teclado.nextInt();
        System.out.println("Ingrese la cantidad de minutos");
        min=teclado.nextInt();
        System.out.println("Ingrese la cantidad de segundos");
        seg=teclado.nextInt();
        
        segt=(int) (horas*3600)+(min*60)+seg;
        hort=(int) segt/3600;
        segt2=(int) segt-(hort*3600);
        mint=(int) segt2/60;
        segt3=(int) segt2-1*60;
       
                      
        System.out.println("EL NUMERO DE HORAS ES "+hort);
        System.out.println("EL NUMERO DE MINUTOS ES "+mint);
        System.out.println("EL NUMERO DE SEGUNDOES ES "+segt3);
   }
    
}

