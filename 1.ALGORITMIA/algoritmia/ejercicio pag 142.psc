Algoritmo sin_titulo
	// programa: fundamentos de programacion//
	// nombre del archivo: problema pag 142//
	// descripcion: programa que calcula el dia de la semana gradoFinAlgoritmo//
	// autor: juan sebastian rodriguez castaño//
	// fecha: 3/6/23//
	// version: 1.0//
	Definir fecha Como Cadena
	Escribir 'INTRODUCE UNA FECHA (DD/MM/AAAA)....' Sin Saltar;
	Leer fecha
	definir año Como Real
	escribir "diga el año"
	leer año
	definir mes como real 
	escribir "diga el mes"
	leer mes 
	definir dia como real 
	escribir "diga el dia "
	leer dia 
	Segun dia MOD 7 Hacer
		1:
			escribir "lunes"
		2:
			escribir "martes"
			
		3:
			escribir "miercoles"
			
	    4:
			escribir"jueves "
			
		5:
			escribir "viernes "
			
		6:
			escribir "sabado"
			
		0:
			escribir "domingo"
			
		
	Fin Segun
	
FinAlgoritmo
