
package vector;

import java.util.Scanner;

public class Vector_3 {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int n;
       double acumuladorSuma = 0;
       System.out.println("Ingrese la longitud de los vectores");
       n=leer.nextInt();
       
       int numero[]=new int[n];
       
       for (int i =0; i < numero.length; i++){
           System.out.println("ingrese el numero");
           numero [i]=leer.nextInt();
       }
            System.out.println("***********");
            System.out.println("Lista de numeros");
            for (int i=0; i <numero.length; i++){
                System.out.println(numero[i]);
            }
        System.out.println("******************");
        System.out.println("lista de multiplos de 3");
        for (int i = 0; i < numero.length; i++){
            if(numero[i]%3==0){
                System.out.println(numero[1]);}        
        }
         
        System.out.println("******************");
        System.out.println("Suma de numeros mayores de 10");
        for (int i = 0; i < numero.length; i++){
            if(numero[i]>10){
                acumuladorSuma=acumuladorSuma+numero[i];
                }       
        }
        System.out.println(acumuladorSuma);
    }
}
