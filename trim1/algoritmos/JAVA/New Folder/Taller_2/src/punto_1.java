import javax.swing.JOptionPane;

public class punto_1 {

    
    public static void main(String[] args) {
                
        
        String bol;
        int precio;
        
        precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio de la prenda"));      
        bol=JOptionPane.showInputDialog("Ingrese el color de la bola"); 
        
         
        if (bol.equals ("blanca"))
             {precio=(int)(precio*1);             
             }
        if (bol.equals ("blanca"))
             {JOptionPane.showMessageDialog(null,"NO TIENES DESCUENTO");          
        }
        
        
        if (bol.equals ("verde"))
             {precio=(int)(precio*0.9);        
        }
        if (bol.equals ("verde"))
             {JOptionPane.showMessageDialog(null,"TIENES UN DESCUENTO DEL 10%");          
        }
        
        
        if (bol.equals ("amarilla"))
             {precio=(int)(precio*0.75);        
             }
        if (bol.equals ("amarilla"))
             {JOptionPane.showMessageDialog(null,"TIENES UN DESCUENTO DEL 25%");
             }
        
        if (bol.equals ("azul"))
             {precio=(int)(precio*0.5);        
        }
        if (bol.equals ("azul"))
             {JOptionPane.showMessageDialog(null,"TIENES UN DESCUENTO DEL 50%");
             }
        
        
        if (bol.equals ("roja"))
             {precio=(int)(precio*0);        
        }
        if (bol.equals ("roja"))
             {JOptionPane.showMessageDialog(null,"TIENES UN DESCUENTO DEL 100%");
              JOptionPane.showMessageDialog(null,"!!!!FELICITACIONES!!!!!");
             }
             
             
        
        
        
        
        JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+precio);
                    
        }
    
}

