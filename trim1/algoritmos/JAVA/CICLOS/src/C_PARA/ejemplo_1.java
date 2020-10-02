/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_PARA;

import java.util.Scanner;


public class ejemplo_1 {

      public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i,num,contador=0;
        double acumulador=0, promedio;
        
        for(i=1;i<=5;i++){
            System.out.println("ingrese un numero: ");
            num=teclado.nextInt();
            acumulador=acumulador+num;
            if(num>500){
                contador=contador+1;
            }
        }
        promedio=acumulador/5;
        System.out.println("El rpomedio es: "+promedio);
        System.out.println("Numero mayor de 500 son: "+contador);
    }
    
}
