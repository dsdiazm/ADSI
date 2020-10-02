import javax.swing.*;


public class punto_9{
    public static void main(String []args){
        
        int cont=0, num=0, nummayor=0, nummenor=0, solc;
        
        
        solc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de solicitudes"));
        
        while(cont<solc) {
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            
        if (cont==0){
            
        
        nummayor=num;
        nummenor=num;                              
        }
        else {
             if (num > nummayor){
                    nummayor=num;
                }
             else{
                        if (num < nummenor){
                        nummenor=num;
                }       
                  }
              }
        
        cont=cont+1;
        }
        
        JOptionPane.showMessageDialog(null,"El numero mayor es "+nummayor);
        JOptionPane.showMessageDialog(null,"El numero menor es "+nummenor);
       

    }
}
    

        

