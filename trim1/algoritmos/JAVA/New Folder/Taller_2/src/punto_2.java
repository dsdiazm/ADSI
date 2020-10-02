import javax.swing.JOptionPane;

public class punto_2 {

    
     public static void main(String[] args) {
    
         JOptionPane.showMessageDialog(null,"BIENVENIDOS A CALCULADORA DE PRECIO");
        
        
        int precio1,precio2, precio3,n_llanta;
        precio1=200;
        precio2=250;
        precio3=300;
             
        
        
        n_llanta=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE LLANTAS"));      
        
        
         
        if (n_llanta >=1 && n_llanta<5)
             {JOptionPane.showMessageDialog(null,"EL PRECIO POR LLANTA ES DE 300");
              JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+precio3*n_llanta);
             }
        
        if (n_llanta >=5 && n_llanta<=10)
             {JOptionPane.showMessageDialog(null,"EL PRECIO POR LLANTA ES DE 250");
              JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+precio2*n_llanta);
             }      
         if (n_llanta >10)
             {JOptionPane.showMessageDialog(null,"EL PRECIO POR LLANTA ES DE 200");
              JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+precio1*n_llanta);
             }                 
        
        
                    
        }
    
}
