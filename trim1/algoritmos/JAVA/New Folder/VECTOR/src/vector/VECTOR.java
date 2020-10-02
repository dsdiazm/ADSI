import javax.swing.*;



public class VECTOR {

   
    public static void main(String[] args) {
        int numero1[];
        
        numero1=new int [4];
        
        int numero2[]=new int [4];
        
        numero2[0]=1;
        numero2[1]=58;
        numero2[2]=60;
        numero2[3]=87;
        
        JOptionPane.showMessageDialog(null,"El vector en posicion es "+numero2[3]);
        
        JOptionPane.showMessageDialog(null,"************");
        JOptionPane.showMessageDialog(null,"recorrido del vector numero3");
                
        for (int i = 0; i<4;i++){
            JOptionPane.showMessageDialog(null,+numero2[i]); 
        }
            
        
        int[] numero3={20,80,50,60};
        
        
        JOptionPane.showMessageDialog(null,"************");
        JOptionPane.showMessageDialog(null,"recorrido del vector numero3");
        
        for (int i=0; i <numero3.length; i++) {
            JOptionPane.showConfirmDialog(null,numero3[i]);
        }
    
        JOptionPane.showMessageDialog(null, "******************");
        JOptionPane.showMessageDialog(null,"Vector de numero 1 al 100");
        
        int[] numero4=new int[100];
        for (int i =0; i < numero4.length; i++){
            numero4[i]=i+1;
            JOptionPane.showMessageDialog(null,numero4[i]);
        }
        JOptionPane.showMessageDialog(null,"************");
        JOptionPane.showMessageDialog(null,"suma y promedio de vector");
        double suma=0,promedio;
        for (int i=0; i<numero4.length; i++){
            numero4[i]=i+1;
            suma=suma+numero4[i];
          }
        promedio=suma/numero4.length;
        JOptionPane.showMessageDialog(null,"La suma del vector es "+suma);
        JOptionPane.showMessageDialog(null,"El promedio del vector es: "+promedio);
        
        
    }

    
}