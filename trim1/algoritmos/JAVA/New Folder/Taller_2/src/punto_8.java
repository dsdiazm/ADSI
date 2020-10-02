import javax.swing.*;

public class punto_8 {
                                
    

  
    public static void main(String[] args) {
        
        
       
        int num = 0, acumulador=0, suma=0;
        float promedio;
        boolean sw=true;
        
        
        while (sw){
             num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
                                     
            sw=((num>0)&&(!(num%6==0)));
            suma+=num;
            acumulador++;
            
            if (num>0){
                JOptionPane.showMessageDialog(null,"El numero "+num+" es positivo");
             
        }          
    }
        promedio=(float)suma/acumulador;
        
        JOptionPane.showMessageDialog(null,"El numero "+num+" es multiplo de 6");
        JOptionPane.showMessageDialog(null,"El promedio es "+promedio);
        
        
        
    }
}