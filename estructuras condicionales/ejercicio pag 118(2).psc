Algoritmo sin_titulo
	// programa: fundamentos de programacion//
	// nombre del archivo: problema pag 118 (2)//
	// descripcion: programa que cdetermina el total a pagar por una llamada telefonica FinAlgoritmo//
	// autor: juan sebastian rodriguez castaño//
	// fecha: 2/27/23//
	// version: 1.0//
	// toda llamada que dure menos de tres minutos (cinco pasos) tiene un coste de 10 céntimos cada minuto adicional a partir de los tres primeros es un paso de contador y cuesta 5 céntimos.//
	Definir tiempo Como Entero
	// declaracion de variables
	Definir duracion,costo Como Real
	// area de entradas
	Escribir 'CALCULO DE COSTO DE LLAMADA'
	Escribir 'Introduzca la duracion de la llamada en minutos:'
	Leer duracion
	// area de procesos
	Si duracion<=3 Entonces
		costo <- 0.10
	SiNo
		costo <- 0.10+((duracion-3)*0.05)
	FinSi
	// area de salidas
	Escribir 'El costo de la llamada es de: ',costo,' pesos.'
FinAlgoritmo
