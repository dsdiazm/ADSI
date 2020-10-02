
package vector;


public class Vector_4 {

    
    public static void main(String[] args) {
        int vectorViejo[]={30,90,70};
        
        int vectorNuevo[]=new int[vectorViejo.length];
        
        
        for (int i = 0; i <vectorViejo.length; i++){
            vectorNuevo[i]=vectorViejo[i];
        }
                      
        System.out.println("Se lista el vector nuevo");
        for (int i = 0; i <vectorNuevo.length; i++){
            System.out.println(vectorNuevo[i]);
        
        }
    
    }
    
}
