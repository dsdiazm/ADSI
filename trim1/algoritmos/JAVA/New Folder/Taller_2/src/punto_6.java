
import javax.swing.JOptionPane;


public class punto_6 {

    
    public static void main(String[] args) {
        
    int numero;
      
        
        
                
        numero=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO"));      
                
         
        if (numero%3==0){
            JOptionPane.showMessageDialog(null,"EL NUMERO ES DIVISIBLE POR 3 ");
             }
        else {
        JOptionPane.showMessageDialog(null,"EL NUMERO NO ES DIVISIBLE POR 3 ");
        }
     
        
        
 
        
    }
    
}

