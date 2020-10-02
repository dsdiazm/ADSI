
import javax.swing.JOptionPane;


public class punto_10 {

   public static void main(String []args) {
        
        //JOptionPane.showMessageDialog(null,"ELEJISTE EL EJERCICIO 7\n"+
                                                    // "ENUNCIADO 7\n"+
                                                     //" Diseñe un algoritmo que lea números enteros hasta que encuentre uno que\n"+
                                                     //"cumpla las siguientes condiciones:\n"+
                                                     //"a. Múltiplo de 2\\n"+
		                                     //"b. No múltiplo de 5\\n"+
                                                     //"c. Mayor que 100\\n"+
                                                     //"d. Menor que 10.000\\n");

       
        int num=0;
        
        while (((num>10)&&(num<100))==false){
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
            
            if (((num>10)&&(num<100))==false){
                JOptionPane.showMessageDialog(null,"NUMERO NO CUMPLE CON LOS CRITERIOS");
                
            }
        
        }
       JOptionPane.showMessageDialog(null,"El NUMERO "+num+" ES MAYOR QUE 10 Y MENOR QUE 100"); 
    }
}
    
    