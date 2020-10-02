import javax.swing.*;
        

public class metodo_retorno {

   
    
    public int sumar(int num1, int num2){
        int suma=num1+num2;     
        return suma;     
    }
    
    public int restar(int num1, int num2){
        int resta=num1-num2;     
        return resta;     
    }
    
    public int multiplicar(int num1, int num2){
        int multiplicacion=num1*num2;     
        return multiplicacion;     
    }
    
    public int devidir(int num1, int num2){
        int division=num1/num2;     
        return division;     
    }
    
    public void mostrarresultado(int suma, int resta, int multiplicacion, int division){
    
    JOptionPane.showMessageDialog(null,"El resultado de la suma es "+suma);
    JOptionPane.showMessageDialog(null,"El resultado de la resta es "+resta);
    JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es "+multiplicacion);
    JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es "+division);
    
    }
}
