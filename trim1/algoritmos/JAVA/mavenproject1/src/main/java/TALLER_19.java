import java.util.Scanner;

public class TALLER_19 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int soc1, soc2, soc3, totalsoc;
        double  psoc1, psoc2, psoc3;
        
                
        System.out.println("Ingrese la cantidad invertida por el primer socio");
        soc1=teclado.nextInt();
        System.out.println("Ingrese la cantidad invertida por el segundo socio");
        soc2=teclado.nextInt();
        System.out.println("Ingrese la cantidad invertida por el tercer socio");
        soc3=teclado.nextInt();
        
        totalsoc=(int) soc1+soc2+soc3;
        psoc1=(double) soc1/totalsoc*100;
        psoc2=(double) soc2/totalsoc*100;
        psoc3=(double) soc3/totalsoc*100;
       
                      
        System.out.println("EL PORCENTAJE INVERTIDO POR EL PRIMER SOCIO ES DE "+psoc1+"%");
        System.out.println("EL PORCENTAJE INVERTIDO POR EL SEGUNDO SOCIO ES DE "+psoc2+"%");
        System.out.println("EL PORCENTAJE INVERTIDO POR EL TERCER SOCIO ES DE "+psoc3+"%");
   }
    
}

