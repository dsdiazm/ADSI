import javax.swing.*;

public class metodo_1 {
    
    int suma,resta,multiplicacion,division;

 
    public void sumar(int numero1, int numero2) {
        suma=numero1+numero2;
       
    }
    
    public void restar(int numero1, int numero2) {
        resta=numero1-numero2;
       
    }
    public void multiplicar(int numero1, int numero2) {
        multiplicacion=numero1*numero2;
    }
    
     
    public void dividir(int numero1, int numero2) {
        division=numero1/numero2;
    }
    
    public void mostrarresultado(){
    JOptionPane.showMessageDialog(null,"LA SUMA ES "+suma);
    JOptionPane.showMessageDialog(null,"LA RESTA ES "+resta);
    JOptionPane.showMessageDialog(null,"LA MULTIPLICACION "+multiplicacion);
    JOptionPane.showMessageDialog(null,"LA DIVISION ES "+division);
    
    }
    
}
