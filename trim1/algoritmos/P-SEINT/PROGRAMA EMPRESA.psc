Algoritmo NOMINA
	DEFINIR hora, total, valorhora1, valorhora2, nivel, bono, dias Como Real;
	definir empleado, categoria Como Caracter;
	
	empleado= "";
	categoria="";
	hora= 0;
	total=0;
	valorhora1=50000;
	valorhora2=30000;
	bono=500000;
	nivel=0;
	dias=0;
	
		escribir "presione una tecla";
		esperar Tecla;
		
		dimension logo[8];
		
		logo[1]=     "///////NOMINA\\\\\\\\\\\";
		logo[2]=     "|                      |";
		logo[3]=     "|                      |";
		logo[4]=     "|    ELIGE UNA OPCION  |";
		logo[5]=     "|                      |";
		logo[6]=     "|    1- Nomina         |";
		logo[7]=     "|    2- Salir          |";
		logo[8]=     "------------------------";
		Para i=1 hasta 8 hacer
			Borrar Pantalla;
			escribir  "";
		FinPara
		para i=1 hasta 8 Hacer
			Borrar Pantalla;
			para j=i hasta 8 Hacer
				escribir "";
			FinPara
			para j=1 hasta 8 Hacer
				escribir logo[j];
			FinPara
			
			si i=1 Entonces
				escribir "";
			FinSi
			
			esperar 200 milisegundos;
		FinPara
		
	Leer a;
	Limpiar Pantalla;
	
	Si (a=1) Entonces
		escribir " INGRESA TU USUARIO";
		leer b;
		escribir " INGRESA TU CONTRASEÑA";
		leer c;
		Limpiar Pantalla;
		si b=="dsdiazm" y c== "1024494633" entonces
			escribir "******BIENVENIDO DARWIN DIAZ A NOMINA******";
			escribir "";
			escribir "ingrese nombre del empleado";
			leer empleado;
			escribir "ingrese categoria del empleado A, B o C";
			leer categoria;
			escribir "ingrese numero de horas";
			leer hora;
			escribir "ingrese nivel 1, 2, 3 o 4";
			leer nivel;
			
			Si (categoria=="B" y hora>=100 ) Entonces
				valorhora=valorhora1;
			SiNo
				valorhora=valorhora2;
			Fin Si
			
			Si (nivel==1 o nivel==2) Entonces
				bonificacion=bono;
			SiNo
				bonificacion=0;
			Fin Si
			
			total=hora*valorhora+bonificacion;
			dias=hora/8;
			
			escribir "el empleado ", empleado, " tiene un sueldo de: ", total ". $ y a laborado ", dias, "dias";
			escribir "";
			escribir "DESEA INGRESAR OTRO EMPLEADO SI/NO";
			leer pregunta;
			si (pregunta="SI") Entonces;
				Borrar Pantalla;
				repetir
				escribir"INGRESA NUEVO EMPLEADO";
				escribir "";
				escribir "ingrese nombre del empleado";
				leer empleado;
				escribir "ingrese categoria del empleado A, B o C";
				leer categoria;
				escribir "ingrese numero de horas";
				leer hora;
				escribir "ingrese nivel 1, 2, 3 o 4";
				leer nivel;
				
				Si (categoria=="B" y hora>=100 ) Entonces
					valorhora=valorhora1;
				SiNo
					valorhora=valorhora2;
				Fin Si
				
				Si (nivel==1 o nivel==2) Entonces
					bonificacion=bono;
				SiNo
					bonificacion=0;
				Fin Si
				
				total=hora*valorhora+bonificacion;
				dias=hora/8;
				
				escribir "el empleado ", empleado, " tiene un sueldo de: ", total ". $ y a laborado ", dias, "dias";
				escribir "";
				escribir "DESEA INGRESAR OTRO EMPLEADO SI/NO";
				leer pregunta;
				
			Hasta Que pregunta="NO";
				
			FinSi
			
		SiNo
			escribir "USUARIO O CONTRASEÑA INVALIDA";
			repetir
			Si (a==1) Entonces
				escribir " INGRESA TU USUARIO";
				leer b;
				escribir " INGRESA TU CONTRASEÑA";
				leer c;
				limpiar pantalla;
				si b="dsdiazm" & c= "1024494633" entonces
					escribir "******BIENVENIDO DARWIN DIAZ A NOMINA******";
					escribir "";
					escribir "ingrese nombre del empleado";
					leer empleado;
					escribir "ingrese categoria del empleado A, B o C";
					leer categoria;
					escribir "ingrese numero de horas";
					leer hora;
					escribir "ingrese nivel 1, 2, 3 o 4";
					leer nivel;
					
					Si (categoria=="B" y hora>=100 ) Entonces
						valorhora=valorhora1;
					SiNo
						valorhora=valorhora2;
					Fin Si
					
					Si (nivel==1 o nivel==2) Entonces
						bonificacion=bono;
					SiNo
						bonificacion=0;
					Fin Si
					
					total=hora*valorhora+bonificacion;
					dias=hora/8;
					
					escribir "el empleado ", empleado, " tiene un sueldo de: ", total ". $ y a laborado ", dias, "dias";
					escribir "";
					escribir "DESEA INGRESAR OTRO EMPLEADO SI/NO";
					leer pregunta;
					si (pregunta=="SI") Entonces;
						Borrar Pantalla;
						repetir
							escribir"INGRESA NUEVO EMPLEADO";
							escribir "";
							escribir "ingrese nombre del empleado";
							leer empleado;
							escribir "ingrese categoria del empleado A, B o C";
							leer categoria;
							escribir "ingrese numero de horas";
							leer hora;
							escribir "ingrese nivel 1, 2, 3 o 4";
							leer nivel;
							
							Si (categoria=="B" y hora>=100 ) Entonces
								valorhora=valorhora1;
							SiNo
								valorhora=valorhora2;
							Fin Si
							
							Si (nivel==1 o nivel==2) Entonces
								bonificacion=bono;
							SiNo
								bonificacion=0;
							Fin Si
							
							total=hora*valorhora+bonificacion;
							dias=hora/8;
							
							escribir "el empleado ", empleado, " tiene un sueldo de: ", total ". $ y a laborado ", dias, "dias";
							
						Hasta Que pregunta=="NO";
						
					FinSi
					
				SiNo
					escribir "USUARIO O CONTRASEÑA INVALIDA";
					
					
				FinSi
				
				
			Fin Si
		Hasta Que b=="salir" & c=="salir"
		escribir "GRACIAS POR UTILIZAR NOMINA";
		FinSi
		
	Fin Si
	si (a=2) entonces 
		escribir "GRACIAS POR UTILIZAR NOMINA";
		
	
	FinSi
		
FinAlgoritmo

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

