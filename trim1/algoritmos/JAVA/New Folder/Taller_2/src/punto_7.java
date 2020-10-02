import javax.swing.*;
public class punto_7 {
                                
    

  
    public static void main(String[] args) {
        
        
       
        int numb2=1;
        
        while (((numb2%2==0)&&(!(numb2%5==0))&&(numb2>100)&&(numb2<10000))==false){
            numb2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
            
            if (((numb2%2==0)&&(!(numb2%5==0))&&((numb2>100))&&(numb2<10000))==false){
                JOptionPane.showMessageDialog(null,"NUMERO NO CUMPLE CON LOS CRITERIOS");
                
            }
        
        }
       JOptionPane.showMessageDialog(null,"NUMERO CUMPLE CON LOS CRITERIOS"); 
    }
}