Algoritmo sin_titulo
	// programa: fundamentos de programacion//
	// nombre del archivo: problema pag 143//
	// descripcion: programa que calcula el dia 1 del mes actual gradoFinAlgoritmo//
	// autor: juan sebastian rodriguez castaño//
	// fecha: 3/6/23//
	// version: 1.0//
	//declaracion de variables
	DEFINIR d1 como entero
	definir dia1 Como CARACTER
	escribir "el dia 1 fue (L,M,X,J,V,S,D)"
	leer dia
	Segun dia Hacer
			
		    L:
				d=1
			M:
				d1=1
				
			X:
				d1=2
			J:
				d1=3
			V:
				d1=4
			s:
				d1=5
				
			D:
				d1=6 
	            //SINO
				d1= -40
	Fin Segun
	
	escribir "diga el dia"
	leer dia 
	dia=dia + d1
	
	segun dia MOD 7 hacer
		1:
			escribir "lunes"
		2:
			escribir "martes"
		3:
			escribir "miercoles"
		4:
			escribir "jueves"
		5:
			escribir "viernes"
		6:
			escribir "sabado"
		0:
			escribir "domingo"
	FinSegun

FinAlgoritmo
