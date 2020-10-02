import javax.swing.*;


public class Main{      
        public static void main(String[] args){    
        
        metodo_retorno objeto=new metodo_retorno(){
        
            int n1,n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
        
        
        int sum=objeto.sumar(n1, n2);
        int res=objeto.restar(n1, n2);
        int mul=objeto,multiplicar(n1, n2);
        
        }
        

