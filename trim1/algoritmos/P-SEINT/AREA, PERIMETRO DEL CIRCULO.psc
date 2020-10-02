Algoritmo CALCULADORA_DE_AREA
	escribir "presione una tecla";
	esperar Tecla;
	
	dimension logo[23];
	
	logo[1]=     "                                                        8888888888888888                                                                    ";
	logo[2]=     "                                                    88888888888888888888888                                                                 ";
	logo[3]=     "                                                 88888888888888888888888888888                                                              ";
	logo[4]=     "                                                A888888888888888888888888888888a                                                            ";
	logo[5]=     "                                              ,8888888888888888888888888888888888,                                                          ";
	logo[6]=     "                                             ,888888888888888888888888888888888888,                                                         ";
	logo[7]=     "                                            ,88888888888888888888888888888888888888                                                         ";
	logo[8]=     "                                            888888888888888888888888888888888888888,                                                        ";
	logo[9]=     "                                            888888888888888888888888888888888888888)                                                        ";
	logo[10]=    "                                            888888888888888888888888888888888888888)                                                        ";
	logo[11]=    "                                             8888888888888888888888888888888888888)                                                         ";
	logo[12]=    "                                              88888888888888888888888888888888888                                                           ";
	logo[13]=    "                                                V8888888888888888888888888888888                                                            ";
	logo[14]=    "                                                   888888888888888888888888888                                                              ";
	logo[15]=    "                                                     a888888888888888888888                                                                 ";
	logo[16]=    "                                                          8888888888888                                                                     ";
	logo[17]=    "                                                                                                                                            ";
	logo[18]=    " 11111111111        11       111       111111111   111   111   111             11      11111111111       1111       11111111        11      ";
	logo[19]=    " 111               1111      111       111         111   111   111            1111       111    111    111   11     111   111      1111     ";
	logo[20]=    " 111              11  11     111       111         111   111   111           11  11      111    111   111     111   111    111    11  11    ";
	logo[21]=    " 111             11    11    111       111         111   111   111          11    11     111    111   111      111  11111111     11    11   ";
	logo[22]=    " 111            1111111111   111       111         111   111   111         1111111111    111    111   111     111   1111111     1111111111  ";
	logo[23]=    " 11111111111   11        11  11111111  1111111111  111111111   11111111   11        11  1111111111      1111111     111   1111  11       11 ";
	Para i=1 hasta 23 hacer
		Borrar Pantalla;
		escribir  "";
	FinPara
	para i=1 hasta 23 Hacer
		Borrar Pantalla;
		para j=i hasta 23 Hacer
			escribir "";
		FinPara
		para j=1 hasta 23 Hacer
			escribir logo[j];
		FinPara
		
		si i=1 Entonces
			escribir "";
		FinSi
		
		esperar 100 milisegundos;
	FinPara
	
	
	
	
	Definir diametro, perimetro, area, radio Como Real;
	escribir "****CALCULADORA DE PERIMETRO, AREA Y RADIO DE UN CIRCULO*****";
	escribir "";
		escribir "ingrese ingrese el diametro expresado en centimetros";
		leer diametro	;
		area= ((diametro/2)^2)*PI;
		perimetro= diametro*PI;
		radio= diametro/2;
		Escribir "EL AREA DEL CIRCULO ES ", area, " cm2";
		escribir "EL PERIMETRO DEL CIRCULO ES ", perimetro, "  cm2";
		escribir "EL RADIO DEL CIRCULO ES ", radio, " Cms.";
		escribir "";
		escribir "";
		escribir "";
		escribir "Desea hacer otro calculo? SI/NO";
		leer pregunta;
		si pregunta="SI" entonces 
			Repetir
				escribir "";
				escribir "ingrese ingrese el diametro expresado en centimetros";
				leer diametro;	
				area= ((diametro/2)^2)*PI;
				perimetro= diametro*PI;
				radio= diametro/2;
				Escribir "EL AREA DEL CIRCULO ES ", area, " cm2";
				escribir "EL PERIMETRO DEL CIRCULO ES ", perimetro, "  cm2";
				escribir "EL RADIO DEL CIRCULO ES ", radio, " Cms.";
				escribir "";
				escribir "";
				escribir "";
				escribir "Desea hacer otro calculo?";
				leer pregunta;
			Hasta Que pregunta="NO"
			
		FinSi
		escribir "gracias por utilizar CALCULADORA DE CIRCULOS";
		escribir "FELIZ DIA1!!!!!!";
		
	
FinAlgoritmo
