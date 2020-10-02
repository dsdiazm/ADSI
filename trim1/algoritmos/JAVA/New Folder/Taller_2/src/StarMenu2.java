import javax.swing.*;


public class StarMenu2 {
    
    public static void punto_1() {
                
         JOptionPane.showMessageDialog(null,"SELECCIONASTE EL EJERCICIO 1\n"+
                                                     "ENUNCIADO 1\n"+
                                                     "En una tienda de descuento se efectúa una promoción en la cual se hace un\n"+
                                                    "descuento sobre el valor de la compra total según el color de la bolita que el\n"+
                                                    "cliente saque al pagar en la caja. Si la bolita es de color blanco no se le hará\n"+
                                                    "descuento alguno, si es verde se le hará un 10% de descuento, si es amarilla un\n"+
                                                    "25%, si es azul un 50% y si es roja un 100%. Determinar la cantidad final que el\n"+
                                                    "cliente deberá pagar por su compra se sabe que solo hay bolitas de los colores\n"+
                                                                                            "mencionados.\n");
        
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
     
     public static void punto_2() {
         
         JOptionPane.showMessageDialog(null,"SELECCIONASTE EL EJERCICIO 2\n"+
                                                     "ENUNCIADO 2\n"+
                                                     " En una llantera se ha establecido una promoción de la siguiente manera: \n"+
                                                    " Si se compran menos de cinco llantas el precio es de $300 cada una, \n"+
                                                    ": de $250 si se compran de cinco a 10 y de $200 si se compran más de 10. \n"+
                                                    " Obtener la el valor a pagar por llanta y la que tiene que pagar por el total de la compra \n");

    
         JOptionPane.showMessageDialog(null,"BIENVENIDOS A CALCULADORA DE PRECIO");
        
        
        int precio1,precio2, precio3,n_llanta;
        precio1=200;
        precio2=250;
        precio3=300;
             
        
        
        n_llanta=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE LLANTAS"));      
        
        
         
        if (n_llanta >=1 && n_llanta<5)
             {JOptionPane.showMessageDialog(null,"EL PRECIO POR LLANTA ES DE 300");
              JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+precio3*n_llanta);
             }
        
        if (n_llanta >=5 && n_llanta<=10)
             {JOptionPane.showMessageDialog(null,"EL PRECIO POR LLANTA ES DE 250");
              JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+precio2*n_llanta);
             }      
         if (n_llanta >10)
             {JOptionPane.showMessageDialog(null,"EL PRECIO POR LLANTA ES DE 200");
              JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL A PAGAR ES "+precio1*n_llanta);
             }                 
        
        
                    
        }
     
     
     public static void punto_3(){
        
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
     
     public static void punto_4() {
    
        JOptionPane.showMessageDialog(null,"SELECCIONASTE EL EJERCICIO 4\n"+
                                                     "ENUNCIADO 4\n"+
                                                     " Una frutería ofrece las manzanas con descuento según la TABLA ESTABLECIDA EN EL TALLER:\n");
         
        
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
 
     
      public static void punto_5() {
        
         JOptionPane.showMessageDialog(null,"SELECCIONASTE EL EJERCICIO 5\n"+
                                                     "ENUNCIADO 5\n"+
                                                     "Ingrese un numero diga si es o no par\n");

          
          int numero;
      
        
        
                
        numero=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO"));      
                
         
        if (numero%2==0){
            JOptionPane.showMessageDialog(null,"EL NUMERO ES PAR ");
             }
        else {
        JOptionPane.showMessageDialog(null,"EL NUMERO ES IMPAR ");
        }
     
        
        
 
        
    }
      
     
    
    public static void punto_6() {
        
        JOptionPane.showMessageDialog(null,"SELECCIONASTE EL EJERCICIO 6\n"+
                                                     "ENUNCIADO 6\n"+
                                                     " Diga si un numero ingresado por el usuario es divisible por 3\n");

        
    int numero;
      
        
        
                
        numero=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO"));      
                
         
        if (numero%3==0){
            JOptionPane.showMessageDialog(null,"EL NUMERO ES DIVISIBLE POR 3 ");
             }
        else {
        JOptionPane.showMessageDialog(null,"EL NUMERO NO ES DIVISIBLE POR 3 ");
        }
     
        
        
 
        
    }
    
    public static void punto_7() {
        
        JOptionPane.showMessageDialog(null,"SELECCIONASTE EL EJERCICIO 7\n"+
                                                     "ENUNCIADO 7\n"+
                                                     " Diseñe un algoritmo que lea números enteros hasta que encuentre uno que\n"+
                                                     "cumpla las siguientes condiciones:\n"+
                                                     "a. Múltiplo de 2\\n"+
		                                     "b. No múltiplo de 5\\n"+
                                                     "c. Mayor que 100\\n"+
                                                     "d. Menor que 10.000\\n");

       
        int numb2=1;
        
        while (((numb2%2==0)&&(!(numb2%5==0))&&(numb2>100)&&(numb2<10000))==false){
            numb2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
            
            if (((numb2%2==0)&&(!(numb2%5==0))&&((numb2>100))&&(numb2<10000))==false){
                JOptionPane.showMessageDialog(null,"NUMERO NO CUMPLE CON LOS CRITERIOS");
                
            }
        
        }
       JOptionPane.showMessageDialog(null,"NUMERO CUMPLE CON LOS CRITERIOS"); 
    }
    
    public static void punto_8() {
        
         JOptionPane.showMessageDialog(null,"SELECCIONASTE EL EJERCICIO 8\n"+
                                                     "ENUNCIADO 8\n"+
                                                     "Leer cantidad indeterminada de números enteros\n"+
                                                     "positivos e imprima el promedio de todos los números.\n"+
                                                     "El algoritmo termina cuando se ingrese un numero múltiplo de 6\n");
       
        int num = 0, acumulador=0, suma=0;
        float promedio;
        boolean sw=true;
        
        
        while (sw){
             num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
                                     
            sw=((num>0)&&(!(num%6==0)));
            suma+=num;
            acumulador++;
            
            if (num>0){
                JOptionPane.showMessageDialog(null,"El numero "+num+" es positivo");
             
        }          
    }
        promedio=(float)suma/acumulador;
        
        JOptionPane.showMessageDialog(null,"El numero "+num+" es multiplo de 6");
        JOptionPane.showMessageDialog(null,"El promedio es "+promedio);
        
        
        
    }
    
    public static void punto_9() {
        
        JOptionPane.showMessageDialog(null,"SELECCIONASTE EL EJERCICIO 9\n"+
                                                    "ENUNCIADO 9\n"+
                                                    " Escriba un algoritmo que lea n números reales y muestre el número que es menor\n"+
                                                    "y el número que es mayor\n");
                                                     
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
   public static void punto_10() {
        
        JOptionPane.showMessageDialog(null,"SELECCIONASTE EL EJERCICIO 10\n"+
                                                    "ENUNCIADO 10\n"+
                                                    "Ingresa números del 1 al 100, hasta encontrar algún número mayor que 10.\n");
       
        int num=0;
        
        while (((num>10)&&(num<100))==false){
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
            
            if (((num>10)&&(num<100))==false){
                JOptionPane.showMessageDialog(null,"NUMERO NO CUMPLE CON LOS CRITERIOS");
                
            }
        
        }
       JOptionPane.showMessageDialog(null,"El NUMERO "+num+" ES MAYOR QUE 10 Y MENOR QUE 100"); 
    }
   
   public static void punto_11(){
       
       JOptionPane.showMessageDialog(null,"SELECCIONASTE EL EJERCICIO 11\n"+
                                                     "ENUNCIADO 11\n"+
                                                     "Diseñe un algoritmo que lea los nombres y las notas de n estudiantes y muestre: \n"+
                                                     "a) La cantidad de estudiantes ganaron.\n"+
                                                     "b) El porcentaje de estudiantes que perdieron\n"+
                                                     "c) El nombre del estudiante con la nota más alta\n"+
                                                     "d) La nota más alta.\n"+
                                                     "e) La nota más baja.\n"+
                                                     "f) La nota promedio de los estudiantes que ganaron.\n"+
                                                     "g) ¿Cuántos estudiantes obtuvieron la nota más alta?\n"+
                                                     "h) ¿Cuáles estudiantes obtuvieron la nota más alta, nota más alta 5?\n");
       
       int numero = 0;
    int ganaron_estudiantes = 0;
    int ganaron_bien = 0;
    int perdieron_estudiantes = 0;
    String nombres_estudianterebien = "";
    float nota_estudianterebien = 0;
    double promedionotas=0;
    int numero_estudiantesrebien=0;
    float nota_estudianteremal = 5;
    int numero_estudiantesremal=0;
    
    //Texto de presentacion
    JOptionPane.showMessageDialog(null,"Bienvenido al sistema de computo de notas.");

    //Parametros  de  control  en caso de error
    int okdata = 0;

    //Ciclo  de  validacion de datos
    while (okdata == 0) {
	//Uso  del try catch
	    try {
	        numero=Integer.parseInt(JOptionPane.showInputDialog("Porfavor  ingrese el numero  de estudiantes:"));
	        //lectura de numero de estudiantes
	        if (numero <= 0) {
                    Object enunciado="ERROR";
	            JOptionPane.showMessageDialog(null,enunciado,"El dato ingresado no es valido, numero de estudiastes debe ser superior a 0.",JOptionPane.ERROR_MESSAGE);
	        } else {
	            okdata = 1;
	        } //Permite continuar al siguiente paso
	    } catch (Exception e) {
	        // En caso de error muestra  el texto
                Object enunciado="ERROR";
	        JOptionPane.showMessageDialog (null,enunciado,"El  dato ingresado no es valido.",JOptionPane.ERROR_MESSAGE);
	        //Paso innesesario no cambia el valor y retorna al inicio
	        okdata = 0;		
	    }
    }

    //lectura de datos
    //Array de nombre de estudiantes
    String nombres_estudiantes[] = new String[numero];
    //Arrayrray  de notas
    float notas_estudiantes[] = new float[numero];

    for (int i = 0; i < numero; i = i + 1) {
        nombres_estudiantes[i] =JOptionPane.showInputDialog("Indique  el nombre de estudiante numero " + (i+1) + ":");
	     okdata = 0;
	    //Ciclo  de  validacion de datos
	    while (okdata == 0) {
	    //Uso del try catch 
	    try {
	        notas_estudiantes[i]=Float.parseFloat(JOptionPane.showInputDialog("Indique  la nota del estudiante numero " + (i+1) + ":"));
	        //lectura de la nota del estudiante
	        if (notas_estudiantes[i] >= 0 && notas_estudiantes[i] <= 5) {
	            //Permite  continuar al siguiente pso
		        okdata = 1;
                if (notas_estudiantes[i] >= 3) {
		            ganaron_estudiantes = ganaron_estudiantes + 1;
		            promedionotas=notas_estudiantes[i]+promedionotas;
                }
		    if(notas_estudiantes[i]<3) {
                perdieron_estudiantes = perdieron_estudiantes + 1;
		    }
		    if (notas_estudiantes[i] == 5) {
		        ganaron_bien = ganaron_bien + 1;
		    }
		    if (notas_estudiantes[i] == nota_estudianterebien) {
                numero_estudiantesrebien=numero_estudiantesrebien+1;
		        nombres_estudianterebien =nombres_estudianterebien + ", " + nombres_estudiantes[i];
		    } else {
		        if (notas_estudiantes[i] > nota_estudianterebien) {
			        nombres_estudianterebien = nombres_estudiantes[i];
			        nota_estudianterebien = notas_estudiantes[i];
			        numero_estudiantesrebien=1;
		        }
		    }
            if (notas_estudiantes[i] < nota_estudianteremal) {
                nota_estudianteremal = notas_estudiantes[i];
			    numero_estudiantesremal=1;
			}
		} else {
		    JOptionPane.showMessageDialog(null,"La nota ingresada esta fuera del rango, porfavor ingrese una nota entre (0 y 5).");
		}} catch (Exception e) {
		    //En caso de error muestra  el texto
                    Object enunciado="ERROR";
	        JOptionPane.showConfirmDialog(null,enunciado,"El dato ingresado no es valido.",JOptionPane.ERROR_MESSAGE);
	        //Paso innesesario no cambia el valor y  retorna al inicio
	        okdata = 0;
	    }
	  }
    }
    
    double porsentaje_perdido=(perdieron_estudiantes*100)/numero;
    promedionotas=promedionotas/ganaron_estudiantes;
    String n9 = System.getProperty("line.separator");
    JOptionPane.showMessageDialog(null,"Numero de estudiantes que aprobaron el curso: " + ganaron_estudiantes + "."+ n9 + "El porcentaje de perdida en el curso es del: " + porsentaje_perdido + "%." + n9 + "El promedio en notas de los estudiantes que aprobaron fue de " + promedionotas + "."+ n9 +"Total de estudiantes con la nota mas alta: " + numero_estudiantesrebien + " : " + nombres_estudianterebien + ". con una nota de " + nota_estudianterebien + ".");
        
    if(nota_estudianterebien == 5) {
        JOptionPane.showMessageDialog(null,"Dichos estudiantes tambien alcanzaron la maxima nota.");
    } else {
        JOptionPane.showMessageDialog(null,"Ningun estudiante alcanzo la nota maxima.");
    }
    JOptionPane.showMessageDialog(null,"La nota mas baja  fue de " + nota_estudianteremal + ".");    
         
        }
     
}
