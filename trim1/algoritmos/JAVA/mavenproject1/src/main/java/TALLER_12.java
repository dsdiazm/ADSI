import java.util.Scanner;

public class TALLER_12 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        double varilla, utilidad, euros, n_varillas;
        
        System.out.println("Ingrese el monto invertido");
        euros=teclado.nextDouble();
        
                
        varilla=(double) 6*2;
        n_varillas=(double) euros/varilla;
        utilidad=(double) euros*0.15;
              
          
        System.out.println("PARA EL MONTO DE "+euros+" euros  SE PODRAN CONSTRUIR "+n_varillas+" VARILLAS");
        System.out.println("LA UTILIDAD ES DE "+utilidad+" euros");
        
        
   }
    
}

