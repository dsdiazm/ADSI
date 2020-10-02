import java.util.Scanner;

public class TALLER_11 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
      
        
        int lunes, miercoles, viernes, prom;
        
                       
        System.out.println("ingresa los minutos de recorrido dia LUNES");
        lunes=teclado.nextInt();
        System.out.println("ingresa los minutos de recorrido dia MIERCOLES");
        miercoles=teclado.nextInt();
        System.out.println("ingresa los minutos de recorrido dia VIERNES");
        viernes=teclado.nextInt();    
        
       
        prom=(int) ((lunes+miercoles+viernes)/3);
             
        System.out.println("EL PROMEDIO DE TIEMPO ENTRE LOS TRES RECORRIDOS ES DE "+prom+" MINUTOS");
       
        
   }
    
}

