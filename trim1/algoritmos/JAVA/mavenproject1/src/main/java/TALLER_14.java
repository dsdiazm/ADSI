import java.util.Scanner;

public class TALLER_14 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        String art1, art2, art3;
        int cant1, cant2, cant3, pric1, pric2, pric3, total, tot1, tot2, tot3;            
        
                
        System.out.println("Ingrese el primer articulo");
        art1=teclado.next();
        System.out.println("Ingrese su cantidad");
        cant1=teclado.nextInt();
        System.out.println("ingresa su valor por unidad");
        pric1=teclado.nextInt();
        
        System.out.println("Ingrese el segundo articulo");
        art2=teclado.next();
        System.out.println("Ingrese su cantidad");
        cant2=teclado.nextInt();
        System.out.println("ingresa su valor por unidad");
        pric2=teclado.nextInt();
        
        System.out.println("Ingrese el tercer articulo");
        art3=teclado.next();
        System.out.println("Ingrese su cantidad");
        cant3=teclado.nextInt();
        System.out.println("ingresa su valor por unidad");
        pric3=teclado.nextInt();
        
        tot1=(int) (cant1*pric1);
        tot2=(int) (cant2*pric2);
        tot3=(int) (cant3*pric3);
        
        total= (int)(tot1+tot2+tot3);
        
        System.out.println(" ARTICULO       CANT.    PRECIO UNIT    PRECIO TOTAL ");
        System.out.println( "  "+art1+"            "+cant1+"        "+pric1+"         "+tot1);
        System.out.println( "  "+art2+"            "+cant2+"        "+pric2+"         "+tot2);
        System.out.println( "  "+art3+"            "+cant3+"        "+pric3+"         "+tot3);
        System.out.println( "                                        TOTAL= "+total);
   }
    
}
