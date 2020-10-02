import java.util.Scanner;

public class TALLER_6 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        String empl_1, empl_2, empl_3;
        
        int sueldo_1, sueldo_2, sueldo_3, aumento_1, aumento_2, aumento_3, sufin1,sufin2, sufin3;
        
        System.out.println("Ingrese el nombre del primer empleado");
        empl_1=teclado.next();
        System.out.println("Ingrese el nombre del segundo empleado");
        empl_2=teclado.next();
        System.out.println("Ingrese el nombre del tercer empleado");
        empl_3=teclado.next();
                 
        System.out.println("Ingrese el sueldo del primer empleado");
        sueldo_1=teclado.nextInt();
        System.out.println("Ingrese el sueldo del segundo empleado");
        sueldo_2=teclado.nextInt();
        System.out.println("Ingrese el sueldo del tercer empleado");
        sueldo_3=teclado.nextInt();    
        
        aumento_1=(int) (sueldo_1*0.10);
        aumento_2=(int) (sueldo_2*0.12);
        aumento_3=(int) (sueldo_3*0.15);
        
        sufin1=(int) sueldo_1+aumento_1;
        sufin2=(int) sueldo_2+aumento_2;
        sufin3=(int) sueldo_3+aumento_3;
             
        System.out.println("EL SALARIO PARA "+empl_1+" ES DE "+sufin1+" PESOS.");
        System.out.println("EL SALARIO PARA "+empl_2+" ES DE "+sufin2+" PESOS.");
        System.out.println("EL SALARIO PARA "+empl_3+" ES DE "+sufin3+" PESOS.");
        
   }
    
}
