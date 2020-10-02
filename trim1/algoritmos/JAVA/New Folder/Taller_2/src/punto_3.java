import javax.swing.JOptionPane;
public class punto_3
        
{
    public static void main(String[] args){
        
        int numero;
      
        
        
                
        numero=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO"));      
                
         
        if ((numero%2==0)&&(numero%3==0)&&(numero%5==0)){
            JOptionPane.showMessageDialog(null,"CARGO: DIRECTOR GENERAL ");
             }
        if ((!(numero%2==0))&&(numero%3==0)&&(numero%5==0)){
            JOptionPane.showMessageDialog(null,"CARGO: DIRECTIVO ");
             }
        if ((numero%2==0)&&(!(numero%3==0))&&(!(numero%5==0))){
            JOptionPane.showMessageDialog(null,"CARGO: PERSONAL ");
             }
        if ((!(numero%2==0))&&(!(numero%3==0))&&(!(numero%5==0))){
            JOptionPane.showMessageDialog(null,"CARGO: SEGURIDAD ");
             }
        
        
        
        }
}