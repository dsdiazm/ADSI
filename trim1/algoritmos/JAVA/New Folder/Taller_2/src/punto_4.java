import javax.swing.JOptionPane;


public class punto_4 {

    
     public static void main(String[] args) {
    
                 
        
        int preciou;
        double peso;
        
        
                
        peso=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PESO DE LAS MANZANAS"));      
        preciou = Integer.parseInt(JOptionPane.showInputDialog("INGRESE PRECIO POR KILO"));
        
         
        if (peso >=0.00 && peso<2.00){
            JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+(preciou*peso));
             }
     
        if (peso >=2.01 && peso<5.00){
            JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+(preciou*peso*0.90));
             }
        
        if (peso >=5.01 && peso<=10.00){
            JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+(preciou*peso*0.85));
             }
        
        if (peso >10.01){
            JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+(preciou*peso*0.80));
             }
        
        
}
}
