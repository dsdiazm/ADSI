

package C_MIENTRAS;

import java.util.Scanner;


public class FLAGS {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String sw;
       int edad, contadorMayores=0, contadortotal=0;
       double promedio, suma, acumuladorMayores=0;
       
       System.out.println("Desea ingresar registros SI/NO");
       sw=teclado.next();
       while(sw.equals("SI")){
           System.out.println("ingrese la edad");
           edad=teclado.nextInt();
           contadortotal=contadortotal+1;
           if(edad>=18){
               contadorMayores=contadorMayores+1;
               acumuladorMayores=acumuladorMayores+edad;
           }
           
           System.out.println("Desea ingresar registro SI/NO");
           sw=teclado.next();
           
           
           promedio=acumuladorMayores/contadorMayores;
           System.out.println("Promedio de los mayores de edad "+promedio);
           System.out.println("Numero de mayores de edad "+contadorMayores);
           System.out.println("Numero total que ingresaron "+contadortotal);
       }
    }
    
}
