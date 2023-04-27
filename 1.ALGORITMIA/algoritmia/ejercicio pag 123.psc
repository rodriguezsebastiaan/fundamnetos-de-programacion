Algoritmo sin_titulo
	// programa: fundamentos de programacion//
	// nombre del archivo: problema pag 123//
	// descripcion: programa que acepte al escribir tres numeros enteros e imprima el mayo de ellos FinAlgoritmo//
	// autor: juan sebastian rodriguez castaño//
	// fecha: 2/26/23//
	// version: 1.0//
	// escribir un algoritmo que acepte tres numeros enteros e imprima el mayor de ellos //
	Definir a,b,c Como Entero
	Escribir 'ingresa 3 numeros '
	Leer a,b,c
	Si a>b Entonces
		Si a>c Entonces
			Escribir 'el numero ',a,'es el mayor de los tres '
		SiNo
			Escribir 'el numero',c,'es el mayor de los tres'
		FinSi
	SiNo
		Si b>c Entonces
			Escribir 'el numero ',b,'es el mayor de los tres'
		SiNo
			Escribir 'el numero',c,'es el mayor de los tres'
		FinSi
	FinSi
FinAlgoritmo
